package co.prime.thymeleaf.service;

import co.prime.thymeleaf.model.Product;
import java.util.List;

public interface ProductService {

    void addNewProduct(Product product);
    List<Product> findAll();

     Product findById(Integer id);
     void updateProductId(Integer id, Product newProduct);
     void deletedProductId(Integer id);
}
