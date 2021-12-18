package com.example.demo.ProductController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Product.Product;
import com.example.demo.Service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productservice;
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product p) {
		return this.productservice.addOneProduct(p);
	}
	
	@GetMapping("/product/{productName}")
	public String buyOneProduct(@PathVariable("productName") String productName) {
		
		return this.productservice.buyOneProduct(productName);	
	}
	
	
}
