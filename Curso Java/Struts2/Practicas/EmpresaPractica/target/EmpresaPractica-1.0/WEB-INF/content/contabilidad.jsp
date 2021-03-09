<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contablidad</title>
    </head>
    <body>
        <h1>Bienvenido A Contabilidad</h1>
        <h5>Inicia Sesion</h5>
        <br/>
        <s:form action="validarCon">
            <s:textfield label="Usuario" name="user"/>
            <br/>
            <s:password label="Contaseña" name="password"/>
            <br/>
            <s:submit  name="submit"/>
        </s:form>
            
    </body>
</html>
