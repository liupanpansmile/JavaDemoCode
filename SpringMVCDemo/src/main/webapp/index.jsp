<html>
<body>
<h2>Hello World!</h2>
<br>
<form method="post" action="<%request.getContextPath();%>UserServlet">
    <input type="text" name="username"/></br>
    <input type="password" name="password"></br>
    <input type="submit" value="Login">
    <input type="reset" value="Login">
</form>
</body>
</html>
