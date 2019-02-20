<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<% if(request.getParameter("username")!= null ){ %>
<%= request.getParameter("username") %>
<% }%>
<a href="login.html">Login</a>
</body>
</html>