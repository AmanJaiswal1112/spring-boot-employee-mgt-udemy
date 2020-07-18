package com.example.prac.springbootprac.dao;

import com.example.prac.springbootprac.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>
{

}
