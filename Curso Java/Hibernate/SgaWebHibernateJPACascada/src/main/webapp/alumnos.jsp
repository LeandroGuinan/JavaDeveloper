<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Lista De Alumnos</h2>
        <br/>
        <ul border="1">
            <c:forEach items="${alumnos}" var="al">
                <li>ID: ${al.idAlumno} Nombre: ${al.nombre}  Apellido: ${al.apellido}</li>
            </c:forEach>
        </ul>
        <a href="index.html"></a>
    </body>
</html>
