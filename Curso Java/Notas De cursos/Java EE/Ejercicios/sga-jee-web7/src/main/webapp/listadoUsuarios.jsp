<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado De Usuarios</title>
    </head>
    <h1>Listado De Usuarios</h1>
    <body>
        <c:forEach items="${usuario}" var="usuario">
        <li>${usuario.username} ${usuario.password}</li>
        </c:forEach>
        <a href="index.html">Volver al inicio</a>
    </body>
</html>
