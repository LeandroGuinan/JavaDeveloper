package it.com.gm.sga.cliente.ciclodevidajpa;

import it.com.gm.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoJPA {
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
        
        //Paso2. Ejecutamos SQL de tipo select para encontrar el objeto a actualizar
        //el id proporcionado debe existir en la base de datos
        Persona persona1 = em.find(Persona.class, 17);
        
        //Paso3. termina la transaccion 1
        ts.commit();
        
        //Objeto en estado de detached
        log.debug("Objeto Recuperado: " + persona1);
        
        //Paso4. Modificamos un atributo del objeto 
        persona1.setApellido("Perez");
        
        //Paso5. Inicia Transaccion2
        EntityTransaction ts2 = em.getTransaction();
        ts2.begin();
        
        //Paso6. Modificamos el objeto
        em.merge(persona1);
        
        //Paso7. Termina la transaccion
        ts2.commit();
        
        //objeto ya modificado
        log.debug("Objeto Recuperado: " +persona1);
        //Cerramos el EntityManager
        em.close();
    }
}
