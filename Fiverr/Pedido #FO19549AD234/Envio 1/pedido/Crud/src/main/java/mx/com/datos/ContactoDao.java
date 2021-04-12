package mx.com.datos;

import java.util.List;
import javax.persistence.*;
import mx.com.domain.Contacto;

public class ContactoDao {

    EntityManagerFactory emf;
    EntityManager em;
    
    public ContactoDao(){
        this.emf = Persistence.createEntityManagerFactory("PU");
        this.em = emf.createEntityManager();
    }
    
    public List<Contacto> listarContactos(){
        List<Contacto> contactos = em.createNamedQuery("Contacto.findAll").getResultList();
        return contactos;
    }
    public void insertarContacto(Contacto contacto){
        try{
            em.getTransaction().begin();
            em.persist(contacto);
            em.getTransaction().commit();
            
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("error en insertar contacto");
        }
    }
    
    public void modificarContacto(Contacto contacto){
        try{
            em.getTransaction().begin();
            em.merge(contacto);
            em.getTransaction().commit();
        }catch(Exception ex){
           ex.printStackTrace(System.out);
            System.out.println("Error en modificar contacto");
        }
    }
}
