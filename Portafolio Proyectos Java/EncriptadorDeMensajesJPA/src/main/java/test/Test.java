package test;

import it.com.em.beans.Encriptar;
import it.com.em.domain.Palabra;
import java.util.Scanner;
import javax.naming.*;
import javax.persistence.*;
import org.apache.logging.log4j.*;


public class Test {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PalabraPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction ts = em.getTransaction();
        
        try {
            Context jndi = new InitialContext();
            Encriptar ec = (Encriptar) jndi.lookup("java:global/EncriptadorDeMensajesJPA/EncriptarImpl!it.com.em.beans.Encriptar");
            
            System.out.println("Inserte palabra a encriptar ");
            String palabra = in.nextLine();
            int palabraL = palabra.length();
            ec.insertText(palabra);
            String palabraE = ec.getEncriptedText();
            int palabraEL = palabraE.length();
            
            ts.begin();
            Palabra pl = new Palabra(palabra,palabraE,palabraL,palabraEL);
            log.debug("\nPalabra a Encriptar: "+palabra+"\nPalabra Encriptada: "+palabraE);
            
            em.persist(pl);
            ts.commit();
            log.debug("Objeto Encriptado: " + pl);
            em.close();
            
        } catch (NamingException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
