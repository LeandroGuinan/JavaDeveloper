package it.com.gm.servicio;

import it.com.gm.dao.UsuarioDao;
import it.com.gm.domain.Rol;
import it.com.gm.domain.Usuario;
import java.util.ArrayList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//debemos crear un servicio, pero apuntando al servicio existente:
@Service("userDetailsService")
//para que se reconozca como tal.
//y añadimos el archivo de log de lombook:
@Slf4j
//debemos extender de esta clase para poder sobreescribir su unico metodo:
public class UsuarioService implements UserDetailsService {
    
    //inyectamos la capa dao:
    @Autowired
    private UsuarioDao usuarioDao;
    
    @Override
    //indicamos que se abrira una transaccion de solo lectura:
    @Transactional(readOnly= true)
    //se debe crear un userDetails, tal como se escribe, de lo contrario no funcionara
    //debe recibir un usuario:
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //creamos un nuevo usuario en memoria y lo buscamos en la base de datos con el objeto inyectado
        Usuario usuario = usuarioDao.findByUsername(username);
        
        //hacemos la pregunta: si el usuario no existe entonces envia una exepcion
        if (usuario == null) {
            throw new UsernameNotFoundException(username);
        } else {
            //de lo contrario, creamos una lista de roles, pero que solo acepte autorizaciones: (paquete spring):
            var roles = new ArrayList<GrantedAuthority>();
            
            //por cada elemento de usuario, creamos un nuevo rol
            for (Rol rol : usuario.getRoles()) {
                //y a la lista le añadimos el rol de estos, utilizando las clases:
                roles.add(new SimpleGrantedAuthority(rol.getNombre()));
            }
            //finalmente regresamos el usuario, la contraseña, y el rol de este:(clase user de spring)
            return new User(usuario.getUsername(), usuario.getPassword(), roles);
        }
    }

}
