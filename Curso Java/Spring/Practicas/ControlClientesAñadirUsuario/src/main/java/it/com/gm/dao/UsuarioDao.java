package it.com.gm.dao;

import it.com.gm.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

//asi como extendimos de CrudRepository, podemos extender de JpaRepo... que incluye las mimas caracteristicas y añade algunas mejoras
public interface UsuarioDao extends JpaRepository<Usuario,Long>{
    
    //es necesario hacer un return de usuario con este mismo nombre de metodo:
    Usuario findByUsername(String username);
    //tal cual como esta escrito aca
}
