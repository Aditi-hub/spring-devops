package com.myapp.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.myapp.spring.model.Product;

//JpaRepository hase all apis functions i.e get,post,put,delete
@RestResource(path = "products")
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
}
