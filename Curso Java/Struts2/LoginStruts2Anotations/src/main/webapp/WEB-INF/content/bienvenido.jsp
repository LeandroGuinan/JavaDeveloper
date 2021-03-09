<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="bienvenido.titulo"/></title>
    </head>
    <body>
        <h1><s:text name="bienvenido.titulo"/></h1>
        <h2>
            <s:text name="bienvenido.mensaje"/>
        </h2>
        <br/>
        <s:text name="login.us"/>: <s:property value="user"/><br/>
        <s:text name="login.ps"/>: <s:property value="pass"/>
        <br/>
        <a href="<s:url action="login"/>"><s:text name="bienvenido.regresar"/></a>
    </body>
</html>
