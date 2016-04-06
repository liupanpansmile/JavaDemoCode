<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
<c:choose>
    <c:when test="${ users == null || users.size() == 0}">
        <h2>没有查到用户信息！</h2>
    </c:when>
    <c:otherwise>
        <c:forEach items="${users}" var="user">
            <li>${user.username}--${user.password}-- ${user.email}-- <a href="delete/${user.username}">删除</a></li>
        </c:forEach>
    </c:otherwise>
</c:choose>

</body>
</html>
