package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.ProductImage;

public interface ProductImageDao extends BaseDao<ProductImage>{

	List<ProductImage> check(Map<String, Integer> map);
}
