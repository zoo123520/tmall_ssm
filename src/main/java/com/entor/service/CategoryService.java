package com.entor.service;

import com.entor.entity.Category;

public interface CategoryService extends BaseService<Category>{
	public int queryMaxId();
	public Category queryByPid(String id);
}
