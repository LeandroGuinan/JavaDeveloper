<%-- 
    Document   : index
    Created on : 7 jul. 2020, 15:42:53
    Author     : guina
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page %> contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Hola Mundo JSP's</title>
    </head>
    <body>
        <h1>Hola Mundo JSP's</h1>
        <u1>
            <li> <% out.print("Hola Mundo con Scriptlets");%> </li>
            <li> ${"Hola Mundo con Expression Language(EL)"}</li>
            <li><%="Hola Mundo con Expresiones"%></li>
            <li> <c:out value="Hola Mundo con JSTL" /> </li>
            
        </u1>
    </body>
</html>
