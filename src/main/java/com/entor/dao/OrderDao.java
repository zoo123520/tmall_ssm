package com.entor.dao;

import java.util.List;

import com.entor.entity.Order;
import com.entor.entity.OrderVO;

public interface OrderDao extends BaseDao<Order>{
	public List<OrderVO> queryOrderVOByPage();
}
