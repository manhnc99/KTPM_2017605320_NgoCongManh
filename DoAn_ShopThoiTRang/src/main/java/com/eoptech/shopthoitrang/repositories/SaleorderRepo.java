package com.eoptech.shopthoitrang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eoptech.shopthoitrang.entities.Saleorder;

@Repository
public interface SaleorderRepo extends JpaRepository<Saleorder, Integer> {

}
