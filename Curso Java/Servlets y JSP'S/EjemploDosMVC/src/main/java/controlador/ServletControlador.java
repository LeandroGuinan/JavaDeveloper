package controlador;

import java.io.IOException;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.procesamos los parametros
        String accion = request.getParameter("accion");

        //2.Creamos los JavaBeans
        Rectangulo recRequest = new Rectangulo(1, 2);
        Rectangulo recSesion = new Rectangulo(3, 4);
        Rectangulo recAplicacion = new Rectangulo(5, 6);
        //3.Agregamos el javabean a algun alcance
        
        //revisamos la accion proporcionada
        if("agregaVariables".equals(accion)){
            //alcance request
            request.setAttribute("rectanguloRequest", recRequest);
            //Alcance Session
            HttpSession session = request.getSession();
            session.setAttribute("rectanguloSesion", recSesion);
            
            //Alcance application
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloAplicacion", recAplicacion);
            
            //agregamos un mensaje
            request.setAttribute("mensaje", "Las variables fueron agregadas");
            //4.redireccionamos al jsp de index
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
        else if("listarVariables".equals(accion)){
            //4.redireccionamos al jsp que desplieda las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        }else{
            //4.redireccionamos a la pagina de inicio
            request.setAttribute("mensaje", "accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
            /*usando response.sendRedirect("index.jsp"); tambien podemos redirigir
            al inicio pero no podriamos compartir informacion desde el servlet, ya 
            que no propaga los objetos request y response*/
        }
    }
}
