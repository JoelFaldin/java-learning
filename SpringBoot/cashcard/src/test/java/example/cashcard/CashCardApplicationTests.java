package example.cashcard;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import java.net.URI;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class CashCardApplicationTests {

  @Autowired
  TestRestTemplate restTemplate;

	@Test
	void shouldReturnACashCardWhenDataIsSaved() {
    ResponseEntity<String> response = restTemplate
      .withBasicAuth("jowel", "abc123")
      .getForEntity("/cashcards/99", String.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

    DocumentContext documentContext = JsonPath.parse(response.getBody());
    Number id = documentContext.read("$.id");

    assertThat(id).isEqualTo(99);

    Double amount = documentContext.read("$.amount");
    assertThat(amount).isEqualTo(123.45);
	}

  @Test
  void shouldNotReturnACashCardWithAnUnknownId() {
    ResponseEntity<String> response = restTemplate
      .withBasicAuth("jowel", "abc123")
      .getForEntity("/cashcards/1000", String.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    assertThat(response.getBody()).isBlank();
  }

  @Test
  void shouldCreateANewCashCard() {
    CashCard newCashCard = new CashCard(null, 250.00, "jowel");

    ResponseEntity<Void> createResponse = restTemplate
      .withBasicAuth("jowel", "abc123")
      .postForEntity("/cashcards", newCashCard, Void.class);

    assertThat(createResponse.getStatusCode()).isEqualTo(HttpStatus.CREATED);

    URI locationOfNewCashCard = createResponse.getHeaders().getLocation();
    ResponseEntity<String> getResponse = restTemplate
      .withBasicAuth("jowel", "abc123")
      .getForEntity(locationOfNewCashCard, String.class);
    assertThat(getResponse.getStatusCode()).isEqualTo(HttpStatus.OK);

    DocumentContext documentContext = JsonPath.parse(getResponse.getBody());

    Number id = documentContext.read("$.id");
    Double amount = documentContext.read("$.amount");

    assertThat(id).isNotNull();
    assertThat(amount).isEqualTo(250.00);
  }

  @Test
  void shouldReturnAllCashCardsWhenListIsRequired() {
    ResponseEntity<String> response = restTemplate
      .withBasicAuth("jowel", "abc123")
      .getForEntity("/cashcards", String.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

    DocumentContext documentContext = JsonPath.parse(response.getBody());
    int cashCardCount = documentContext.read("$.length()");
    assertThat(cashCardCount).isEqualTo(3);

    JSONArray ids = documentContext.read("$..id");
    assertThat(ids).containsExactlyInAnyOrder(99, 100, 101);

    JSONArray amounts = documentContext.read("$..amount");
    assertThat(amounts).containsExactlyInAnyOrder(123.45, 1.00, 150.00);
  }

  @Test
  void shouldReturnAPageOfCashCards() {
    ResponseEntity<String> response = restTemplate
      .withBasicAuth("jowel", "abc123")
      .getForEntity("/cashcards?page=0&size=1", String.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

    DocumentContext documentContext = JsonPath.parse(response.getBody());
    JSONArray page = documentContext.read("$[*]");
    assertThat(page.size()).isEqualTo(1);
  }

  @Test
  void shouldReturnASortedPageOfCashCards() {
    ResponseEntity<String> response = restTemplate
      .withBasicAuth("jowel", "abc123")
      .getForEntity("/cashcards?page=0&size=1&sort=amount,desc", String.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

    DocumentContext documentContext = JsonPath.parse(response.getBody());
    JSONArray read = documentContext.read("$[*]");
    assertThat(read.size()).isEqualTo(1);

    double amount = documentContext.read("$[0].amount");
    assertThat(amount).isEqualTo(150.00);
  }

  @Test
  void shouldReturnASortedPageOfCashCardsWithNoParametersAndUseDefaultValues() {
    ResponseEntity<String> response = restTemplate
      .withBasicAuth("jowel", "abc123")
      .getForEntity("/cashcards?", String.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

    DocumentContext documentContext = JsonPath.parse(response.getBody());

    JSONArray page = documentContext.read("$[*]");
    assertThat(page.size()).isEqualTo(3);

    JSONArray amounts = documentContext.read("$..amount");
    assertThat(amounts).containsExactly(1.00, 123.45, 150.00);
  }

  @Test
  void shuldNotReturnACashCardWhenUsingBadCredentials() {
    ResponseEntity<String> response = restTemplate
      .withBasicAuth("bad-user", "abc123")
      .getForEntity("/cashcards/99", String.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);

    response = restTemplate
      .withBasicAuth("jowel", "bad-password")
      .getForEntity("/cashcards/99", String.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);
  }

  @Test
  void shouldRejectUsersWhoAreNotCardOwners() {
    ResponseEntity<String> response = restTemplate
      .withBasicAuth("hank-owns-no-cards", "qrs456")
      .getForEntity("/cashcards/99", String.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.FORBIDDEN);
  }

  @Test
  void shouldNotAllowAccessToCashCardsTheyDoNotOwn() {
    ResponseEntity<String> response = restTemplate
      .withBasicAuth("jowel", "abc123")
      .getForEntity("/cashcards/102", String.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
  }

  @Test
  void shouldUpdateAnExistingCashCard() {
    CashCard cashCardUpdate = new CashCard(null, 19.99, null);

     HttpEntity<CashCard> request = new HttpEntity(cashCardUpdate);
     ResponseEntity<Void> response = restTemplate
       .withBasicAuth("jowel", "abc123")
       .exchange("/cashcards/99", HttpMethod.PUT, request, Void.class);

     assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);
   }

  @Test
  void shouldNotUpdateACashCardThatDoesNotExists() {
    CashCard unknownCard = new CashCard(null, 19.99, null);
    HttpEntity<CashCard> request = new HttpEntity<>(unknownCard);

    ResponseEntity<Void> response = restTemplate
      .withBasicAuth("jowel", "abc123")
      .exchange("/cashcards/9999", HttpMethod.PUT, request, Void.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
  }

  @Test
  void shouldNotUpdateACashCardOwnedBySomeoneElse() {
    CashCard bocchisCard = new CashCard(null, 333.33, null);
    HttpEntity<CashCard> request = new HttpEntity<>(bocchisCard);

    ResponseEntity<Void> response = restTemplate
      .withBasicAuth("jowel", "abc123")
      .exchange("/cashcards/102", HttpMethod.PUT, request, Void.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
  }

  @Test
  void shouldDeleteAnExistingCashCard() {
    ResponseEntity<Void> response = restTemplate
      .withBasicAuth("jowel", "abc123")
      .exchange("/cashcards/99", HttpMethod.DELETE, null, Void.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);

    ResponseEntity<String> getResponse = restTemplate
      .withBasicAuth("jowel", "abc123")
      .getForEntity("/cashcards/99", String.class);

    assertThat(getResponse.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
  }

  @Test
  void shouldNotDeleteACashCardThatDoesNotExists() {
    ResponseEntity<Void> response = restTemplate
      .withBasicAuth("jowel", "abc123")
      .exchange("/cashcards/99999", HttpMethod.DELETE, null, Void.class);

    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
  }

  @Test
  void shouldNotAllowDeletionOnCashCardsTheyDoNotOwn() {
    ResponseEntity<Void> deleteResponse = restTemplate
      .withBasicAuth("jowel", "abc123")
      .exchange("/cashcards/102", HttpMethod.DELETE, null, Void.class);

    assertThat(deleteResponse.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);

    ResponseEntity<String> getResponse = restTemplate
      .withBasicAuth("bocchi", "xyz789")
      .getForEntity("/cashcards/102", String.class);

    assertThat(getResponse.getStatusCode()).isEqualTo(HttpStatus.OK);
  }
}
