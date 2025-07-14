package com.aprendendospring.B.A.M.Commerce.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendendospring.B.A.M.Commerce.dto.ProductDTO;
import com.aprendendospring.B.A.M.Commerce.entities.Product;
import com.aprendendospring.B.A.M.Commerce.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService service;

	@GetMapping(value = "/{id}")
	public ProductDTO findById(@PathVariable Long id) {
		ProductDTO  dto = service.findById(id);
		return dto;
	}

}
