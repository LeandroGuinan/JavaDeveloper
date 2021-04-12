package mx.com.datos;

import java.util.List;
import javax.persistence.*;
import javax.persistence.Persistence;
import mx.com.domain.Municipio;

public class MunicipioDao {

    EntityManagerFactory emf;
    EntityManager em;
    
    public MunicipioDao(){
        this.emf = Persistence.createEntityManagerFactory("PU");
        this.em = emf.createEntityManager();
    }
    
    public List<Municipio> listarMunicipios(){
        List<Municipio> municipios = em.createNamedQuery("Municipio.findAll").getResultList();
        return municipios;
    }
    
    public void insetarMunicipio(Municipio municipio){
        try{
            em.getTransaction().begin();
            em.persist(municipio);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en insertar municipio");
        }
    }
    
    public void modificarMunicipio(Municipio municipio){
        try{
            em.getTransaction().begin();
            em.merge(municipio);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en modificar municipio");
        }
    }
}
