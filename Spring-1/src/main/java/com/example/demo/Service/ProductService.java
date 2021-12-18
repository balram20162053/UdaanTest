package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.Product.Product;

@Service
public interface ProductService {

	public String buyOneProduct(String product);
	public Product addOneProduct(Product p);
}
