<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lesson 16 - introduction to Java EE and JSP</title>
</head>
<body>
	<%
		String[] messages = (String[])request.getAttribute("myWelcomeMessages");
		for (String message: messages) {
			out.print("<p>" + message + "</p>");
		}
	%>
</body>
</html>