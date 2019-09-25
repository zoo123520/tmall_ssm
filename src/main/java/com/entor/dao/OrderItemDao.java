package com.entor.dao;

import java.util.List;

import com.entor.entity.OrderItem;
import com.entor.entity.OrderItemVO;

public interface OrderItemDao extends BaseDao<OrderItem>{
	public List<OrderItemVO> queryByOid(String oid);

}
