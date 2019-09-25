package com.entor.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.PropertyValueDao;
import com.entor.entity.PropertyValue;
import com.entor.service.PropertyValueService;
import com.entor.vo.PropertyValueVO;
@Service("propertyValueService")

public class PropertyValueServiceImpl extends BaseServiceImpl<PropertyValue> implements PropertyValueService{
	@Resource
	private PropertyValueDao propertyValueDao;
	@Override
	public List<PropertyValueVO> queryAllByPid(int pid) {
		return propertyValueDao.queryAllByPid(pid);
	}
	@Override
	public void updateValueById(String value, String ptid) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("value", value);
		map.put("ptid", ptid);
		propertyValueDao.updateValueById(map);
	}

}
