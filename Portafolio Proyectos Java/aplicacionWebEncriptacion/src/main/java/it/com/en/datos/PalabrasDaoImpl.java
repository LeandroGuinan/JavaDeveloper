package it.com.en.datos;

import it.com.en.domain.Palabras;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PalabrasDaoImpl implements PalabrasDao{
    
    @PersistenceContext(unitName="PalabraPU")
    EntityManager em;
    
    @Override
    public List<Palabras> findAllPalabras() {
        return em.createNamedQuery("Palabras.findAll").getResultList();
    }

    @Override
    public Palabras findPalabrasById(Integer idToDec) {
        return em.find(Palabras.class, idToDec);
    }

    @Override
    public void insertPalabra(String palabra) {
        Palabras wrd = new Palabras(palabra);
        em.persist(wrd);
    }
    
}
