<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h4>Mensaje:</h4>
        <br/><br/>
        <h3><s:property value="mensaje"></s:property></h3>
        <a href="index.html">Volver</a>
    </body>
</html>
