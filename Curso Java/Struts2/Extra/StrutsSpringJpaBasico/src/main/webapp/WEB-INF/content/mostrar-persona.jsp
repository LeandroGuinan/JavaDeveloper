<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="persona.titulo"/></title>
    </head>
    <body>
        <h1><s:text name="persona.titulo"/></h1>
        <s:if test="persona.size() > 0">
            <div>
                <table border="1">
                    <tr>
                        <th><s:text name="p.idPersona"/></th>
                        <th><s:text name="p.nombre"/></th>
                        <th><s:text name="p.apellido"/></th>
                        <th><s:text name="p.email"/></th>
                        <th><s:text name="p.telefono"/></th>
                    </tr>
                    <s:iterator value="personas">
                        <tr>
                            <td><s:property value="idPersona"/></td>
                            <td><s:property value="nombre"/></td>
                            <td><s:property value="apellido"/></td>
                            <td><s:property value="email"/></td>
                            <td><s:property value="telefono"/></td>
                        </tr>
                    </s:iterator>
                </table>
            </div>
        </s:if>
        <s:form>
            <s:submit key="persona.boton" name="submit"/>
        </s:form>
        <div>
            <s:text name="persona.contador"/><s:property value="contadorPersonas"/>
        </div>
    </body>
</html>
<!-- a este punto la aplicacion esta lista, solo un detalle mas, se debe agregar el log4j2.xml en src/main/reso...
     y hacer clean and build-->