package test;

import it.com.gm.domain.Persona;
import java.util.List;
import javax.persistence.*;

public class HolaMundoHibernate {

    public static void main(String[] args) {
        //agregamos el hql(hibernate query language):
        String hql = "SELECT p FROM Persona p";
        //creamos nuestra emf, haciendo referencia a nuestra unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        
        //con esto creamos el objeto entity manager, con el que podemos conectarnos a la base de datos
        EntityManager em = emf.createEntityManager();
        
        //creamos una consulta con la cadena hql que definimos anteriormente
        Query quety = em.createQuery(hql);
        
        //esta sentencia nos regresara una lista de objetos de persona:
        List<Persona> personas = quety.getResultList();
        for(Persona p: personas){
            System.out.println(p);
        }
    }
}
