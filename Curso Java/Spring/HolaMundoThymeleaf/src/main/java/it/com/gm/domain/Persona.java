package it.com.gm.domain;

//clase de dominio persona, recordar: debe estar en el mismo paquete o un subpaquete donde se encuentra el archivo run

import lombok.Data;

//para crear una clase de dominio, solo hay que agregar la anotacion:
@Data
//y directamente crea los metodos que nececitamos para hacer de esta una clase entidad
public class Persona {
    
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
