package com.capgemini.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.bean.Product;
import com.capgemini.service.IProductService;

@RestController
public class ProductController {

	@Autowired
	IProductService service;
	
	@RequestMapping("/getProducts")
	public List<Product> getProducts()
	{
		return service.showProducts();	
}
}
