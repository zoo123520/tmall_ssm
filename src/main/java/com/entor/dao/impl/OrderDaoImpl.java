package com.entor.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.entor.dao.OrderDao;
import com.entor.entity.Order;
import com.entor.entity.OrderVO;
@Repository("orderDao")
public class OrderDaoImpl extends BaseDaoImpl<Order> implements OrderDao{

	private final String namespace = "Order";
	@Override
	public List<OrderVO> queryOrderVOByPage() {
		return getSqlSession().selectList(namespace+".queryOrderVOByPage");
	}

}
