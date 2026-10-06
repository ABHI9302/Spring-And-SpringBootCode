package in.ashokit.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Order {
    @Id
    private Long id;

    private LocalDate orderDate;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
