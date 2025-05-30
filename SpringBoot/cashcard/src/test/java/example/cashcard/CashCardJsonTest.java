package example.cashcard;


import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

@JsonTest
class CashCardJsonTest {

    @Autowired
    private JacksonTester<CashCard> json;

    @Autowired
    private JacksonTester<CashCard[]> jsonList;

    private CashCard[] cashCards;

    @BeforeEach
    void setUp() {
      cashCards = Arrays.array(
        new CashCard(99L, 123.45, "jowel"),
        new CashCard(100L, 1.00, "jowel"),
        new CashCard(101L, 150.00, "jowel")
        );
    }

    @Test
    void cashCardSerializationTest() throws IOException {
      CashCard cashCard = new CashCard(99L, 123.45, "jowel");

      assertThat(json.write(cashCard)).isStrictlyEqualToJson("expected.json");
      assertThat(json.write(cashCard)).hasJsonPathNumberValue("@.id");
      assertThat(json.write(cashCard)).extractingJsonPathNumberValue("@.id")
        .isEqualTo(99);
      assertThat(json.write(cashCard)).hasJsonPathNumberValue("@.amount");
      assertThat(json.write(cashCard)).extractingJsonPathNumberValue("@.amount")
        .isEqualTo(123.45);
    }

    @Test
    void cashCardDeserializationTest() throws IOException {
      String expected = """
        {
          "id":99,
          "amount":123.45,
          "owner":"jowel"
        }
      """;

      assertThat(json.parse(expected))
        .isEqualTo(new CashCard(99L, 123.45, "jowel"));
      assertThat(json.parseObject(expected).id()).isEqualTo(99);
      assertThat(json.parseObject(expected).amount()).isEqualTo(123.45);
    }

    @Test
    void cashCardListSerializationTest() throws IOException {
      assertThat(jsonList.write(cashCards)).isStrictlyEqualToJson("list.json");
    }

    @Test
void cashCardListDeserializationTest() throws IOException {
  String expected="""
    [
      { "id": 99, "amount": 123.45, "owner":"jowel" },
      { "id": 100, "amount": 1.00, "owner":"jowel" },
      { "id": 101, "amount": 150.00, "owner":"jowel" }
    ]
    """;
  assertThat(jsonList.parse(expected)).isEqualTo(cashCards);
}
}
