package it.com.ae.web;

import it.com.ae.domain.Palabra;
import it.com.ae.service.PalabraService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/palabras")
public class PalabraServlet extends HttpServlet{
    
    @Inject
    PalabraService palabraService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Palabra> palabras = new ArrayList();
        
        palabras = palabraService.encontrarPalabras();
        
        req.setAttribute("palabras", palabras);
        
        req.getRequestDispatcher("/listadoPalabras.jsp").forward(req, resp);
    }
    
    
}
