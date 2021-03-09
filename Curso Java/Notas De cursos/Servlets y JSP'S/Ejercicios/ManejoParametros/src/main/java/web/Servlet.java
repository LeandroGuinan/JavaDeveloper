/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest requues,HttpServletResponse response ) throws IOException{
       //Leer los parametros del formulario html
       String usuario = requues.getParameter("usuario");
       String password = requues.getParameter("password");
       
        System.out.println("usuario = " + usuario);
        System.out.println("password = " + password);
        
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<body>");
        out.print("El parametro usuario es: "+usuario);
        out.print("<br/>");
        out.print("El parametro password es: "+password);
        out.print("</body>");
        out.print("</html>");
        out.close();
    }
}
