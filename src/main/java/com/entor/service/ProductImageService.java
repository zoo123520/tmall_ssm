package com.entor.service;


import java.util.List;

import com.entor.entity.ProductImage;

public interface ProductImageService extends BaseService<ProductImage>{
	public List<ProductImage> check(int id,int cid);
}
