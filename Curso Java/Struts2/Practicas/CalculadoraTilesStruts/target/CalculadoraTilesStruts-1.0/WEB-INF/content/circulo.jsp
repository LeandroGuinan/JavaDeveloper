<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:text name="form.head"/></title>
        <s:head/>
    </head>
    <body>
        <s:form action="calcularCirculo">
            <s:textfield name="radio" key="ci.radio"/>
            <s:submit key="ci.bttn"/>
        </s:form>
        
        <div>
            <s:text name="ci.area"/>:<s:property value="area"/><s:text name="cm^2"/>
        </div>
    </body>
</html>
