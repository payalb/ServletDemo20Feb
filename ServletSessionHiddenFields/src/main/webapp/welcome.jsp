<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
</head>
<body>
${param.username}
<form action="./home.jsp">
<input type="hidden" name="username" value="<%= request.getParameter("username") %>"/>
<input type="submit">


</form>
<!-- <a href="./home.jsp">Home</a> -->
</body>
</html>
