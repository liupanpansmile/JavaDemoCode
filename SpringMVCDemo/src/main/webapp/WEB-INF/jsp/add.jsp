<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add User</title>
</head>

<body>
    <sf:form method="post" modelAttribute="user"></sf:form>
    Username: <sf:input path="username"/> <br/>
    Password:<sf:password path="password"/><br/>
    Email:<sf:input path="email"/><br/>
    <input type="submit" value="post">
</body>
</html>
