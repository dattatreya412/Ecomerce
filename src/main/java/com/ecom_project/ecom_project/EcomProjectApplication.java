package com.ecom_project.ecom_project;

import com.ecom_project.ecom_project.controller.ProductController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EcomProjectApplication {
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(EcomProjectApplication.class, args);
		ProductController prod = context.getBean(ProductController.class);
		prod.home();
	}
}
