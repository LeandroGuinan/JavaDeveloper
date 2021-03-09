package test;

import beans.Encriptar;

import javax.naming.*;

public class TestClass {

    public static void main(String[] args) {
        
        try {
            Context jndi = new InitialContext();
            Encriptar ec = (Encriptar) jndi.lookup("java:global/EncriptadorDeMensajes/EncriptarImpl!beans.Encriptar");
            ec.insertText("hola");
            System.out.println(ec.getEncriptedText());
            
        } catch (Exception ex) {
            System.out.println("ERROR!");
        }
    }
}
