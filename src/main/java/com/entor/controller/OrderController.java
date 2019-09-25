package com.entor.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.entor.entity.OrderItemVO;
import com.entor.entity.OrderVO;
import com.entor.service.OrderItemService;
import com.entor.service.OrderService;
@Controller
public class OrderController {
	@Resource
	private OrderItemService ois;
	@Resource
	private OrderService os;
	
	@RequestMapping("/orderItem_list")
	public void pic(String id,HttpServletRequest request,HttpServletResponse response) throws IOException {
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html;charset=utf-8");
	List<OrderItemVO> list = ois.queryByOid(id);
	PrintWriter out = response.getWriter();
	String json = JSON.toJSONString(list);
	System.out.println(json);
	out.write(json);
	out.flush();
	out.close();
}
	@RequestMapping("/admin_order_list")
	public String list(String id,HttpServletRequest request) throws IOException {
				List<OrderVO> list = os.queryOrderVOByPage();
				request.setAttribute("page", list);
				return "admin/listOrder";
	}
	}
