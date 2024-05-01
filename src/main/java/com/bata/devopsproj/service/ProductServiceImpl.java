package com.bata.devopsproj.service;

import com.bata.devopsproj.model.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.*;

@Service
public class ProductServiceImpl implements ProductService {

    private Map<Long,Product> products;

    //Mock Data
    @PostConstruct
    public void init(){
        products = new HashMap<>();

        products.put(1L, new Product(1L, "Cellphone", new BigDecimal(150000)));
        products.put(2L, new Product(2L, "Frozen Peas", new BigDecimal(120)));
        products.put(3L, new Product(3L, "Pencil", new BigDecimal(30)));

    }

    @Override
    public Product getProductById(Long prodId) {
        Product product;

        product = products.get(prodId) == null ? new Product() : products.get(prodId);

        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        List<Product> productList = new ArrayList<>();

        for(Long key : products.keySet()){
            productList.add(products.get(key));
        }

        return productList;
    }
}
