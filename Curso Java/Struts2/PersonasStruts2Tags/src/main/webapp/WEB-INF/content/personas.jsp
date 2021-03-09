<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fomulario de Persona</title>
        <s:head/>
    </head>
    <body>
        <h1>Fomulario De Personas</h1>
        <s:form>
            <!-- como estamos creando una veriable de persona que internamente tiene el valor de nombre
                 podemos directamente obtener este valor por medio de:-->
            <s:textfield label="Nombre" name="persona.nombre"/>
            <!-- tambien podemos acceder a atributos mapeados dentro de la clase persona, de forma que: -->
            <s:textfield label="calle" name="persona.domicilo.calle"/>
            <s:textfield label="No. Calle" name="persona.domicilo.numeroCalle"/>
            <s:textfield label="Pais" name="persona.domicilo.pais"/>
            <s:submit value="Enviar"/>
        </s:form>
            <h2>Valores Proporcionados</h2>
            Nombre: <s:property value="persona.nombre"/><br/>
            Calle: <s:property value="persona.domicilo.calle"/><br/>
            No. Calle: <s:property value="persona.domicilo.numeroCalle"/><br/>
            Pais: <s:property value="persona.domicilo.pais"/>
            <br/>
            
            <s:if test="persona.nombre != null">
                <s:if test="persona.nombre == 'admin'">
                    Es un usuario administrador
                </s:if>
                <s:else>
                    El usuario NO es administrador
                </s:else>
            </s:if>
    </body>
</html>
