package it.com.em.datos;

import it.com.em.domain.Taller;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TallerDaoImpl implements TallerDao{
    
    @PersistenceContext(unitName="EmpresaPU")
    EntityManager em;

    @Override
    public List<Taller> getAllTaller() {
        return em.createNamedQuery("Taller.findAll").getResultList();
    }
}
