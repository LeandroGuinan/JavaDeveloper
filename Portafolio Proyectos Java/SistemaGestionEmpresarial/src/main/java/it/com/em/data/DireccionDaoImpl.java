package it.com.em.data;

import it.com.em.domain.Direccion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DireccionDaoImpl implements DireccionDao{
    
    @PersistenceContext(name="SGEPU")
    EntityManager em;

    @Override
    public List<Direccion> findAllDirecction() {
        return em.createNamedQuery("Direccion.findAll").getResultList();
    }

    @Override
    public Direccion findDireccionByID(Direccion direccion) {
        return em.find(Direccion.class, direccion.getIdDireccion());
    }

    @Override
    public void updateDireccion(Direccion direccion) {
        em.merge(direccion);
    }

    @Override
    public void deleteDireccion(Direccion direccion) {
        em.remove(em.merge(direccion));
    }
}
