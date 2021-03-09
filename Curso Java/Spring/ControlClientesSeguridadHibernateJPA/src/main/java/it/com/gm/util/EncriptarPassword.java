package it.com.gm.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {
    
    public static void main(String[] args) {
        //el algoritmo que vamos a utilizar para encriptar las contraseñas es: (el cual es un paquete de spring)
        
        var password = "123";
        System.out.println("password: " + password);
        System.out.println("");
        System.out.println("password encriptado: " + encriptarPassword(password));
        
        
    }

    public static String encriptarPassword(String password){
        //el algoritmo que vamos a utilizar para encriptar las contraseñas es: (el cual es un paquete de spring)
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}

