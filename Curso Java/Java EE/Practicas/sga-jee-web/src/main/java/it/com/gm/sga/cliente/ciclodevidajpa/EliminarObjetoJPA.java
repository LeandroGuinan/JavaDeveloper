/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.com.gm.sga.cliente.ciclodevidajpa;

import it.com.gm.sga.domain.Persona;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author guina
 */
public class EliminarObjetoJPA {
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
        
        //Paso2. Ejecutamos SQL de tipo select
        Persona persona1 = em.find(Persona.class, 17);
        
        //Paso3.Termina la transaccion 1
        ts.commit();
        
        //Objeto en estado detached
        log.debug("Objeto Encontrado: " + persona1);
        
        //Paso4. Inicia transaccion2 
        EntityTransaction ts2 = em.getTransaction();
        ts2.begin();
        
        //Paso5. Ejecutamos SQL qie es un delete
        em.remove(em.merge(persona1));
        
        //Paso6. Termina transaccion 2
        ts2.commit();
        
        //Objeto en estado detached
        log.debug("Objeto eliminado: " + persona1);
        //Cerramos el EntityManager
        em.close();
    }
}
