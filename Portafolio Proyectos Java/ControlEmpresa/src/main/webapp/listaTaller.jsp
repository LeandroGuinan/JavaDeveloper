<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Taller</title>
    </head>
    <body>
        <h1>Lista De Empleados De Taller</h1>
        <ul>
            <c:forEach items="${taller}" var="tl">
                <li>ID: ${tl.idMec} Nombre: ${tl.nombre} ${tl.apellido} Sueldo: ${tl.sueldo}$ Usuario: ${tl.usuario}</li>
            </c:forEach>
        </ul>
        <a href="empleados">Volver Atras</a>
    </body>
</html>
