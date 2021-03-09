package test;

import it.com.em.domain.ControlCatalogo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.persistence.*;
import org.apache.logging.log4j.*;

public class Test {

    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("InventarioPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction ts = em.getTransaction();
        
        
        int controlador = -1;
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        
       while(controlador != 0){
           System.out.println("\nSelecciona: \n1. para ver el inventario\n2.insertar articulo\n3.para eliminar producto\n0. salir");
           controlador = in.nextInt();
           
           switch(controlador){
               case 1:
                   ts.begin();
                   List<ControlCatalogo> pr = new ArrayList<>();
                   pr = em.createNamedQuery("ControlCatalogo.findAll").getResultList();
                   imprimirLista(pr);
                   ts.commit();
                   em.close();
                   controlador = 0;
                   log.debug("\nAdios");
                   break;
               case 2:
                   System.out.println("Inserta el nombre del producto");
                   String nombre = in2.nextLine();
                   System.out.println("Inserta el precio del producto");
                   int valor = in2.nextInt();
                   ControlCatalogo control = new ControlCatalogo(nombre,valor);
                   
                   
                   ts.begin();
                   em.persist(control);
                   ts.commit();
                   em.close();
                   controlador = 0;
                   log.debug("\nAdios");
                   break;
               case 3:
                   System.out.println("Inserta ID del producto");
                   int iD = in2.nextInt();
                   ts.begin();
                   
                   ControlCatalogo cl = em.find(ControlCatalogo.class, iD);
                   log.debug("Objeto A Eliminar: " + cl);
                   ts.commit();
                   controlador = 0;
                   
                   
                   EntityTransaction ts2 = em.getTransaction();
                   ts2.begin();
                   em.remove(em.merge(cl));
                   ts2.commit();
                   log.debug("Objeto Eliminado");
                   em.close();
                   
                   log.debug("Adios");
                   break;
               case 0:
                   log.debug("Adios");
                   break;
               
           }
       }
    }
    
    public static void imprimirLista(List lista){
        for(Object c : lista){
            log.debug("Objeto: "+c);
        }
    }
}
