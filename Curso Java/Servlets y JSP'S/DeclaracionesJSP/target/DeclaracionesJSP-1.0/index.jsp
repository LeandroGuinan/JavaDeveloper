<%-- Agregamos una declaracion --%>
<%!
    //declaramos una variable con su metodo get
    private String usuario = "alberto";

    public String getUsuario() {
        return this.usuario;
    }

    //declaramos un contador de visitas
    private int contadorVisitas = 1;
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de Declaraciones</title>
    </head>
    <body>
        <h1>Uso de Declaraciones</h1>
        valor de usuario por medio del atributo: <%= this.usuario %>
        <br>
        Valor usuario por medio del metodo: <%= getUsuario() %>
        <br>
        Contador Visitas: <%=this.contadorVisitas++%>
      
    </body>
</html>
