package com.entor.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.entor.dao.ProductImageDao;
import com.entor.entity.ProductImage;

@Repository("productImageDao")

public class ProductImageDaoImpl extends BaseDaoImpl<ProductImage> implements ProductImageDao{
	private final String namespace = "ProductImage";
	@Override
	public List<ProductImage> check(Map<String, Integer> map) {
		return getSqlSession().selectList(namespace+".queryAllPic",map);
		}

}
