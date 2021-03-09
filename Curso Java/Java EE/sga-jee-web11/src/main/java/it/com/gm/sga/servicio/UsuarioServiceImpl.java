
package it.com.gm.sga.servicio;

import it.com.gm.sga.datos.UsuarioDao;
import it.com.gm.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class UsuarioServiceImpl implements UsuarioService {

    @Inject
    private UsuarioDao usuarioDao;

    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDao.findAllUsuarios();
    }

    @Override
    public Usuario encontrarPorId(Usuario us) {
        return usuarioDao.findUsuarioById(us);
    }

    @Override
    public void insertarUsuario(Usuario us) {
        usuarioDao.insertUsuario(us);
    }

    @Override
    public void modificarUsuario(Usuario us) {
        usuarioDao.modificarUsuario(us);
    }

    @Override
    public void eliminarUsuario(Usuario us) {
        usuarioDao.eliminarUsuario(us);
    }
}
