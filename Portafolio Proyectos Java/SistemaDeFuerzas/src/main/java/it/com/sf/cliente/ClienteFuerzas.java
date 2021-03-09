package it.com.sf.cliente;

import it.com.sf.servicio.DataServiceRemote;
import java.util.List;
import javax.naming.*;

public class ClienteFuerzas {

    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();
            DataServiceRemote ds = (DataServiceRemote) jndi.lookup("java:global/SistemaDeFuerzas/DataServiceImpl!it.com.sf.servicio.DataServiceRemote");
            
            List fuerzas = ds.calcularFuerzas();
            
            for(Object f: fuerzas){
                System.out.println("Fuerza = "+f);
            }
        } catch (NamingException ex) {
        }
    }
}
