package it.com.em.web;

import it.com.em.domain.Administracion;
import it.com.em.service.AdministracionService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin")
public class AdministracionServlet extends HttpServlet{
    
    @Inject
    AdministracionService adminService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Administracion> admin = new ArrayList<>();
        
        admin = adminService.getListaDeAdministracion();
        req.setAttribute("admin", admin);
        
        req.getRequestDispatcher("/adminList.jsp").forward(req, resp);
    }
    
    
}
