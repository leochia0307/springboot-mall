package com.leoh.springbootmall.dao;

import com.leoh.springbootmall.dto.ProductRequest;
import com.leoh.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
