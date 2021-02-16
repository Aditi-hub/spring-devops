//Step-2 //making easy project
package com.myapp.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //persistance class
@Table(name="newproducts")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) //id's auto generated
	private Integer productId;
	
	private String productName;
	
	private Double price;
	
	private String description;
	
	public Product() {
		// TODO Auto-generated constructor stub
		
	}

	public Product(Integer productId, String productName, Double price, String description) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.description = description;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
