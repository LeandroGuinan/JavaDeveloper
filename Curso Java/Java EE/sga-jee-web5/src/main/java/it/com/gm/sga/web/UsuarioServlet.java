
package it.com.gm.sga.web;

import it.com.gm.sga.domain.Usuario;
import it.com.gm.sga.servicio.UsuarioService;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Usuario")
public class UsuarioServlet extends HttpServlet {
    
    @Inject
    UsuarioService usuarioService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        List<Usuario> usuarios = usuarioService.listarUsuarios();
        request.setAttribute("usuario", usuarios);
        request.getRequestDispatcher("/listadoUsuarios.jsp").forward(request, response);
        
    }
            
    
}
