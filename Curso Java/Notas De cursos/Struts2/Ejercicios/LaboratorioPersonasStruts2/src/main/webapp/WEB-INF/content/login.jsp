<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><s:property value="head"/></title>
    </head>
    <body>
        <h1><s:property value="head"/></h1>
        <s:form>
            <s:textfield name="user" key="login.us"/>
            <s:password name="pass" key="login.ps"/>
            <s:submit key="login.bt" name="submit"/>
        </s:form>
        <br/>
        <div>
            <h4><s:property value="titulo"/></h4>
            <s:property value="us"/>: <s:property value="user"/><br/>
            <s:property value="ps"/>: <s:property value="pass"/>
        </div>
    </body>
</html>
