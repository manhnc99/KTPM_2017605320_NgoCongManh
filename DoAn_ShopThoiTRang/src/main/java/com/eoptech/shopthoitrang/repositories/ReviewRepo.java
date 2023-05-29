package com.eoptech.shopthoitrang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eoptech.shopthoitrang.entities.Review;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Integer>{

}
