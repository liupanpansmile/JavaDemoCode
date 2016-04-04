<%@ page import="com.oneapm.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/4/3
  Time: 23:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<h2>Hello ${username}</h2>
<h2>String :${string} </h2>>
Id: ${user.id}
Username: ${user.username}>

Username:<%=request.getParameter("username")%>
</body>
</html>
