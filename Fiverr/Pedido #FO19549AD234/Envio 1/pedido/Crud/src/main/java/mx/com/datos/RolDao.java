package mx.com.datos;

import java.util.List;
import javax.persistence.*;
import mx.com.domain.Rol;

public class RolDao {

    EntityManagerFactory emf;
    EntityManager em;
    
    public RolDao(){
        this.emf = Persistence.createEntityManagerFactory("PU");
        this.em = emf.createEntityManager();
    }
    
    public List<Rol> listarRoles(){
        List<Rol> roles = em.createNamedQuery("Rol.findAll").getResultList();
        return roles;
    }
}
