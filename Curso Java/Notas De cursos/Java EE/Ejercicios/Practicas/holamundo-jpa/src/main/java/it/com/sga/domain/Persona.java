package it.com.sga.domain;

import java.io.Serializable;
import javax.persistence.*;


//esta es una clase entidad para poder interactuar con nuestra base de datos a travez de jpa, por ende se añade la siguiente anotacion:
@Entity
//al ser un bean debe implementar la interfece Serializable
public class Persona implements Serializable{
    
    //para complementar la implementacion es necesaria esta variable con esta firma:
    private static final long serialVersionUID=1L;
    
    //con esta anoracion especificamos cual es la llave primaria de nuestra base de datos
    @Id
    //ya que utilizamos una llave primaria autoincrementable, debemos utilizar la siguiente anotacion para ejecutarla:
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    //para renombrar y hacer el mapeo correctamente, donde se especifica el nombre de la llave primaria en la base de datos:
    @Column(name="id_persona")
    private int idPersona;
    
    //demas atributos de la base de datos
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public Persona() {
    }
    
    //no se agrega la llave primaria en el constructor debido a que este lo genera automaticamente la base de datos
    public Persona(String nombre, String apelledo, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apelledo;
        this.email = email;
        this.telefono = telefono;
    }

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

    public String getApelledo() {
        return apellido;
    }

    public void setApelledo(String apelledo) {
        this.apellido = apelledo;
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
