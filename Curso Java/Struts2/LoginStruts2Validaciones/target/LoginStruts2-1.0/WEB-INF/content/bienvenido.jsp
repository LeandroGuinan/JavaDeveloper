<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="bienvenido.titulo"/></title>
        <s:head/>
    </head>
    <body>
        <h1><s:text name="bienvenido.titulo"/></h1>
        <!-- esta etiqueta nos permite mostrar mensajes genericos, que no son de tipo error: -->
        <s:actionmessage/>
        <!-- como el agregado en el metodo execute de validarUsuarioAction, de que se pueda dar un error
             tambien se puede agregar la anotacion actionerror, de la pagina anterior-->
        <s:actionerror/>
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
