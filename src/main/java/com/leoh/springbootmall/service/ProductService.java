package com.leoh.springbootmall.service;

import com.leoh.springbootmall.dto.ProductRequest;
import com.leoh.springbootmall.model.Product;
import jakarta.validation.Valid;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
