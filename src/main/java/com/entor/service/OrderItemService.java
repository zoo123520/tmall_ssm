package com.entor.service;

import java.util.List;

import com.entor.entity.OrderItem;
import com.entor.entity.OrderItemVO;

public interface OrderItemService extends BaseService<OrderItem>{
	public List<OrderItemVO> queryByOid(String oid);
}
