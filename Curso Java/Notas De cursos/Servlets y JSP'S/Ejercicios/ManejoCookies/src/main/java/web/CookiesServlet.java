/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
    

    
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
        //suponemos que el usuario visita por primera vez nuestro sitio
        boolean nuevoUsuario = true;
        //Obtenemos el arreglo de cookies
        Cookie[] cookies = request.getCookies();

        //buscamos si ya existe una cookie creada con anterioridad
        //llamada visitante recurrente
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")) {
                    //si ya existe la cookie es un usuario recurrente
                    nuevoUsuario = false;
                    break;
                }
            }
            
            String mensaje = null;
            
            if(nuevoUsuario){
                Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
                
                response.addCookie(visitanteCookie);
                
                mensaje = "Gracias bruja por llegarte causa";
                
            }else{
                
                mensaje="a verga primo sois vos otra vez";
                
            }
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Cookie</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("<h1>Beta: " + mensaje+"</h1");
            out.print("</body>");
            out.print("</html>");
            out.close();
        }
    }
}
