<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s"  uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CuaFoo</title>
    </head>
    
        <s:form action="CalcularCuadrado">
            <s:if test="%{perimetro != null}">
                <s:text name="cua.foot"/>: <s:property value="perimetro"/><s:text name="(cm)"/>
            </s:if>
        </s:form>
    
</html>
