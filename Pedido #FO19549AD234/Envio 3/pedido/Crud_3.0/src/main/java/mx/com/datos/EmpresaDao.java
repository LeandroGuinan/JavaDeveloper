package mx.com.datos;

import java.util.List;
import javax.persistence.*;
import mx.com.domain.Empresa;

public class EmpresaDao {

    EntityManagerFactory emf;
    EntityManager em;
    
    public EmpresaDao(){
        this.emf = Persistence.createEntityManagerFactory("PU");
        this.em = emf.createEntityManager();
    }
    
    public List<Empresa> listarEmpresas(){
        List<Empresa> empresas = em.createNamedQuery("Empresa.findAll").getResultList();
        return empresas;
    }
    
    public void insertarEmpresa(Empresa empresa){
        try{
            em.getTransaction().begin();
            em.persist(empresa);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en insertar empresa");
        }
    }
    
    public void modificarEmpresa(Empresa empresa){
        try{
            em.getTransaction().begin();
            em.merge(empresa);
            em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en modificar empresa");
        }
    }
}
