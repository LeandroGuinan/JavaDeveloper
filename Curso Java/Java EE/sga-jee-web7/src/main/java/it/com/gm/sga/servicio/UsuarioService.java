
package it.com.gm.sga.servicio;

import it.com.gm.sga.domain.Usuario;
import java.util.List;


public interface UsuarioService {
    
    
    public List<Usuario> listarUsuarios();
    
    public Usuario encontrarPorId(Usuario us);
    
    public void insertarUsuario(Usuario us);
    
    public void modificarUsuario(Usuario us);
    
    public void eliminarUsuario(Usuario us);
}
