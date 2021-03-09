<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado De Alumnos</title>
    </head>
    <body>
        <h2>Lista De Alumnos</h2>
        <br/>
        
        <table border="1">
            <caption>
                Listado Alumnos
            </caption>
            <tr>
                <th>Alumno ID</th>
                <th>Nombre</th>
                <th>Domicilio</th>
                <th>Email</th>
                <th>Telefono</th>
            </tr>
            <c:forEach var="alumno" items="${alumnos}">
                <tr>
                    <td>
                        <a href="${pageContext.request.contextPath}/ServletModificar?idAlumno=${alumno.idAlumno}">
                        ${alumno.idAlumno}
                        </a>
                    </td>
                    <td>${alumno.nombre} ${alumno.apellido}</td>
                    <td>${alumno.idDomicilio.calle} ${alumno.idDomicilio.noCalle} ${alumno.idDomicilio.pais}</td>
                    <td>${alumno.idContacto.email}</td>
                    <td>${alumno.idContacto.telefono}</td>
                </tr>
            </c:forEach>
        </table>
        <br/>
        <a href="${pageContext.request.contextPath}/ServletRedireccionar">Agregar</a>
        <br/>
    </body>
</html>
