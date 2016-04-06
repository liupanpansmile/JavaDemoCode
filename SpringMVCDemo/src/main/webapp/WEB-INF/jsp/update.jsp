<%@ taglib prefix="fs" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update User</title>
</head>
<body>
<fs:form action="update" method="post" commandName="user">
    Username: <fs:input path="username"></fs:input> <br>
    Password: <fs:input path="password"></fs:input><br>
    Email: <fs:input path="email"></fs:input><br>
    <input type="submit" value="Modify"/>
</fs:form>
</body>
</html>
