package com.entor.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.entor.entity.Category;
import com.entor.service.CategoryService;

@Controller
public class CategoryController {
	
	@Resource
	private CategoryService cs;
	
	@RequestMapping("/admin_category_list/{currentPage}")
	public String queryByPage(@PathVariable String currentPage,Map<String,Object> map) {
		int sp = 1;
		int pageSize = 5;
		int totals = cs.getTotals(Category.class);
		int pageCounts = totals/pageSize;
		if(totals%pageSize!=0) {
			pageCounts++;
		}
		try {
			sp = Integer.parseInt(currentPage);
		}catch(Exception e) {
			sp = 1;
		}
		if(sp>pageCounts) {
			sp = pageCounts;
		}
		if(sp<1) {
			sp = 1;
		}
		List<Category> list = cs.queryByPage(Category.class, sp, pageSize);
		map.put("totals", totals);
		map.put("sp", sp);
		map.put("pageCounts", pageCounts);
		map.put("cs", list);
		System.out.println(list);
		return "admin/listCategory";
	}
	@RequestMapping("/admin_category_delete/{currentPage}/{id}")
	public String deleteById(@PathVariable String currentPage,@PathVariable int id) {
		cs.deleteById(Category.class, id);
		System.out.println(id);
		
		return "redirect:/admin_category_list/"+currentPage;
	}
	
	@RequestMapping("/admin_category_edit")
	public String updateForm(String id,String currentPage,HttpServletRequest request) {
		System.out.println(id);
		Category category = cs.queryById(Category.class, id);
		request.setAttribute("c", category);
		request.setAttribute("currentPage", currentPage);
		return "admin/editCategory";
	}
	@RequestMapping("/admin_category_update")
	public String update(Category category,String currentPage) {
		System.out.println(category.getId());
		System.out.println(category.getName());
		cs.update(category);
		return "redirect:/admin_category_list/"+currentPage;
	}
	@RequestMapping("/admin_category_add")
	public String uploadFile(MultipartFile file,String name,HttpServletRequest request) throws IllegalStateException, IOException {
		System.out.println("姓名:"+name);
		Category category = new Category();
		int Maxid = cs.queryMaxId();
		category.setName(name);
		cs.add(category);
		// 要改成context下的getrealpath
		String path =  "c:\\Users\\Administrator\\eclipse-workspace\\tmall_ssm\\src\\main\\webapp\\img\\category";
		if (file!=null) {
			//文件类型
			String contentType = ".jpg";
			//文件名称
			String fileName =  String.valueOf(Maxid)+contentType;
			//文件大小
			long size =  file.getSize();
			System.out.println("文件类型"+contentType);
			System.out.println("文件名称"+fileName);
			System.out.println("文件大小"+size);
			System.out.println("文件地址"+path);
			file.transferTo(new File(path,fileName));
		}
		
		return "redirect:/admin_category_list/1";
	}
	
}
