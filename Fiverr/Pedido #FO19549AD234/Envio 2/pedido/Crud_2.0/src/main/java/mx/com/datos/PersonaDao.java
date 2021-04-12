package mx.com.datos;

import java.util.List;
import javax.persistence.*;
import mx.com.domain.Persona;

public class PersonaDao {

    EntityManagerFactory emf;
    EntityManager em;

    public PersonaDao() {
        this.emf = Persistence.createEntityManagerFactory("PU");
        this.em = emf.createEntityManager();
    }

    public List<Persona> listarPersonas() {
        List<Persona> personas = em.createNamedQuery("Persona.findAll").getResultList();
        return personas;
    }

    public void insertarPersona(Persona persona) {
        try {
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            System.out.println("Error en insertar persona");
        }

    }

    public void modificarPersona(Persona persona) {
        try{
            em.getTransaction().begin();
            em.merge(persona);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en modificar persona");
        }
    }
    
    public void eliminarPersona(Persona persona){
        try{
            em.getTransaction().begin();
            em.remove(em.merge(persona));
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en eliminar persona");
        }
    }
}
