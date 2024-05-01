package com.bata.devopsprojclient.controller;

import com.bata.devopsprojclient.model.Product;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/api/client/product")
public class ProductClientController {

    private RestTemplate restTemplate;

    @GetMapping(path = "/getFromServer")
    public ResponseEntity<Product> getProductFromServer(){
        String url = "http://localhost:8085/api/product/getById/1";
        ResponseEntity<Product> productResponseEntity;
        productResponseEntity = restTemplate.getForEntity(url, Product.class);

        return ResponseEntity.ok(productResponseEntity.getBody());
    }

    @GetMapping
    public ResponseEntity<String> isUp(){
        return ResponseEntity.ok("Service is running...");
    }
}
