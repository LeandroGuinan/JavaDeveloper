<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Circulo</title>
        <s:head/>
    </head>
    <body>
        <h1>Ingresa Los Valores</h1>
        <s:form action="areaCi">
            <s:textfield label="Radio" name="radio"/>
            <s:submit name="submit"/>
        </s:form>
        <div>
            <s:text name="Area Del Circulo"/>: <s:property value="area"/>
        </div>
    </body>
</html>
