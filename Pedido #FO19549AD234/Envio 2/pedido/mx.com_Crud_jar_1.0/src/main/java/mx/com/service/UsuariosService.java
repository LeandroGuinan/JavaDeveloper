package mx.com.service;

import java.util.List;
import mx.com.datos.UsuarioDao;
import mx.com.domain.Usuario;

public class UsuariosService {

    UsuarioDao usDao = new UsuarioDao();

    public List<Usuario> listarUsuarios() {
        return usDao.listarUsuarios();
    }
    
    public Usuario encontrarPorId(Usuario usuario){
        return usDao.encontrarPorId(usuario);
    }

    public void insertarUsuario(Usuario usuario) {
        usDao.insertarUsuarios(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        usDao.eliminarUsuario(usuario);
    }
    
    public void modificarUsuario(Usuario usuario){
        usDao.modificarUsuario(usuario);
    }

    public Usuario logIn(String usuario, String contraseña) {
        List<Usuario> usuarios = listarUsuarios();
        for (Usuario s : usuarios) {
            if (s.getNombreUsuario().equals(usuario)) {
                if (s.getPasswordUsuario().equals(contraseña)) {
                    return s;
                }
            }

        }
        return null;
    }

}
