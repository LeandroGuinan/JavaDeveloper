package it.com.gm.sga.cliente.ciclovidajpa;

import it.com.gm.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EliminarObjetoJPA {
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");

        EntityManager em = emf.createEntityManager();

        

        //Inicia la transaccion 
        //Paso1. Iniciar transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso2. Ejecutamos SQL de tipo select
        Persona persona1 = em.find(Persona.class, 6);
        
        
        /*si estamos en la misma transaccion se puede simplemente:
        em.remove(persona);
        tx.commit();
        con estos dos metodos se elimina el objeto seleccionado.
        pero asumiendo que no estamos en la misma transaccion
        */
        
        //Paso3.terminamos la transaccion
        tx.commit();
        
        //Objeto en etado detacht
        log.debug("Objeto encontrado: " + persona1);
        
        //Paso4. Inicia Transaccion 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();
        
        //Paso5. Ejecutamos SQL que es un delete
        em.remove(em.merge(persona1));
        
        //Paso6. Termina transaccion2
        tx2.commit();
        
        //Objeto en estado detached ya eliminado
        log.debug("Objeto eliminado: " + persona1);
        
        //Cerramos el entity manager
        em.close();
    }
}
