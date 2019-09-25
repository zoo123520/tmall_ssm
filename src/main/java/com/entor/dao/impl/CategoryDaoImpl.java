package com.entor.dao.impl;


import org.springframework.stereotype.Repository;

import com.entor.dao.CategoryDao;
import com.entor.entity.Category;

@Repository("categoryDao")
public class CategoryDaoImpl extends BaseDaoImpl<Category> implements CategoryDao{
	private final String namespace = "Category";
	@Override
	public int queryMaxId() {
		return getSqlSession().selectOne(namespace+".queryMaxId");
	}
	@Override
	public Category queryByPid(String id) {
		return getSqlSession().selectOne(namespace+".queryByPid");
	}


}
