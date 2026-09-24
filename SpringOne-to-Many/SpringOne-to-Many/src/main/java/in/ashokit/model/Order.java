package in.ashokit.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

// Child entity
@Entity
@Table(name="order")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    @Id
    private Long id;

    private LocalDate orderDate;

    private String status;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

}