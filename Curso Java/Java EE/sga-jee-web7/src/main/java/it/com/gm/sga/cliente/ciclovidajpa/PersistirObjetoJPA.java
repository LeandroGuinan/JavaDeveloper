package it.com.gm.sga.cliente.ciclovidajpa;

import it.com.gm.sga.domain.Persona;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class PersistirObjetoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        
        EntityManager em =  emf.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
        
        //Inicia la transaccion 
        
        //Paso1. crea nuevo objeto
        //objeto esta en estado transitivo
        
        Persona persona1 = new Persona("Pedro", "Luna", "Pluna@mail.com", "88992255");
        
        //Paso2. Iniciamos transaccion
        
        tx.begin();
        
        //Paso3. Ejecutamos SQL
        em.persist(persona1);
         log.debug("OBJETO PERSISTIDO - AUN SIN COMMIT: " + persona1);
        //paso4. commit/rollback
        
        tx.commit();
        //Objeto en estado detached
        log.debug("OBJETO PERSISTIDO - ESTADO DETACHED: " + persona1);
        
        //Cerramos el entity manager
        em.close();
    }
}
