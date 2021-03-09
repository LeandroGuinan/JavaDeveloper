package it.com.em.test.cascade;

import it.com.em.domain.*;
import javax.persistence.*;

public class PersistenciaCascadaTest {
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Nogales");
        domicilio.setNoCalle("10");
        domicilio.setPais("Mexico");
        
        Contacto contacto = new Contacto();
        contacto.setEmail("clara@Mail.com");
        contacto.setTelefono("44332211");
        
        Alumno alumno = new Alumno();
        alumno.setNombre("Carlos");
        alumno.setApellido("Lara");
        alumno.setIdDomicilio(domicilio);
        alumno.setIdContacto(contacto);
        
        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();
        em.close();
        
        System.out.println("");
        System.out.println("Info Alumno: "+alumno);
        
    }
    
}
