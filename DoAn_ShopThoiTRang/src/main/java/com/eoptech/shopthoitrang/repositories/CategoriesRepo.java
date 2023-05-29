package com.eoptech.shopthoitrang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eoptech.shopthoitrang.entities.Category;

@Repository
public interface CategoriesRepo extends JpaRepository<Category, Integer>{
	
}
