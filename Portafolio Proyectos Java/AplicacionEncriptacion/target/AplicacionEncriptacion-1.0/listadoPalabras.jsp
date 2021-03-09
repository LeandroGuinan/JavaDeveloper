<%-- 
    Document   : listadoPalabras
    Created on : 14 ago. 2020, 17:25:25
    Author     : guina
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Palabras Enciptadas:</title>
    </head>
    <body>
        <h1>Palabras No Enctiptadas:</h1>
        <ul>
            <c:forEach items="${palabras}" var="pL">
                <li>${pL.palabra}</li>
                </c:forEach>
        </ul>
        
        <h1>Palabras Enctiptadas:</h1>
        <ul>
            <c:forEach items="${palarasEncriptadas}" var="pE">
                <li>${pE.palabraEncriptada}</li>
                </c:forEach>
        </ul>
    </body>
</html>
