package co.prime.thymeleaf.repository;

import co.prime.thymeleaf.model.Product;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ProductRepository {

    //Insert new Product
    @Insert("insert into products(code, name, description, created_at) " +
    "values (#{pro.code}, #{pro.name}, #{pro.description}, #{pro.createdAt})")
    void insert(@Param("pro") Product product);

    //Selected all product in stock
    @Select("select *from products where status =true")
    @Result(column = "created_at",property = "createdAt")
    List<Product> select();

    //Selected productById
    @Select("select from products where id =#{id}")
    Product findById(@Param("id") Integer id);

    //Update ProductByid
    @Update("update prouducts set code =#{p.code},name =#{p.name},description=#{p.description}," +
            " created_at =#{p.createdAt} where id =#{id}")
    void  updateProductId(@Param("id")Integer id, @Param("p") Product newProduct);

    //Delete ProductById
    @Delete("delete from products where id =#{id}")
    void deletedProductId(@Param("id") Integer id);

}
