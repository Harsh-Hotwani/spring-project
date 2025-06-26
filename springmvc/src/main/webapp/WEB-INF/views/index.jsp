<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>

<%String name = (String) request.getAttribute("name"); %>
<h1>this is home page</h1>
<h2>hello check</h2>
<h1>the name is <%=name%></h1>
</body>
</html>