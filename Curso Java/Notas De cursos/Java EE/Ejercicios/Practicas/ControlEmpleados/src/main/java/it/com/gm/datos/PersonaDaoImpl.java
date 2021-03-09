package it.com.gm.datos;

import it.com.gm.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

@Stateless
public class PersonaDaoImpl implements PersonaDao{
        
        @PersistenceContext(name="ControlClientes")
        EntityManager em;

    @Override
    public List<Persona> findAllPersona() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public void insertPersona(Persona persona) {
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        em.remove(persona);
    }
}
