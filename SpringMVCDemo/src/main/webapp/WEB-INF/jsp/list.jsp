<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
    <c:forEach items="${users}" var="user">
        <li>${user.username}--${user.password}-- ${user.email}</li>
    </c:forEach>
</body>
</html>
