<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page   import="com.lcl.message.Message,java.util.List"    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	List<Message> l = (List<Message>)request.getAttribute("All");
	for(int i = 0 ; i < l.size() ; i++){
		Message m = l.get(i);
		%>
		
		<%=m.getMid() %>
		<%=m.getTitle() %>
		<%=m.getAuthor() %>
		<%=m.getContent() %>
		<%=m.getEmail() %>
		<%=m.getAdd_date()%>
		<br>
		<%
		
	}
	
	%>


</body>
</html>