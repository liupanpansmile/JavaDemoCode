<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/4/4
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
    <c:forEach items="$(users)" var="um">
        ${um.value.username} -- ${um.value.password}
    </c:forEach>
</body>
</html>
