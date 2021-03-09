package it.com.gm.web;

import it.com.gm.domain.Persona;
import it.com.gm.servicio.PersonaService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    
    @Inject
    PersonaService personaService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        List<Persona> personas = this.personaService.encontrarPersonas();
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("/listaPersonas.jsp").forward(request, response);
    }
    
}
