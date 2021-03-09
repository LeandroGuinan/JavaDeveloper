
package it.com.gm.sga.cliente.ciclodevidajpa;

import it.com.gm.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ActualizarObjetoSesionLarga {
    //este se utiliza para manejar nuestro log
    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        //creamos el objeto EntityManagerFactory que hara referencia a nuestra unidad de persistencia
        //que en este momentos esta configurada para su uso local
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");

        //posteriormente creamos el objeto que abrira la transaccion
        EntityManager em = emf.createEntityManager();

        //posteriormente creamos el objeto de transaccion que nos ayudara a modificar la base de datos
        

        //Inicia La Transaccion
        //Paso1. Iniciamos la transaccion
        EntityTransaction ts = em.getTransaction();
        ts.begin();
        
        //Paso2. Ejecutamos el SQL tipo select
        Persona persona1 = em.find(Persona.class, 17);
        
        //Paso3. setValue
        persona1.setEmail("SPerez@Mail.com");
        
        persona1.setEmail("S.Perez@Mail.com");
        
        //Paso4. Termina la transaccion
        ts.commit();
        
        //objeto en estado detached
        
        log.debug("Objeto Encontrado: " + persona1);
        //Cerramos el EntityManager
        em.close();
    }
}
