package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.Product;

public interface ProductDao extends BaseDao<Product>{

	List<Product> queryAllById(int id);
	

}
