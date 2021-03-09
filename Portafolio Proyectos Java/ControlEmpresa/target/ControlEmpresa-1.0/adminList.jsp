<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administracion</title>
    </head>
    <body>
        <h1>Empleados Del Departamento De Administracion</h1>
        <ul>
            <c:forEach items="${admin}" var="ad">
                <li>ID: ${ad.idAdmin} Nombre: ${ad.nombre} ${ad.apellido} Sueldo: ${ad.sueldo}$ Usuario: ${ad.usuario}</li>
            </c:forEach>
        </ul>
        <a href="empleados">Volver Atras</a>
    </body>
</html>
