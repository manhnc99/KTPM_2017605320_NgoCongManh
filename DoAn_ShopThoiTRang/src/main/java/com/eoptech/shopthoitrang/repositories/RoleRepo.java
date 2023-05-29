package com.eoptech.shopthoitrang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eoptech.shopthoitrang.entities.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {

}
