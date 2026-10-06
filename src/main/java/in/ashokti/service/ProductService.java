package in.ashokti.service;

import in.ashokti.model.Product;
import in.ashokti.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository repository;
    public ProductService(ProductRepository repository){
        this.repository= repository;
    }
    public Product saveProduct (Product product ) {

        return repository.save(product);


    }
    public Product fetchProduct(String id){
        return repository.findById(id).orElse(null);

    }

}