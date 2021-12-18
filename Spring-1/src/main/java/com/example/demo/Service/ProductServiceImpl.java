package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ProductPersistence;
import com.example.demo.Product.Product;
@Service
public class ProductServiceImpl implements ProductService{


	@Autowired
	ProductPersistence productPersistence ;
	
	public ProductServiceImpl() {	
		// TODO Auto-generated constructor stub
	}

	@Override
	public String buyOneProduct(String product) {
		// TODO Auto-generated method stub
		List<Product> productList = this.productPersistence.findAll();
		StringBuilder response=new StringBuilder();
		int n = productList.size();
		for(int i=0;i<n;i++) {
			System.out.println(productList.get(i).getProductName() +" "+product);
			if(productList.get(i).getProductName().equals(product) && productList.get(i).getNoOfItems()>=0) {
				response.append("Item purchased Successfully");
				break;
			}else if(productList.get(i).getProductName().equals(product) && productList.get(i).getNoOfItems()==0) {	
				response.append("Stock is finished");
				break;
			}
		}
		if(response.length()==0) {
			response.append("Product is not Available");
		}
		String newStr = response.toString();
		
		return newStr;
	}

	@Override
	public Product addOneProduct(Product p) {
		// TODO Auto-generated method stub
		this.productPersistence.save(p);
		return p;
	}
	

}
