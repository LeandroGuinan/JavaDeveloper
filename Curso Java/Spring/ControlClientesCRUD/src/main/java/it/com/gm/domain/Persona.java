package it.com.gm.domain;

//clase de dominio persona, recordar: debe estar en el mismo paquete o un subpaquete donde se encuentra el archivo run
import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

//para crear una clase de dominio, solo hay que agregar la anotacion:
@Data
//y directamente crea los metodos que nececitamos para hacer de esta una clase entidad
//marcamos esta clase como una de entidad de base de datos:
@Entity
//y escribimos la tabla a la que hace referencia
@Table(name = "persona")
public class Persona implements Serializable {

    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
