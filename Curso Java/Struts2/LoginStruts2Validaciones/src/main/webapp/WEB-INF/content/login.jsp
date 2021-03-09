<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- de esta manera podemos escribir la llave directamente -->
        <title><s:text name="login.head"/></title>
        <!-- ya que estamos trabajando con errores de strurts, debemos agregar la siguiente etiqueta: -->
        <s:head/>
        <!-- esto agrega los estilos css presentes a estos errores  -->
    </head>
    <body>
        <h1><s:text name="login.head"/></h1>
        <!-- al agregar la siguiente etiqueta: -->
        <s:actionerror/>
        <!-- permitimos agregar mensajes mas genericos de tipo ActionError, a nuestra pagina jsp -->
        <s:form action="validarUsuario">
            <s:textfield name="user" key="login.us"/>
            <s:password name="pass" key="login.ps"/>
            <s:submit key="login.bt" name="submit"/>
        </s:form>
        <br/>
    </body>
</html>
