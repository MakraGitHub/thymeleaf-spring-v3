package co.prime.thymeleaf.service.impl;

import co.prime.thymeleaf.model.Product;
import co.prime.thymeleaf.repository.ProductRepository;
import co.prime.thymeleaf.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

     private final ProductRepository productRepository;
    @Override
    public void addNewProduct(Product product) {
        //Define your business login
        //TODO:
        product.setCreatedAt(LocalDateTime.now());
        productRepository.insert(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.select();
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id);
    }

    @Override
    public void updateProductId(Integer id, Product newProduct) {
        productRepository.updateProductId(id, newProduct);
    }

    @Override
    public void deletedProductId(Integer id) {
      productRepository.deletedProductId(id);
    }
}
