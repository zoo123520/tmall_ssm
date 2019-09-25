package com.entor.test;




import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entor.entity.Category;
import com.entor.entity.Product;
import com.entor.service.CategoryService;
import com.entor.service.OrderService;
import com.entor.service.ProductService;
import com.entor.service.PropertyValueService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		ProductService pservice = (ProductService)context.getBean("productService");
//		CategoryService cservice = (CategoryService)context.getBean("categoryService");
		OrderService oservice = (OrderService)context.getBean("orderService");
		System.out.println(oservice.queryOrderVOByPage());
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
