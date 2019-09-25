package com.entor.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.entor.dao.PropertyValueDao;
import com.entor.entity.PropertyValue;
import com.entor.vo.PropertyValueVO;

@Repository("propertyValueDao")

public class PropertyValueDaoImpl extends BaseDaoImpl<PropertyValue> implements PropertyValueDao{
	private final String namespace = "PropertyValue";

	@Override
	public List<PropertyValueVO> queryAllByPid(int pid) {
		return getSqlSession().selectList(namespace+".queryAllByPid",pid);
	}

	@Override
	public void updateValueById(Map<String, String> map) {
		 getSqlSession().update(namespace+".updateValueById",map);
	}

}
