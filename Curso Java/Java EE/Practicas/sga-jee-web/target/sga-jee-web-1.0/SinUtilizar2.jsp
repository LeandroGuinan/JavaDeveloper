<%-- 
    Document   : listadoPersonas
    Created on : 14 ago. 2020, 11:30:56
    Author     : guina
--%>

<%-- aqui llamamos al componente que nos permite utilizar algunos elementos de java, usando el prefijo c, nota debes eliminar la aplicacion subida, ya que daria error si existe el mismo EJB dos veces en el server --%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado De Personas</title>
    </head>
    <body>
        <h1>Listado De Personas</h1>
        <ul>
            <c:forEach items="${personas}" var="persona">
                <li>${persona.nombre} ${persona.apellido}</li>
            </c:forEach>
        </ul>
    </body>
</html>
