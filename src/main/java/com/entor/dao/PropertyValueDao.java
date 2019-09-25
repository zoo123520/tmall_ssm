package com.entor.dao;

import java.util.List;
import java.util.Map;

import com.entor.entity.PropertyValue;
import com.entor.vo.PropertyValueVO;

public interface PropertyValueDao extends BaseDao<PropertyValue>{
	public List<PropertyValueVO> queryAllByPid(int pid);
	public void updateValueById(Map<String,String> map);
}
