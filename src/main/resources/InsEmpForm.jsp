<%--
  Created by IntelliJ IDEA.
  User: Sandra
  Date: 13/01/2025
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nuevo empleado</title>
</head>
<body>
    <form action="InsEmpServlet" method="post">
        <label><%="Id del empleado"%></label><input type="number" name="id" required/> <br>
        <br><input type="submit" value="Enviar"/>
    </form>
</body>
</html>
