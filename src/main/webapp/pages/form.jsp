<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Añadir un nuevo empleado" %>
</h1>
<br/>
<!-- El destino del link es el valor del atributo "value" de la etiqueta Webservlet en la clase donde se define el servlet -->
<form action="../insertarEmpBD", method="post">
    <label >Id del empleado: </label><input type="number" name="idEmp" ><br>
    <label >Apellido:</label> <input type="text" name="apellido"  required><br>
    <label >Oficio: </label> <input type="text" name="oficio" > <br>
    <label >Jefe: </label> <input type="text" name="jefe"> <br>
    <label >Departamento: </label> <input type="text" name="nombreDep"> <br>
    <input type="submit" value="Enviar">
    <input type="reset" value="Limpiar">
</form>
</body>
</html>