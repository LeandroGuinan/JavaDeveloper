package it.com.em.web;

import it.com.em.domain.Taller;
import it.com.em.service.TallerService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/taller")
public class TallerServlet extends HttpServlet{
    
    @Inject
    TallerService tallerService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Taller> taller = new ArrayList<>();
        
        taller = tallerService.getListaTaller();
        req.setAttribute("taller", taller);
        
        req.getRequestDispatcher("/listaTaller.jsp").forward(req, resp);
    }
    
    
}
