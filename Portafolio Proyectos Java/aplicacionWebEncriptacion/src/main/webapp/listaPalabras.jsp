<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista De Palabras</title>
    </head>
    <body>
        <h1>Lista De Palabras</h1>
        <ul>
            <c:forEach items="${palabras}" var="palabra">
                <li>ID: ${palabra.idPalabras} Valor: ${palabra.palabraEncriptada}</li>
            </c:forEach>
        </ul>
        
        <a href="index.html">Volver Al Inicio</a>
    </body>
</html>
