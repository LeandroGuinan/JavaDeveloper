<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Departamentos</title>
    </head>
    <body>
        <h1>Departamentos</h1>
        <table border="1">
            <caption>
                Departamentos
            </caption>
            <tr>
                <th>Departamento</th>
                <th>Presupuesto</th>
            </tr>
            <c:forEach items="${deps}" var="dep">
                <tr>
                    <td>${dep.nombreDepartamento}</td>
                    <td>${dep.presupuestoDepartamento}</td>
                </tr>
            </c:forEach>
        </table>
        <a href="${pageContext.request.contextPath}/getBack">volver a inicio</a>
    </body>
</html>
