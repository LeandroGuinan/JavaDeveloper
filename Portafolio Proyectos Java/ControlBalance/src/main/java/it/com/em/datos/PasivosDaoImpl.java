package it.com.em.datos;

import it.com.em.domain.Pasivos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PasivosDaoImpl implements PasivosDao{
    
    @PersistenceContext(name="EmpresaPU")
    EntityManager em;

    @Override
    public List<Pasivos> findAllPasivos() {
        return em.createNamedQuery("Pasivos.findAll").getResultList();
    }

    @Override
    public Pasivos findPasivosById(Pasivos pasivos) {
        return em.find(Pasivos.class, pasivos.getIdPasivos());
    }

    @Override
    public Pasivos findPasivosByCantidad(Pasivos pasivos) {
        return em.find(Pasivos.class, pasivos.getCantidad());
    }

    @Override
    public Pasivos findPasivosByFecha(Pasivos pasivos) {
        return em.find(Pasivos.class, pasivos.getFecha());
    }

    @Override
    public void insertPasivos(Pasivos pasivos) {
        em.persist(pasivos);
    }

    @Override
    public void updatePasivos(Pasivos pasivos) {
        em.merge(pasivos);
    }
}
