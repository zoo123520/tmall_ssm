package com.entor.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entor.dao.PropertyValueDao;
import com.entor.dao.impl.PropertyValueDaoImpl;
import com.entor.entity.Category;
import com.entor.entity.Product;
import com.entor.service.CategoryService;
import com.entor.service.ProductService;
import com.entor.service.PropertyValueService;
import com.entor.vo.PropertyValueVO;

@Controller
public class PropertyValueController {
	@Resource
	private CategoryService cs;
	@Resource
	private ProductService ps;
	@Resource
	private PropertyValueService pvs;
	@RequestMapping("/admin_propertyValue_edit")
	public String list(int pid,int cid,HttpServletRequest request){
		Category category = cs.queryById(Category.class, cid);
		Product product = ps.queryById(Product.class, pid);
		List<PropertyValueVO> list = pvs.queryAllByPid(pid);
		request.setAttribute("p", product);
		request.setAttribute("c", category);
		request.setAttribute("pvs", list);
		return "admin/editPropertyValue";
	}
	@RequestMapping("/admin_propertyValue_update")
	public void updateForm(String pvid,String value,HttpServletRequest request,HttpServletResponse response) throws IOException{
				pvs.updateValueById(value, pvid);
				PrintWriter out = response.getWriter();
				out.write("success");
				out.flush();
				out.close();
	}
}
