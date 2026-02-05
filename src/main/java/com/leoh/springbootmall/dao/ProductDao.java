package com.leoh.springbootmall.dao;

import com.leoh.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
