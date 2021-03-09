package it.com.gm.servicio;

import it.com.gm.dao.RolDao;
import it.com.gm.dao.UsuarioDao;
import it.com.gm.domain.Rol;
import it.com.gm.domain.Usuario;
import it.com.gm.util.EncriptarPassword;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrearUsuarioService {
    
    private static final String rolUser = "ROLE_USER";
    
    @Autowired
    UsuarioDao usDao;
    
    @Autowired
    RolDao rlDao;
    
    @Autowired
    EncriptarPassword util;
    
    public void crearUsuario(Usuario usuario){
        Rol rl = new Rol();
        String ps = usuario.getPassword();
        ps = util.encriptarPassword(ps);
        usuario.setPassword(ps);
        
        rl.setUsuario(usuario);
        rl.setNombre(rolUser);
        rlDao.save(rl);
    }
    
}
