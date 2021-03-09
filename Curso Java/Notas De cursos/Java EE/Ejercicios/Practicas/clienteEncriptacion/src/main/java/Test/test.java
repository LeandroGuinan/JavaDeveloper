package Test;

import clientews.domain.Palabras;
import clientews.servicio.Encriptacion;
import clientews.servicio.EncriptacionImplService;
import java.util.Scanner;
import javax.persistence.*;
import javax.persistence.Persistence;
import org.apache.logging.log4j.*;

public class test {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PalabraPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction ts = em.getTransaction();
        Encriptacion ec = new EncriptacionImplService().getEncriptacionImplPort();
        Scanner cn = new Scanner(System.in);
        int control = -1;
        log.debug("Selecciona \n1: para encriptar una palabra \n2: proporcionar un ID a desencriptar");
        control = cn.nextInt();
        
        switch (control) {
            case 1:
                System.out.println("Introduce texto a encriptar");
                Scanner in = new Scanner(System.in);
                String men = in.nextLine();
                String menEc = ec.encrypt(men);
                Palabras wrd = new Palabras(menEc);
                
                ts.begin();
                em.persist(wrd);
                ts.commit();
                log.debug(wrd);
                em.close();
                break;
                
                
            case 2:
                try {
                Scanner in2 = new Scanner(System.in);
                log.debug("Introduce id de palabra a Desencriotar: ");
                int id = in2.nextInt();

                ts.begin();
                Palabras wrd2 = em.find(Palabras.class, id);
                String palabraD = wrd2.getPalabraEncriptada();
                String palabra = ec.decrypt(palabraD);
                log.debug("Palabra Desencriptada: " + palabra);
                em.close();
                break;

            } catch (Exception ex) {
                System.out.println("Introduce un ID valido");
                ex.printStackTrace(System.out);
                break;
            }
            default:
                System.out.println("Seleccion no valida");
                break;

        }

    }
}
