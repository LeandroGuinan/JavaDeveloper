<% 
    String colorFondo = request.getParameter("colorFondo");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body bgcolor='<%=colorFondo%>'>
        <br/>
        Color de fondo: <%=colorFondo %>
    </body>
</html>
