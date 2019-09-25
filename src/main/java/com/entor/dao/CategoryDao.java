package com.entor.dao;

import com.entor.entity.Category;

public interface CategoryDao extends BaseDao<Category>{
	/**
	 * 查询当前最大id
	 */
	public int queryMaxId();
	
	public Category queryByPid(String id);
	
	
}
