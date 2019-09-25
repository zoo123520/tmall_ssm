package com.entor.service;

import java.util.List;

import com.entor.entity.Product;

public interface ProductService extends BaseService<Product>{
	
	public List<Product> queryAllById(int id);
}
