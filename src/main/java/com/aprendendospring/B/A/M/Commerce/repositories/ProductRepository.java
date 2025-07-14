package com.aprendendospring.B.A.M.Commerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendospring.B.A.M.Commerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
