package com.bata.devopsproj.controller;

import com.bata.devopsproj.model.Product;
import com.bata.devopsproj.service.ProductService;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/product")
public class ProductController {

    private ProductService service;

    @GetMapping(path = "/getById/{prodId}")
    public ResponseEntity<Product> getProductById(@PathVariable(value = "prodId") Long id){
        Product product = service.getProductById(id);

        return ResponseEntity.ok(product);
    }

    @RequestMapping(path = "/getAll", method = RequestMethod.GET)
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products = service.getAllProducts();

        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
