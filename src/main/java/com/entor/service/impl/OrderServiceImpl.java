package com.entor.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entor.dao.OrderDao;
import com.entor.entity.Order;
import com.entor.entity.OrderVO;
import com.entor.service.OrderService;
@Service("orderService")

public class OrderServiceImpl extends BaseServiceImpl<Order> implements OrderService{
	@Resource
	private OrderDao orderDao;
	@Override
	public List<OrderVO> queryOrderVOByPage() {
		return orderDao.queryOrderVOByPage();
	}

}
