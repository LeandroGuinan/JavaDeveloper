package mx.com.datos;

import java.util.List;
import javax.persistence.*;
import javax.persistence.Persistence;
import mx.com.domain.Direccion;

public class DireccionDao {

    EntityManagerFactory emf;
    EntityManager em;
    
    public DireccionDao(){
        this.emf = Persistence.createEntityManagerFactory("PU");
        this.em = emf.createEntityManager();
    }
    
    public List<Direccion> listarDirecciones(){
        List<Direccion> direcciones = em.createNamedQuery("Direccion.findAll").getResultList();
        return direcciones;
    }
    
    public void insertarDireccion(Direccion direccion){
        try{
            em.getTransaction().begin();
            em.persist(direccion);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en insertar direccion");
        }
    }
    
    public void modificarDireccion(Direccion direccion){
        try{
            em.getTransaction().begin();
            em.persist(direccion);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en modificar direccion");
        }
    }
}
