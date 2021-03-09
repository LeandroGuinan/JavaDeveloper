
package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;
import javax.naming.NamingException;


public class TestHolaMundoEJB {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");
        try{
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holaMundoEJB = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEjbIMPL!beans.HolaMundoEjbRemote");
            
            int resultado = holaMundoEJB.sumar(5, 3);
            System.out.println("resultado = " + resultado);
        }
        catch(NamingException e){
            e.printStackTrace(System.out);
        }
    }
}
