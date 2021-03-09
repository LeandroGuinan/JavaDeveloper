

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista Completa De Personal</h1>
        <ul>
            <c:forEach items="${personas}" var="persona">
                <li>ID: ${persona.idPersona}, Nombre: ${persona.nombre} ${persona.apellido},  Email: ${persona.email},  Telefono: ${persona.telefono}</li>
            </c:forEach>
        </ul>
        <a href="index.html">Volver Al Inicio</a>
    </body>
</html>
