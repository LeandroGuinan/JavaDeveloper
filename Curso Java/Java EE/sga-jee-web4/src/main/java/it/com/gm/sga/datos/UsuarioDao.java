
package it.com.gm.sga.datos;

import it.com.gm.sga.domain.Usuario;
import java.util.List;


public interface UsuarioDao {
    
    public List<Usuario> findAllUsuarios();
    
    public Usuario findUsuarioById(Usuario us);
    
    public void insertUsuario(Usuario us);
    
    public void modificarUsuario(Usuario us);
    
    public void eliminarUsuario(Usuario us);
}
