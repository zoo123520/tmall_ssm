package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.ProductImageDao;
import com.entor.entity.ProductImage;
import com.entor.service.ProductImageService;
@Service("productImageService")

public class ProductImageServiceImpl extends BaseServiceImpl<ProductImage> implements ProductImageService{
	@Resource
	private ProductImageDao productImageDao;
	@Override
	public List<ProductImage> check(int id,int cid) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("id",id);
		map.put("cid", cid);
		return productImageDao.check(map);
	}

}
