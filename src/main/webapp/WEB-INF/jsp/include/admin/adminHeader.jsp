<!-- 模仿天猫整站ssm 教程 为how2j.cn 版权所有-->
<!-- 本教程仅用于学习使用，切勿用于非法用途，由此引起一切后果与本站无关-->
<!-- 供购买者学习，请勿私自传播，否则自行承担相关法律责任-->

<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix='fmt' %> 

<html>

<head>
	<script src="${pageContext.request.contextPath}/js/jquery/2.0.0/jquery.min.js"></script>
	<link href="${pageContext.request.contextPath}/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
	<script src="${pageContext.request.contextPath}/js/bootstrap/3.3.6/bootstrap.min.js"></script>
	<link href="${pageContext.request.contextPath}/css/back/style.css" rel="stylesheet">
	
<script>
function checkEmpty(id, name){
	var value = $("#"+id).val();
	if(value.length==0){
		alert(name+ "不能为空");
		$("#"+id)[0].focus();
		return false;
	}
	return true;
}
function checkNumber(id, name){
	var value = $("#"+id).val();
	if(value.length==0){
		alert(name+ "不能为空");
		$("#"+id)[0].focus();
		return false;
	}
	if(isNaN(value)){
		alert(name+ "必须是数字");
		$("#"+id)[0].focus();
		return false;
	}
	
	return true;
}
function checkInt(id, name){
	var value = $("#"+id).val();
	if(value.length==0){
		alert(name+ "不能为空");
		$("#"+id)[0].focus();
		return false;
	}
	if(parseInt(value)!=value){
		alert(name+ "必须是整数");
		$("#"+id)[0].focus();
		return false;
	}
	
	return true;
}
function deleteById(sp,id){
	if(confirm("确认要删除编号为"+id+"记录吗?")){
		location.href = "${pageContext.request.contextPath}/admin_category_delete/"+sp+"/"+id;
	}
}
function deleteByIds(sp,id){
	if(confirm("确认要删除编号为"+id+"记录吗?")){
		location.href = "${pageContext.request.contextPath}/admin_property_deleteById/"+sp+"/"+id;
	}
}
function deleteById3(sp,id){
	if(confirm("确认要删除编号为"+id+"记录吗?")){
		location.href = "${pageContext.request.contextPath}/admin_product_deleteById/"+sp+"/"+id;
	}
}

</script>	
</head>
<body>

