
package it.com.sga.web;

import it.com.gm.sga.domain.Persona;
import it.com.gm.sga.servicio.PersonaService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

//esta clase se utiliza para poder conectar con la capa de servicio en esta aplicacion, por ende es un servlet:
@WebServlet("/personas")
public class PersonaServletSinUtilizar extends HttpServlet{
    
    //esta anotacion se utiliza para hacer una llamada al EJB local, que en este caso es la interface PersonaService
    @Inject
    PersonaService personaService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        //en esta llamada tomamos la lista de persoanas que esta en alcance local:
        List<Persona> personas = personaService.listarPersona();
        System.out.println("Personas: " + personas);
        //aqui estamos poniendo en alcance la variable para utilizarla en la pagina web:
        request.setAttribute("personas", personas);
        
        //con esto enviamos los alcances previamente establecidos y lo dejamos en alcance de un unico JSP 
        request.getRequestDispatcher("/listadoPersonas.jsp").forward(request, response);
    }
}
