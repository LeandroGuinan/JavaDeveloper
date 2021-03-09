
package it.com.gm.sga.datos;

import it.com.gm.sga.domain.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class UsuarioDaoImpl implements UsuarioDao {
    
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;

    @Override
    public List<Usuario> findAllUsuarios() {
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findUsuarioById(Usuario us) {
        return em.find(Usuario.class, us.getIdUsuario());
    }

    @Override
    public void insertUsuario(Usuario us) {
        em.persist(us);
    }

    @Override
    public void modificarUsuario(Usuario us) {
        em.merge(us);
    }

    @Override
    public void eliminarUsuario(Usuario us) {
        em.remove(us);
    }
}
