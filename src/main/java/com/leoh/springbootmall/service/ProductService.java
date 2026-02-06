package com.leoh.springbootmall.service;

import com.leoh.springbootmall.dto.ProductRequest;
import com.leoh.springbootmall.model.Product;
import jakarta.validation.Valid;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);

}
