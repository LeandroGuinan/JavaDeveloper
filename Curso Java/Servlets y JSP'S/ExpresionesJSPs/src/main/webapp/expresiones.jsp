<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Expresiones</title>
    </head>
    <body>
        <h1>JSP con expresiones</h1>
        Concatenacion: <%="Saludos"+" "+"JSP" %>
        <br>
        Operacion Matematica <%= 2*3/2 %>
        <br>
        Session ID: <%= session.getId() %>
        <br>
        <a href="index.html">Volver al inicio</a>
    </body>
</html>
