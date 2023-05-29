package com.eoptech.shopthoitrang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eoptech.shopthoitrang.entities.SaleorderProduct;

@Repository
public interface SaleorderProductRepo extends JpaRepository<SaleorderProduct, Integer>{

}
