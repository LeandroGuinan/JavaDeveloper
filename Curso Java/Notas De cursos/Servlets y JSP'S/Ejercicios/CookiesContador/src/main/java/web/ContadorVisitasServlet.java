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

@WebServlet("/ContadorVisitasServlet")
public class ContadorVisitasServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        //Declaramos la variable contador
        int contador = 0;
        
        //revisamos si existe la cookie contadorVisitas
        
        Cookie[] cokiees = request.getCookies();
        
        if(cokiees != null){
            for (Cookie c: cokiees) {
                if(c.getName().equals("contadorVisitas")){
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        
        //incrementar el contador en uno
        contador++;
        
        //agregamos la respuesta al navegador
        
        Cookie c = new Cookie("contadorVisitas",Integer.toString(contador));
        //la cookie se almacenara en el cliente por una hora(3600s)
        c.setMaxAge(3600);
        response.addCookie(c);
        
        //mandamos el mensaje al navegador
        
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente: "+contador);
    }
}
