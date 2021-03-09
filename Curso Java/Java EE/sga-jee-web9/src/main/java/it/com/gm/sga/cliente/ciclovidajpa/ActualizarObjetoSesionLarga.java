package it.com.gm.sga.cliente.ciclovidajpa;

import it.com.gm.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoSesionLarga {
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");

        EntityManager em = emf.createEntityManager();

        

        //Inicia la transaccion 
        //Paso1. Iniciar transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        //Paso2. Ejecutamos el SQL de tipo select
        Persona persona1 = em.find(Persona.class, 1);
        
        log.debug("Objeto Encontrado: "+persona1);
        
        //Paso3. setValue(nuevoValor)
        persona1.setEmail("JJuarez@mail.com");
        persona1.setEmail("j.juarez@mail.com");
        
        //Paso4. termina la transaccion
        tx.commit();
        
        //Objeto en estado de detacht
        log.debug("Objeto modificado: "+persona1);
        
        //Cerramos el entity manager
        em.close();
    }
}
