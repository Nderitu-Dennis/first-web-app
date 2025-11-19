<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp</title>
</head>
<body bgcolor="cyan">

<h2>Hello form JSP</h2>


	<%
	int i = Integer.parseInt(request.getParameter("num1")); 
	int j =	Integer.parseInt(request.getParameter("num2"));
	
	 int result = i + j;
	 
	 
	 out.println("result is: " + result);
	%>
</body>
</html>