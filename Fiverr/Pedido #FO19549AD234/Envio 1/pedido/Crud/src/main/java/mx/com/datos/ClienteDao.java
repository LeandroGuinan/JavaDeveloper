package mx.com.datos;

import java.util.List;
import javax.persistence.*;
import mx.com.domain.Cliente;

public class ClienteDao {

    EntityManagerFactory emf;
    EntityManager em;

    public ClienteDao() {
        this.emf = Persistence.createEntityManagerFactory("PU");
        this.em = emf.createEntityManager();
    }
    
    public List<Cliente> listarClientes(){
        List<Cliente> clientes = em.createNamedQuery("Cliente.findAll").getResultList();
        return clientes;
    }
    public void insertarCliente(Cliente cliente){
        try{
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en insertar cliente");
        }
    }
    
    public void modificarCliente(Cliente cliente){
        try{
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
            
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            System.out.println("Error en modificar cliente");
        }
    }
    
    public void eliminarCliente(Cliente cliente){
        try{
            em.getTransaction().begin();
            em.remove(em.merge(cliente));
            em.getTransaction().commit();
            
        }catch(Exception ex){
            System.out.println("Error en eliminar cliente");
            ex.printStackTrace(System.out);
        }
    }
    
    public Cliente encontrarPorID(Cliente cliente){
        return em.find(Cliente.class, cliente.getIdCliente());
    }
    
    public List<Cliente> encontrarPorNombre(Cliente cliente){
        String jpql = "select c from Cliente c where c.nombre='"+cliente.getNombre()+"'";
        List<Cliente> clientes = em.createQuery(jpql).getResultList();
        return clientes;
    }
    
    public List<Cliente> encontrarPorCUI(Cliente cliente){
        String jpql = "select c from Cliente c where c.cui='"+cliente.getCui()+"'";
        List<Cliente> clientes = em.createQuery(jpql).getResultList();
        return clientes;
    }
    
    public List<Cliente> encontrarPorNit(Cliente cliente){
        String jpql = "select c from Cliente c where c.nit='"+cliente.getNit()+"'";
        List<Cliente> clientes = em.createQuery(jpql).getResultList();
        return clientes;
    }
}
