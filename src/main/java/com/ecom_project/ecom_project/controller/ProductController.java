package com.ecom_project.ecom_project.controller;

import com.ecom_project.ecom_project.Model.Product;
import com.ecom_project.ecom_project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String home() {
        return "Home";
    }

    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getAllProduct();
    }

    @GetMapping("/products/{prodId}")
    public Optional<Product> getProductById(@PathVariable("prodId") int prodId) {
        return productService.getProductById(prodId);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product product) {
         productService.addProduct(product);
    }
}
