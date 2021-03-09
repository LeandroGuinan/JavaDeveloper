<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pagina Empleados</title>
    </head>
    <body>
        <h1>Lista Completa De Empleados</h1>
        <ul>
            <c:forEach items="${empleados}" var="empleado">
                <li>ID: ${empleado.idEmpleado}, Nombre: ${empleado.nombre} ${empleado.apellido}, Sueldo: ${empleado.sueldo}$</li>
            </c:forEach>
            <br/>
            <h2>Departamentos</h2>
            <a href="admin">Administracion</a>
            <br><br>
            <a href="taller">Ir A Taller</a>
            <br><br>
            <a href="index.html">Volver Al Inicio</a>
        </ul>
</html>
