package mx.com.datos;

import java.util.List;
import javax.persistence.*;
import mx.com.domain.Departamento;

public class DepartamentoDao {

    EntityManagerFactory emf;
    EntityManager em;
    
    public DepartamentoDao(){
        this.emf = Persistence.createEntityManagerFactory("PU");
        this.em = emf.createEntityManager();
    }
    
    public List<Departamento> listarDepartamento(){
        List<Departamento> departamentos = em.createNamedQuery("Departamento.findAll").getResultList();
        return departamentos;
    }
    
    public void insertarDepartamento(Departamento departamento){
        try{
            em.getTransaction().begin();
            em.persist(departamento);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en insertar departamento");
        }
    }
    
    public void modificarDepartamento(Departamento departamento){
        try{
            em.getTransaction().begin();
            em.merge(departamento);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en modificar departamento");
        }
    }
}
