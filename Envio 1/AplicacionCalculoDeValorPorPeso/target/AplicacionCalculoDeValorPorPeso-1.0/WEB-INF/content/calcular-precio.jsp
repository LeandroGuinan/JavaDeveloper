<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="cabezero"/></title>
    </head>
    <body>
        <h1><s:property value="titulo"/></h1>
        <h4><s:property value="titulo2"/></h4>
        <s:form>
            <s:textfield name="pesoReal" key="precio.pes"/>
            <s:textfield name="alto" key="precio.alt"/>
            <s:textfield name="largo" key="precio.larg"/>
            <s:textfield name="ancho" key="precio.anch"/>
            <s:textfield name="tipoDeProducto" key="precio.titulo4"/>
            <s:submit key="precio.boton" name="submit"/>
        </s:form>
        <div>
            <s:property value="titulo3"/>
            <s:property value="precioDeEnvio"/>
            <s:property value="moneda"/>
            <br/>
            <s:property value="titulo4"/>
            <s:property value="tipoDeProducto"/>
        </div>
    </body>
</html>
