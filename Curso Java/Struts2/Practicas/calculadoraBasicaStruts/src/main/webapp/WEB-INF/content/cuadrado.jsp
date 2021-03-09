<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cuadrado</title>
        <s:head/>
    </head>
    <body>
        <h1>Ingresa Los Valores</h1>
        <br>
        <s:form action="areaCua">
            <s:textfield label="lado1" name="lado1"/>
            <s:textfield label="lado2" name="lado2"/>
            <s:submit name="submit" />
        </s:form>
        <div>
            <s:text name="Area Del Cuadrado"/>:<s:property value="res"/>
        </div>
    </body>
</html>
