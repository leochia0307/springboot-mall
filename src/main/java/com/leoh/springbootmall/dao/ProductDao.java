package com.leoh.springbootmall.dao;

import com.leoh.springbootmall.dto.ProductRequest;
import com.leoh.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
