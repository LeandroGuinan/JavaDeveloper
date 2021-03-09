package it.com.en.web;

import it.com.en.domain.Palabras;
import it.com.en.servicio.PalabrasService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/palabra")
public class PalabrasServlet extends HttpServlet{
    
    @Inject
    PalabrasService palabraService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Palabras> palabras = this.palabraService.listarPalabras();
        req.setAttribute("palabras", palabras);
        req.getRequestDispatcher("listaPalabras.jsp").forward(req, resp);
    }
    
    
}
