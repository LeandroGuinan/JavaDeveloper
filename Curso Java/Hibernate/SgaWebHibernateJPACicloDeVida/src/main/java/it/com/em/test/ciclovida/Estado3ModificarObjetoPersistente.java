package it.com.em.test.ciclovida;

import it.com.em.domain.Contacto;
import javax.persistence.*;

public class Estado3ModificarObjetoPersistente {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //definimos la variable
        Contacto cn = null;
        
        //recuperamos el objeto
        //1.objeto en estado detached
        cn = em.find(Contacto.class, 3);
        
        //2.Modificamos el objeto
        cn.setEmail("clara@Mail.com");
        
        
        //inicia la transaccion
        em.getTransaction().begin();
        
        //2.objeto persistente
        em.merge(cn);
        
        
        //commit
        em.getTransaction().commit();
        
        System.out.println("");
        //detachet
        System.out.println(cn);
        
        
    }
}
