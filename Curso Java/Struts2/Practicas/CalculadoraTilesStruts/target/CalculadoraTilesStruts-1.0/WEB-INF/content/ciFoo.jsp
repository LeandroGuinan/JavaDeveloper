<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CirFoo</title>
    </head>
    <body>
        <s:form action="calcularCirculo">
            <s:if test="%{perimetro != null}">
                <s:text name="ci.foot"/>:<s:property value="perimetro"/><s:text name="(cm)"/>
            </s:if>
        </s:form>
    </body>
</html>
