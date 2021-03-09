package it.com.ae.web;

import it.com.ae.domain.Palabra;
import it.com.ae.domain.PalabraEncriptada;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import it.com.ae.service.GestionarPalabras;

@WebServlet("/palabrasEncriptadas")
public class ServletPalabraE extends HttpServlet{
    
    @Inject
    GestionarPalabras agregarPalabras;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Palabra> palabras = new ArrayList<>();
        List<PalabraEncriptada> palabrasEncriptadas = new ArrayList<>();
        
        palabras = agregarPalabras.cargarListaDePalabras();
        palabrasEncriptadas = agregarPalabras.encriptarPalabras();
        
        request.setAttribute("palabras", palabras);
        request.setAttribute("palarasEncriptadas", palabrasEncriptadas);
        
        request.getRequestDispatcher("/listadoPalabras.jsp").forward(request, response);
        
        
    }
}
