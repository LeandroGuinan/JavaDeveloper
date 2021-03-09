<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Saludos Desde Struts</title>
    </head>
    <body>
        <!-- al tener los tags de struts cargados en esta pagina, podemos hacer uso de los elementos
        en la clase que aloja el metodo execution(en este caso: beans.HolaMundoAction)-->
        <h1><s:property value="saludosAtr"></s:property></h1>
    </body>
</html>
