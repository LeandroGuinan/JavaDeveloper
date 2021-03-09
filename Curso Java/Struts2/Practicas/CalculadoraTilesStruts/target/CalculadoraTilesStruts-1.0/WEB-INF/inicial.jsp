<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <title><s:text name="form.head"/></title>
    </head>
    <body>
        <table border="1" cellpadding="2" cellspacing="2" aling="center">
            <tr>
                <td height="30">
                    <tiles:insertAttribute name="header"/>
                </td>
            </tr>
            <tr>
                <td height="250">
                    <tiles:insertAttribute name="menu"/>
                </td>
                <td height="350">
                    <tiles:insertAttribute name="body"/>
                </td>
            </tr>
            <tr>
                <td height="30" colspan="2">
                    <tiles:insertAttribute name="footer"/>
                </td>
            </tr>
        </table>
        <s:url var="localeES" action="entradaAction">
            <s:param name="request_locale">es</s:param>
        </s:url>
        <s:url var="localeEN" action="entradaAction">
            <s:param name="request_locale">en</s:param>
        </s:url>
        
        <s:url var="localeIT" action="entradaAction">
            <s:param name="request_locale">it</s:param>
        </s:url>    
        
            <s:a href="%{localeES}"><s:text name="form.id.es"/></s:a>
            <br/>
            <s:a href="%{localeEN}"><s:text name="form.id.en"/></s:a>
            <br/>
            <s:a href="%{localeIT}"><s:text name="form.id.it"/></s:a>

    </body>
</html>
