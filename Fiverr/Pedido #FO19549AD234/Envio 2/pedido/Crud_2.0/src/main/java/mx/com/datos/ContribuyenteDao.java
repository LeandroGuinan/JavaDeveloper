package mx.com.datos;

import java.util.List;
import javax.persistence.*;
import mx.com.domain.Contribuyente;

public class ContribuyenteDao {

    EntityManagerFactory emf;
    EntityManager em;
    
    public ContribuyenteDao(){
        this.emf = Persistence.createEntityManagerFactory("PU");
        this.em = emf.createEntityManager();
    }
    
    public List<Contribuyente> listarContribuyentes(){
       List<Contribuyente> contribuyentes = em.createNamedQuery("Contribuyente.findAll").getResultList();
       return contribuyentes;
    }
    
    public void insertarContribuyente(Contribuyente contribuyente){
        try{
            em.getTransaction().begin();
            em.persist(contribuyente);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en insertar contribuyente");
        }
    }
    
    public void modificarContribuyente(Contribuyente contribuyente){
        try{
            em.getTransaction().begin();
            em.merge(contribuyente);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error modificar contribuyente");
        }
    }
    
}
