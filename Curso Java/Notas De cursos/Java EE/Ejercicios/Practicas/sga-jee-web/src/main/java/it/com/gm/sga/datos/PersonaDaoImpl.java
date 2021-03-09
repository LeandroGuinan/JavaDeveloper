package it.com.gm.sga.datos;

import it.com.gm.sga.domain.Persona;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;

//esta inplementacion debe ser un EJB para que pueda inyectarse a la implementacion de persona service
@Stateless
public class PersonaDaoImpl implements PersonaDao{
    
    //debemos inyectar el objeto EntityManager para interactuar con la base de datos, esto se logra a travez del API de persistence
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> findAllPersona() {
        //aqui ejecutamos el query ya definido en la tabla de identidad de persona
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        //en este metodo find especificamos la clase que queremos buscar, y tambien el atributo que buscamos
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        //se pueden crear query's a este nivel tambien, de la forma: 
        Query query = em.createQuery("from Persona p where p.email =: email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona persona) {
        //para agregar un objeto a una base de datos
        em.persist(persona);
    }

    @Override
    public void updatePersona(Persona persona) {
        //este metodo se encarga de sincronizar cualquier modificacion del objeto persona a la base de datos
        em.merge(persona);
    }

    @Override
    public void deletePersona(Persona persona) {
        //en este caso no es posible realizar una eliminacion facilmente, por ende se debe actualizar primero y luego eliminarlo
        em.remove(em.merge(persona));
    }
}
