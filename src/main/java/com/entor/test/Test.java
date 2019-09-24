package com.entor.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entor.entity.Category;
import com.entor.entity.Property;
import com.entor.entity.User;
import com.entor.service.CategoryService;
import com.entor.service.PropertyService;
import com.entor.service.UserService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PropertyService service = (PropertyService)context.getBean("propertyService");
		
		System.out.println(service.queryById(Property.class, 244));
		/*
		List<User> list = service.queryByPage(User.class, 1, 20);
		for(User user:list) {
			System.out.println(user);
		}
		*/
//		int totals = service.getTotals(User.class);
//		System.out.println(totals);
//		service.deleteById(User.class, 16);
		/*
		User user = new User();
		user.setUsername("lisi");
		user.setPassword("123456");
		service.add(user);
		*/
		/*
		User user = new User();
		user.setId(17);
		user.setUsername("lisi7");
		user.setPassword("888888");
		service.update(user);
		*/
	}
}
