<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>结果</title>
</head>
<body>
<table border="1">

	<tr>
		<td>index</td>  <td>id</td>   <td>stu_name</td>   <td>stu_sex</td>    <td>stu_age</td>
			</tr>
	<c:forEach  items="${theList}"  var="l"  varStatus="status">
	
	<tr>
		<td>${status.index+1}</td> <td>${l.stu_id}</td>  <td>${l.stu_name }</td>   <td>${ l.stu_sex}</td>    <td>${l.stu_age}</td>   
		<td><a href=/StudentManage/ServletDeleteStudent?stu_id=${l.stu_id }   >delete</a></td>
		<td><a href=/StudentManage/ServletFindwithID?stu_id=${l.stu_id }   >update</a></td>
	</tr>
	</c:forEach>
</table>

</body>
</html>