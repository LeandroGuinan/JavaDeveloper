<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="form.titulo"/></title>
        <s:head/>
    </head>
    <body>
        <h1><s:text name="form.titulo"/></h1>
        <s:form>
            <!-- como estamos creando una veriable de persona que internamente tiene el valor de nombre
                 podemos directamente obtener este valor por medio de:-->
            <s:textfield key="form.nombre" name="persona.nombre"/>
            <!-- tambien podemos acceder a atributos mapeados dentro de la clase persona, de forma que: -->
            <s:textfield key="form.calle" name="persona.domicilo.calle"/>
            <s:textfield key="form.no.calle" name="persona.domicilo.numeroCalle"/>
            <s:textfield key="form.pais" name="persona.domicilo.pais"/>
            <s:submit key="form.enviar"/>
        </s:form>
        <h2><s:text name="form.resultado"/></h2>
        <s:text name="form.nombre"/>: <s:property value="persona.nombre"/><br/>
        <s:text name="form.calle"/>: <s:property value="persona.domicilo.calle"/><br/>
        <s:text name="form.no.calle"/>: <s:property value="persona.domicilo.numeroCalle"/><br/>
        <s:text name="form.pais"/>: <s:property value="persona.domicilo.pais"/>

        <!-- creamos 2 url's para que el usuario seleccione el idioma que desea utilizar -->
        <s:url var="localeES" action="personas">
            <!-- ya que extendemos de actionSupport, podemos simplemente seleccionar el idioma configurado que queremos ver -->
            <s:param name="request_locale">es</s:param>
        </s:url>

        <!-- creamos 2 url's para que el usuario seleccione el idioma que desea utilizar -->
        <s:url var="localeEN" action="personas">
            <!-- ya que extendemos de actionSupport, podemos simplemente seleccionar el idioma configurado que queremos ver -->
            <s:param name="request_locale">en</s:param>
        </s:url>
            <br/>
        <!-- con esto le damos el control de los links creados al usuario -->
        <s:a href="%{localeES}"> <s:text name="form.idioma.esp"/> </s:a>    
            |
        <s:a href="%{localeEN}"> <s:text name="form.idioma.en"/> </s:a>
    </body>
</html>
