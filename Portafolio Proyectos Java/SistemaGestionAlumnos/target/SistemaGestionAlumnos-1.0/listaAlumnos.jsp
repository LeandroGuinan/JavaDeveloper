<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista De Alumnos</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <td>Nombre</td>
                <td>Apellido</td>
                <td>Domicilio</td>
                <td>Email</td>
                <td>Telefono</td>
            </tr>

            <c:forEach items="alumnos" var="al">
                <tr>
                    <td>${al.nombre}</td>
                    <td>${al.apellido}</td>
                    <td>${al.idDomicilio.calle} ${al.idDomicilio.noCalle} ${al.idDomicilio.pais}</td>
                    <td>${al.idContacto.email}</td>
                    <td>${al.idContacto.telefono}</td>
                </tr>
            </c:forEach>

        </table>
    </body>
</html>
