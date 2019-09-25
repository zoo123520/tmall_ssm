package com.entor.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.Category;
import com.entor.entity.Product;
import com.entor.entity.ProductImage;
import com.entor.service.CategoryService;
import com.entor.service.ProductImageService;
import com.entor.service.ProductService;
import com.mysql.fabric.xmlrpc.base.Array;

@Controller
public class ProductController {
	@Resource
	private ProductService ps;
	@Resource
	private CategoryService cs;
	@Resource
	private ProductImageService pi;
	@RequestMapping("/admin_product_list")
	public String list(int cid,HttpServletRequest request) {
		
		Category category = cs.queryById(Category.class,cid);
		List<Product> list = ps.queryAllById(cid); 
		List<ProductImage> list2 = new ArrayList<>();
		Object array[] = new Object[list.size()];
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId());
			list2 = pi.check(list.get(i).getId(), cid);
			System.out.println(list2);
			array[i]= list2.get(0);
		}
		List<Object> list3 = Arrays.asList(array);
			for (int i = 0; i < 5; i++) {
				list.get(i).setPic((int)list3.get(i));
			}
			request.setAttribute("ps", list);
			request.setAttribute("c", category);
		return "admin/listProduct";
	}
	@RequestMapping("/admin_product_edit")
	public String updateForm(int id,int cid,HttpServletRequest request) {
		 Product product = ps.queryById(Product.class,id);
		 Category category = cs.queryById(Category.class,cid);
		 System.out.println(product);
		 request.setAttribute("p", product);
		 request.setAttribute("c", category);
		 
		return "admin/editProduct";
	}
	@RequestMapping("/admin_product_update")
	public String update(Product product,int cid) {
		ps.update(product);
		return "redirect:/admin_product_list?cid="+cid;
	}
	@RequestMapping("/admin_product_add")
	public String add(Product product,int cid) {
		ps.add(product);
		return "redirect:/admin_product_list?cid="+cid;
	}
	@RequestMapping("/admin_product_deleteById/{currentPage}/{id}")
	public String delete(@PathVariable String currentPage,@PathVariable int id) {
		ps.deleteById(Product.class, id);
		return "redirect:/admin_product_list?cid="+currentPage;
	}
}
