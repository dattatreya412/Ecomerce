package com.ecom_project.ecom_project.service;

import com.ecom_project.ecom_project.Model.Product;
import com.ecom_project.ecom_project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(int prodId) {
        return productRepository.findById(prodId);
    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }
}
