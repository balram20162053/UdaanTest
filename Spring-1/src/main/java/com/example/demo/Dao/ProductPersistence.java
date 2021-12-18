package com.example.demo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Product.Product;

@Repository
public interface ProductPersistence extends  JpaRepository<Product,Integer> {

}
