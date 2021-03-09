package it.com.gm.capadatos;

import it.com.gm.capadatos.domain.Persona;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.apache.logging.log4j.*;

public class PersonaDaoImpl implements PersonaDao{
    
    Logger log = LogManager.getRootLogger();
    
    @PersistenceContext
    private EntityManager em;
    
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
        em.remove(em.merge(persona));
    }

    @Override
    public Persona findPersonaById(Integer idPersona) {
        return em.find(Persona.class, idPersona);
    }

    @Override
    public List<Persona> findAllPersonas() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Integer contadorPersonas() {
        String consulta = "select count(p) from Persona p";
        Query q = em.createQuery(consulta);
        Integer contador = (Integer) q.getSingleResult();
        return contador;
    }

    @Override
    public Persona getPersonaByEmail(Persona persona) {
        String cadena = "%" + persona.getEmail() + "%";
        String consulta = "from Persona p where upper(p.email) like upper(:param1)";
        Query q = em.createQuery(consulta);
        q.setParameter("param1", cadena);
        return (Persona) q.getSingleResult();
    }
    
}
/*
ahora pasamos a la capa de servicio, donde iniciaremos con una interfece.
*/
