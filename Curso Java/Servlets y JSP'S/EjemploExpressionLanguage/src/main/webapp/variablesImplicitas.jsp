<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y Varaiables Implicitas</title>
    </head>
    <body>
        <h1>EL y Varaiables Implicitas</h1>
        <u1>
            <li>Nombre de la aplicacion: ${pageContext.request.contextPath}</li>
            <li>Navegador del cliente ${header["User-Agent"]}</li>
            <li>Id sesion: ${cookie.JSESSIONID.value}</li>
            <li>web Server: ${pageContext.servletContext.serverInfo}</li>
            <li>Valor Parametro: ${param.usuario}</li>
            <br><br>
            <a href="index.jsp">Volver Al Inicio</a>
        </u1>
    </body>
</html>
