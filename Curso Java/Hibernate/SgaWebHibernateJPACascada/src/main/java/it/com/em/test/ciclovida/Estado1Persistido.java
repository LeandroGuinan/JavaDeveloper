package it.com.em.test.ciclovida;

import it.com.em.domain.Contacto;
import javax.persistence.*;

public class Estado1Persistido {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        try {
            //1. estado transitivo
            Contacto contacto = new Contacto();
            contacto.setEmail("clara@mail.com");
            contacto.setTelefono("99887744");

            //2.persistimos el objeto
            em.getTransaction().begin();
            em.persist(contacto);
            em.getTransaction().commit();

            //3.detached(separado)
            System.out.println(contacto);
            em.close();

        } catch (Exception ex) {
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
    }
}
