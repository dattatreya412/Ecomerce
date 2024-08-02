package com.ecom_project.ecom_project.repository;

import com.ecom_project.ecom_project.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
