/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.com.gm.sga.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.*;

/**
 *
 * @author guina
 */
//esta es una clase entidad para poder interactuar con nuestra base de datos a travez de jpa, por ende se añade la siguiente anotacion:
@Entity
//al ser un bean debe implementar la interfece Serializable

//en las clases de entidad tambien se pueden agregar query's (consultas)
@NamedQueries({
    //esta consulta es para recuperar todos los objetos de tipo persona:
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    //esto no es codigo sql si no jpql que directamente objetiene objetos completos de las bases de datos
    @NamedQuery(name = "Persona.findByIdPersona", query = "SELECT p FROM Persona p WHERE p.idPersona = :idPersona"),
    @NamedQuery(name = "Persona.findByNombre", query = "SELECT p FROM Persona p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Persona.findByApellido", query = "SELECT p FROM Persona p WHERE p.apellido = :apellido"),
    @NamedQuery(name = "Persona.findByEmail", query = "SELECT p FROM Persona p WHERE p.email = :email"),
    @NamedQuery(name = "Persona.findByTelefono", query = "SELECT p FROM Persona p WHERE p.telefono = :telefono")})
//esto en caso que no sea el mismo nombre que la tabla en base de datos
@Table(name="persona")
//Para poder exponer esta clase entidad como objetos xml debemos agregar la anotacion:
@XmlAccessorType(XmlAccessType.FIELD)
//esto combierte cada atributo en un elemento tipo xml

//agregamos la anotacion:
@XmlRootElement
//por si es necesario exponer exta clase como xml
public class Persona implements Serializable {
    
    //para complementar la implementacion es necesaria esta variable con esta firma:
    private static final long serialVersionUID = 1L;
    
    //con esta anoracion especificamos cual es la llave primaria de nuestra base de datos
    @Id
    //ya que utilizamos una llave primaria autoincrementable, debemos utilizar la siguiente anotacion para ejecutarla:
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //para renombrar y hacer el mapeo correctamente, donde se especifica el nombre de la llave primaria en la base de datos:
    @Basic(optional = false)
    @Column(name = "id_persona")
    private Integer idPersona;
    @Size(max = 45)
    //demas atributos de la base de datos
    private String nombre;
    @Size(max = 45)
    private String apellido;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    private String email;
    @Size(max = 45)
    private String telefono;
    
    //en esta clase no existe una relacion one to many, pero de existir se debe agregar la anotacion:
    //@XmlTransient
    // de lo contrario se enviarian tambien los objetos de la clase relacionada, y esto podria ser pesado
    
    public Persona() {
    }
    
    //no se agrega la llave primaria en el constructor debido a que este lo genera automaticamente la base de datos
    public Persona(String nombre, String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
    }
    
    

    public Persona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
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
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }

    
    
}
