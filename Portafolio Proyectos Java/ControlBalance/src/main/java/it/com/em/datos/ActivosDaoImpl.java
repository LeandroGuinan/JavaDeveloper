package it.com.em.datos;

import it.com.em.domain.Activos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class ActivosDaoImpl implements ActivosDao{
    
    @PersistenceContext(name="EmpresaPU")
    EntityManager em;

    @Override
    public List<Activos> findAllActivos() {
        List<Activos> activos = em.createNamedQuery("Activos.findAll").getResultList();
        return activos;
    }

    @Override
    public Activos findActivoById(Activos activos) {
        return em.find(Activos.class, activos.getIdActivos());
    }

    @Override
    public Activos findActivosByCantidad(Activos activos) {
        return em.find(Activos.class, activos.getCantidad());
    }

    @Override
    public Activos findActivosByFecha(Activos activos) {
        return em.find(Activos.class, activos.getFecha());
    }

    @Override
    public void insertActivos(Activos activos) {
        em.persist(activos);
    }

    @Override
    public void updateActivos(Activos activos) {
        em.merge(activos);
    }
}
