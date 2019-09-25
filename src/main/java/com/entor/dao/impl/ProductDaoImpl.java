package com.entor.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entor.dao.ProductDao;
import com.entor.entity.Product;

@Repository("productDao")

public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao{
	private String namespace = "Product";
	
	public List<Product> queryAllById(int cid) {
		return getSqlSession().selectList(namespace+".queryAllById",cid);
	}

	@Override
	public List<Product> queryAll(Class<?> cls) {
		
		return getSqlSession().selectList(namespace+".queryAllPic");
	}
	
}
