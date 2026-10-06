package in.ashokti.controller;

import in.ashokti.model.Product;
import in.ashokti.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductRestController {
    private ProductService service;
    public  ProductRestController(ProductService  service){
        this.service= service;
    }
    @PostMapping(value="/save")
    public ResponseEntity<Product> storeProduct(@RequestBody Product product){
        Product productFromService= service.saveProduct(product);
       return new ResponseEntity<>(productFromService, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<Product> getProductById(@PathVariable String id){
        Product productFromService = service.fetchProduct(id);
        if(productFromService!=null)
            return new ResponseEntity<>(productFromService,HttpStatus.OK);
else
    return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }


}
