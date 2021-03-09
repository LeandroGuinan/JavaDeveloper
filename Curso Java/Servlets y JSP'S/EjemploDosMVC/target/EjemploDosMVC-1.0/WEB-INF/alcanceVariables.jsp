<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance Variables</title>
    </head>
    <body>
        <h1>Alcance Variables</h1>
        <br>
        Variable request: 
        base: ${rectanguloRequest.base}
        altura: ${rectanguloRequest.altura}
        Area: ${rectanguloRequest.area}
        <br/><br/>
        Variable Sesion: 
        base: ${rectanguloSesion.base}
        altura: ${rectanguloSesion.altura}
        Area: ${rectanguloSesion.area}
        <br/><br/>
        Variable Aplicacion: 
        base: ${rectanguloAplicacion.base}
        altura: ${rectanguloAplicacion.altura}
        Area: ${rectanguloAplicacion.area}
        <br><br>
        <a href="${pageContext.request.contextPath}/index.jsp">Regresar al inicio</a>
        
    </body>
</html>
