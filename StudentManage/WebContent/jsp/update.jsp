<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>更新</title>
</head>
<body>
<form action = "/StudentManage/ServletUpdateStudent" method = "post">
		id:	<input type = "hidden" name = "stu_id" value = ${currentStudent.stu_id }><br>
		名字：<input type = "text" name = "name"value = ${currentStudent.stu_name }><br>
		性别：<input type = "text" name = "sex" value = ${currentStudent.stu_sex }><br>
		年龄：<input type = "text" name = "age" value = ${currentStudent.stu_age }><br>
		<br>
		<input type = "submit" value = "提交">
	
	</form>

</body>
</html>