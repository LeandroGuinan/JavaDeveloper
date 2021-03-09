package it.com.gm.dao;

import it.com.gm.domain.Persona;
import java.util.List;
import javax.persistence.*;

public class PersonaDao {

    private EntityManagerFactory emf;
    private EntityManager em;
    
    //creamos un constructor para inicializar los componentes
    public PersonaDao() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }
    
    
    //creamos el metodo para listar elementos, en este caso la imprime
    //pero bien podria regresarla para iterarla luego
    public void listar() {
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
    
    //creamos el metodo para insertar un registro, por ende debe recibir un objeto
    //del tipo de la clase entidad
    public void insertar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    //creamos el metodo para modificar un registro, el cual tambien recibe un objeto de la clase entidad
    public void modificar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.merge(persona);
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } 
    }
    
    //creamos el metodo eliminar, el cual debe recibir un objeto de la clase entidad
    public void eliminar(Persona persona){
        try {
            em.getTransaction().begin();
            em.remove(em.merge(persona));
            em.getTransaction().commit();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        } 
    }
    
    //con este metodo encontramos una persona por su id correspondiente
    public Persona buscarPersonaPorID(Persona p){
        return em.find(Persona.class, p.getIdPersona());
    }
}
