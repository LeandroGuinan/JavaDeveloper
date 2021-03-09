package it.com.em.web;

import it.com.em.domain.Persona;
import it.com.em.service.PersonaService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    
    @Inject
    PersonaService personaService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Persona> personas = new ArrayList<>();
        personas = personaService.getListaDePersonas();
        req.setAttribute("personas", personas);
        
        req.getRequestDispatcher("listaPersona.jsp").forward(req, resp);
    }
    
    
}
