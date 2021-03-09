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

@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession sesion = request.getSession();
        String titulo = null;
        
        //pedir el atributo contador visitas a la sesion
        
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        //si es nulo es la primera vez que accedemos a la aplicacion.
        
        if(contadorVisitas == null){
            contadorVisitas = 1;
            titulo= "Benvenuto per prima volta";
        }else{
            contadorVisitas++;
            titulo = "Benvenuti di nuevo";
        }
        
        //agregamos el nuevo valor a la sesion
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        //mandamos la respuesta al cliente
        
        PrintWriter out = response.getWriter();
        out.print(titulo);
        out.print("<br>");
        out.print("no. accesos al recurso: " + contadorVisitas);
        out.print("<br>");
        out.print("ID de la sesion: " + sesion.getId());
        out.close();
        
        
    }
}
