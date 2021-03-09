package it.com.em.web;

import it.com.em.domain.Departamentos;
import it.com.em.service.GestionDepartamento;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getIn")
public class EntradaServlet extends HttpServlet{
   
    @Inject
    GestionDepartamento dep;
    
   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
       List<Departamentos> deps = dep.listarDepartamentos();
       req.setAttribute("deps", deps);
       req.getRequestDispatcher("/Departamentos.jsp").forward(req, res);
   } 
    
}
