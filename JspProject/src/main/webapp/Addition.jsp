<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sum of numbers</title>
</head>
<body>
<%
Long numb1 = Long.parseLong(request.getParameter("number1"));
Long numb2 = Long.parseLong(request.getParameter("number2"));
%>

Sum of <%= numb1%> and <%= numb2%> is <%= numb1 + numb2 %>

</body>
</html>