package com.entor.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.OrderItemDao;
import com.entor.entity.OrderItem;
import com.entor.entity.OrderItemVO;
import com.entor.service.OrderItemService;
@Service("orderItemService")

public class OrderItemServiceImpl extends BaseServiceImpl<OrderItem> implements OrderItemService{
	@Resource
	private OrderItemDao orderItemDao;
	@Override
	public List<OrderItemVO> queryByOid(String oid) {
		return orderItemDao.queryByOid(oid);
	}

}
