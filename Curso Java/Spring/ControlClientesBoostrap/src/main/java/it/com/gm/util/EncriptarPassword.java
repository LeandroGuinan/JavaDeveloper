package it.com.gm.util;

import lombok.Data;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Data
public class EncriptarPassword {
    
    private String password;

    public static String encriptarPassword(String password){
        //el algoritmo que vamos a utilizar para encriptar las contraseñas es: (el cual es un paquete de spring)
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}

