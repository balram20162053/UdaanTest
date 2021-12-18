package com.example.demo.Product;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

	@Id
	private Integer productId;
	private String productName;
	private Long price;
	private Integer noOfItems;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer productId,String productName, Long price, Integer noOfItems) {
		super();
		this.productId=productId;
		this.productName = productName;
		this.price = price;
		this.noOfItems = noOfItems;
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
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Integer getNoOfItems() {
		return noOfItems;
	}
	public void setNoOfItems(Integer noOfItems) {
		this.noOfItems = noOfItems;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", noOfItems="
				+ noOfItems + "]";
	}

	
	
	
	
	
}
