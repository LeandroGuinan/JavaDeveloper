<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista De Personas</h1>
        <c:forEach items="${personas}" var="persona">
        <li>${persona.nombre} ${persona.apellido}</li>
        </c:forEach>
    </body>
</html>
