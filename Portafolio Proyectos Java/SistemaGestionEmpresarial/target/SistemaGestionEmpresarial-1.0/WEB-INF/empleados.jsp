<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleados</title>
    </head>
    <body>
        <h1>Gestion De Empleados</h1>
        <table border="1">
            <caption>
                Lista De Empleados
            </caption>
            <tr>
                <th>ID</th>
                <th>Nombre</th>
                <th>Sueldo</th>
            </tr>
            <c:forEach items="${emps}" var="emp">
                <tr>
                    <td>${emp.idEmpleado}</td>
                    <td>${emp.nombre} ${emp.apellido}</td>
                    <td>${emp.sueldo}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="${pageContext.request.contextPath}/getBack">volver a inicio</a>
        <br/>
        <a href="${pageContext.request.contextPath}/goEmp">Agregar Empleado</a>
    </body>
</html>
