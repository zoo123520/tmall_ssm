package com.entor.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.User;
import com.entor.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService us;
	
	@RequestMapping("/admin_user_list")
	
	public String queryByPage(HttpServletRequest request){
		List<User> user = us.queryAll(User.class);
		request.setAttribute("us", user);
		return "admin/listUser";
	}
}
