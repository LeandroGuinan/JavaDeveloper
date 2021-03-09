<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Empleados</title>
    </head>
    <body>
        <h1>Agrega Los Datos:</h1>
        <form method="POST" action="${pageContext.request.contextPath}/submitEmp">
            Nombre: <input type="text" name="nombre"/>
            <br/>
            Apellido: <input type="text" name="apellido"/>
            <br/>
            Sueldo: <input type="text" name="sueldo"/>
            <br/><br/>
            ID Departamento: <input type="text" name="idDep"/>
            <br/><br/>
            Telefono: <input type="text" name="telefono"/>
            <br/>
            Email: <input type="text" name="email"/>
            <br/><br/>
            Calle: <input type="text" name="calle"/>
            <br/>
            Pais: <input type="text" name="pais"/>
            <br/>
            <input type="submit" name="Agregar" value="Agregar"/>
        </form> 
        <br/>
        <a href="${pageContext.request.contextPath}/getEmp">Volver</a>
    </body>
</html>
