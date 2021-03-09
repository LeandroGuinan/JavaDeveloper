package it.com.gm.sga.cliente.ciclovidajpa;

import it.com.gm.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EncontrarObjetoJpa {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");

        EntityManager em = emf.createEntityManager();

        

        //Inicia la transaccion 
        //Paso1. Iniciar transaccion
        EntityTransaction tx = em.getTransaction();
        //Paso2. Iniciamos transaccion
        tx.begin();

        //Paso2. Ejecutamos SQL de tipo select
        Persona persona = em.find(Persona.class, 6);
        
        //Paso3. Termina la transaccion
        tx.commit();
        //Objeto en estado de detacht
        log.debug("Objeto Recuperado: " + persona);
        em.close();
    }
}
