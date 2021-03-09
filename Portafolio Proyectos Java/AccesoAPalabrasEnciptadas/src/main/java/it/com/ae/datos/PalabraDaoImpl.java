package it.com.ae.datos;

import it.com.ae.domain.Palabra;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PalabraDaoImpl implements PalabraDao{
    
    @PersistenceContext(unitName="PalabraPU")
    EntityManager em;
    
    @Override
    public List<Palabra> findAllPalabra() {
        return em.createNamedQuery("Palabra.findAll").getResultList();
    }
    
}
