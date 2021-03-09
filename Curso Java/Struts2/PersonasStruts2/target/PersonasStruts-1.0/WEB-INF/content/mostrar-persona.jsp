<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- ya que utilizamos el comcepto de beans, llamamos directamente el titulo por medio del metodo en la clase action -->
        <title><s:property value="titulo"/></title>
    </head>
    <body>
        
        <!-- al tener los tags de struts cargados en esta pagina, podemos hacer uso de los elementos
        en la clase que aloja el metodo execution(en este caso: beans.HolaMundoAction)-->
        <h1><s:property value="titulo"/></h1>
        <!-- añadimos un formulario que captura el valor de nombre en un textfield, con este se modifica en la clase action -->
        <s:form>
            <s:textfield name="nombre"/>
            <!-- aqui hacemos referencia directamente al nombre de la llave que queremos acceder -->
            <s:submit key="persona.boton" name="submit"/>
        </s:form>
        <!-- y desplegamos el valor de nombre -->
        <div>
            <!-- indirectamente se manda a llamar el metodo getValor de la clase action -->
            <s:property value="valor"/>
            <s:property value="nombre"/>
        </div>
        <!-- Devido a que no se configuro ninguna accion, struts utiliza por default la accion asociada
             al path en este jsp(el nombre:mostrar-persona)-->
    </body>
</html>
