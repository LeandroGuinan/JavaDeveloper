package it.com.em.datos;

import it.com.em.domain.Administracion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class AdministracionDaoImpl implements AdministracionDao{
    @PersistenceContext(unitName="EmpresaPU")
    EntityManager em;

    @Override
    public List<Administracion> getAllAdministracion() {
        return em.createNamedQuery("Administracion.findAll").getResultList();
    }
}
