package it.com.em.datos;

import it.com.em.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class PersonaDaoImpl implements PersonaDao{
    @PersistenceContext(unitName="EmpresaPU")
    EntityManager em;

    @Override
    public List<Persona> getAllPersona() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }
}
