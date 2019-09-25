package com.entor.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.entity.Category;
import com.entor.entity.Property;
import com.entor.service.CategoryService;
import com.entor.service.PropertyService;
@Controller
public class PropertyController {
	
	@Resource
	private PropertyService ps;
	@Resource
	private CategoryService cs;
	
	@RequestMapping("/admin_property_list")
		public String queryByCid(Map<String,Object> map,int cid) {
			List<Property> list = ps.queryByCid(cid);
			Category category = cs.queryById(Category.class, cid);
			map.put("ps", list);
			map.put("c", category);
			System.out.println(list);
			System.out.println(category);
			return "admin/listProperty";
		}
	@RequestMapping("/admin_property_edit")
	public String updateForm(String id,String cid,HttpServletRequest request) {
		Category category = cs.queryById(Category.class, cid);
		Property property = ps.queryById(Property.class, id);
		System.out.println(property);
		System.out.println(category);
		request.setAttribute("p", property);
		request.setAttribute("c", category);
		request.setAttribute("cid", cid);
		return "admin/editProperty";
	}
	@RequestMapping("/admin_property_update")
	public String update(Property property,String cids) {
		ps.update(property);
		System.out.println(cids);
		return "redirect:/admin_property_list?cid="+cids;
	}
	@RequestMapping("/admin_property_add")
	public String add(Property property) {
		ps.add(property);
		System.out.println(property);
		return "redirect:/admin_property_list?cid="+property.getCid();
	}
	
	@RequestMapping("/admin_property_deleteById/{currentPage}/{id}")
	public String deleteByIds(@PathVariable String currentPage,@PathVariable int id) {
		ps.deleteById(Property.class, id);
		System.out.println(id);
		return "redirect:/admin_property_list?cid="+currentPage;
	}
	}
