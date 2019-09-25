package com.entor.service;

import java.util.List;

import com.entor.entity.Order;
import com.entor.entity.OrderVO;

public interface OrderService extends BaseService<Order>{
	public List<OrderVO> queryOrderVOByPage();
}
