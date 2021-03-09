package it.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;

//creamos nuestra clase entidad para utilzar serializable
@Entity
//en caso de tener probleamas es mejor utilizar la anotacion:
@Table(name="persona")
//implementando la interface:
public class Persona implements Serializable{
    
    //debemos especificar el svid:
    private static final long serialVersionUID = 1L;
    
    //establecemos el id:
    @Column(name="id_persona")
    @Id
    private int idPersona;
    
    //definimos los demas atributos:
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
    //constructor vacio:
    public Persona() {}

    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }
    
    
    
    //constructios con atributos:
    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }

    //getters & setters
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
}
