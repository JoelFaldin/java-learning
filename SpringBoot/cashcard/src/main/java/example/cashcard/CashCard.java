
package example.cashcard;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

public record CashCard (@Id @Column("ID") Long id, Double amount) {

}
