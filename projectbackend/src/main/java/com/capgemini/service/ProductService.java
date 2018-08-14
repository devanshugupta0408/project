package com.capgemini.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.bean.Product;
import com.capgemini.dao.ProductDao;

@Service
@Transactional
public class ProductService implements IProductService {

	@Autowired
	ProductDao repo;
	@Override
	public List<Product> showProducts() {
		
		return repo.showProducts();
	}

}
