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
@NamedQuery(name = "Order.fetchByAmountAndStatus",
        query = "select o from Order o where o.status = :status and o.amount > :amount")
@NamedNativeQuery(
        name="Order.fetchAllOrders",
        query = "select * from orders",
        resultClass = Order.class
)
public class Order {
    @Id
    private Long id;

    private LocalDate orderDate;

    private Double amount;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}