package com.ngdeveloper.Todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ngdeveloper.Todo.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long>{

}
