package in.ashokti.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String  id;

    private  String  name ;
    private  Double price;

}
