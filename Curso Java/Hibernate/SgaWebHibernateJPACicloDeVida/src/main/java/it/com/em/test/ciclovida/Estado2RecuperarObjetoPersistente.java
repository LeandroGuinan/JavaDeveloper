package it.com.em.test.ciclovida;

import it.com.em.domain.Contacto;
import javax.persistence.*;

public class Estado2RecuperarObjetoPersistente {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //definimos la variable
        Contacto cn = null;
        
        //recuperamos el objeto
        cn = em.find(Contacto.class, 3);
        System.out.println("");
        
        //detachet
        System.out.println(cn);
        
        
    }
}
