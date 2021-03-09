<%@page import="utilerias.Conversiones, java.util.Date" %>
<%@page contentType="application/vnd.ms-excel" %>
<%@page errorPage="WEB-INF/manejoErrores.jsp" %>
<%
    String nombreArcivo = "reporte.xls";
    response.setHeader("Content-Disposition", "inline;filename=" + nombreArcivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Reporte de Excel</title>
    </head>
    <body>
        <h1>Reporte de Excel</h1>
        <br>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripcion</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1.Fundamentos de JAVA</td>
                <td>Aprenderemos la sintaxis basica de Java</td>
                <td><%= Conversiones.format(new Date())  %></td>
            </tr>
            <tr>
                <td>2.Programacion con JAVA</td>
                <td>Pondremos en practica conceptos de la programacion orientada a objetos</td>
                <td><%= Conversiones.format(new Date())  %></td>
            </tr>

        </table>
    </body>
</html>
