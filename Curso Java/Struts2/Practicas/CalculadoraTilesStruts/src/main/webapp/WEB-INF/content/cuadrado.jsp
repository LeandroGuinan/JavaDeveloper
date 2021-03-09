<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="form.menuC"/></title>
        <s:head/>
    </head>
    <body>
        <s:form action="CalcularCuadrado">
            <s:textfield name="lado1" key="cua.lado1"/> 
            <s:textfield name="lado2" key="cua.lado2"/>
            <s:submit key="cua.bttn"/>
        </s:form>
        <div>
            <s:text name="cua.area"/>: <s:property value="area"/><s:text name="cm^2"/>
        </div>
    </body>
</html>
