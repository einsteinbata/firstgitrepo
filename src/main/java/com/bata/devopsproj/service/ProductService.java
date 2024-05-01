package com.bata.devopsproj.service;

import com.bata.devopsproj.model.Product;

import java.util.List;

public interface ProductService {
    public Product getProductById(Long prodId);
    public List<Product> getAllProducts();
}
