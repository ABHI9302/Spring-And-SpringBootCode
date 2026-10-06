package in.ashokti.repository;

import in.ashokti.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, String > {


}
