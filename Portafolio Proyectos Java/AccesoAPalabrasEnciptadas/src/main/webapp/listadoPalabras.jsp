<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Palabras Encriptadas</title>
    </head>
    <body>
        <h1>Lista de palabras</h1>
        <c:forEach items="${palabras}" var="palabra">
            <ul>
                <li>Palabra: ${palabra.palabraBase}  ,Encriptado:  ${palabra.palabraEncriptada}</li>
            </ul>
        </c:forEach>
    </body>
</html>
