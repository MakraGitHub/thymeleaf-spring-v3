package co.prime.thymeleaf.controller;

import co.prime.thymeleaf.model.Product;
import co.prime.thymeleaf.service.impl.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private final ProductServiceImpl productServiceImpl;

    @GetMapping("/product")
    public String requestProductView(){

//        Product product = new Product();
//        product.setCode("Pro001");
//        product.setName("Mouse Dell");
//        product.setDescription("Officer");
//
//        //Call service
//        productServiceImpl.addNewProduct(product);

        List<Product> products = productServiceImpl.findAll();
         log.info("{} = {} " ,"Result",products);

        return "page/product";
    }
    @GetMapping("/product/{id}")
    public String requestProductById(@PathVariable Integer id){
         productServiceImpl.findById(id);
         log.info("{} = {}","ResultID",id);
         return "page/product";
    }

    @PutMapping("/updated/{id}")
    public String requestUpdatedById(@PathVariable Integer id,
                                                @RequestBody Product newProduct){
        productServiceImpl.updateProductId(id, newProduct);
        return "page/product";

    }
    @DeleteMapping("/delete/{id}")
    public String requestDeletedId(@PathVariable Integer id){
       productServiceImpl.deletedProductId(id);
       log.info("{} = {}","Result",id);
       return "page/product";
    }

}
