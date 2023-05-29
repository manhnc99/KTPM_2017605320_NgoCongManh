package com.eoptech.shopthoitrang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eoptech.shopthoitrang.entities.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
