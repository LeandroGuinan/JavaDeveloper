package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;

/**
 *
 * @author guina
 */
@WebServlet("/ServletHeaders")
public class Servlet extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest requets, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String metodoHttp = requets.getMethod();
        
        out.print("<html>");
        out.print("<head>");
        out.print("<title>Headers Http</title>");
        out.print("</head>");
        
        out.print("<body>");
        out.print("<h1>HeadersHttp</h1>");
        out.print("<br>");
        out.print("Metodo Http: "+metodoHttp);
        
        String uri = requets.getRequestURI();
        
        out.print("<br>");
        out.print("Uri Solicitada: "+uri);
        
        //Imprimimos todos los cabeceros disponibles
        out.print("<br>");
                out.print("<br>");
        Enumeration cabeceros = requets.getHeaderNames();
        
        while(cabeceros.hasMoreElements()){
            String nombreCabecero =(String) cabeceros.nextElement();
            out.print("<b>"+nombreCabecero+"</b>:");
            out.print(requets.getHeader(nombreCabecero));
            out.print("<br>");
        }
        out.print("</body>");
        out.print("</html>");
        
        out.close();
                
    }
}
