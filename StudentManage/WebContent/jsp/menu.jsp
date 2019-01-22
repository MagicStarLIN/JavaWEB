<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>操作选项</title>
</head>
<body>
	<form action = "/StudentManage/ServletFindALL">
	<input type = "submit" value = "获取全部学生信息">
	</form>
	<br>
	<br>
	

<!--chazhao 	<form action="/StudentManage/ServletFindwithID" method="post">
		<input type = "text" name = id>
		
		<input type = "submit" value = "确定">
		
	</form> -->
	<br>
	<br>
	添加学生信息
	<form action = "/StudentManage/ServletAddStudent" method = "post">
		名字：<input type = "text" name = "name"><br>
		性别：<input type = "text" name = "sex"><br>
		年龄：<input type = "text" name = "age"><br>
		<br>
		<input type = "submit" value = "提交">
	
	</form><br>
	<br>
<!-- 	<form action = "/StudentManage/ServletDeleteStudent" method = "post">
	需要删除的id为：<input type = "text" name = "id">
				<input type = "submit" value = "删除">
	
	</form><br><br> -->
<!-- 	更改学生信息<br>
<form action = "/StudentManage/ServletUpdateStudent" method = "post">
	需要修改的学生id<input type = "text" name = id><br>
		名字：<input type = "text" name = "name"><br>
		性别：<input type = "text" name = "sex"><br>
		年龄：<input type = "text" name = "age"><br>
		<br>
		<input type = "submit" value = "提交">
	
	</form> -->
</body>
</html>