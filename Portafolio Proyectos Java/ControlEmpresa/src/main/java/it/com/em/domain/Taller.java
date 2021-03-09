/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.com.em.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;

/**
 *
 * @author guina
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Taller.findAll", query = "SELECT t FROM Taller t"),
    @NamedQuery(name = "Taller.findByIdMec", query = "SELECT t FROM Taller t WHERE t.idMec = :idMec"),
    @NamedQuery(name = "Taller.findByNombre", query = "SELECT t FROM Taller t WHERE t.nombre = :nombre"),
    @NamedQuery(name = "Taller.findByApellido", query = "SELECT t FROM Taller t WHERE t.apellido = :apellido"),
    @NamedQuery(name = "Taller.findBySueldo", query = "SELECT t FROM Taller t WHERE t.sueldo = :sueldo"),
    @NamedQuery(name = "Taller.findByUsuario", query = "SELECT t FROM Taller t WHERE t.usuario = :usuario"),
    @NamedQuery(name = "Taller.findByPassword", query = "SELECT t FROM Taller t WHERE t.password = :password")})
public class Taller implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_mec")
    private Integer idMec;
    @Size(max = 45)
    private String nombre;
    @Size(max = 45)
    private String apellido;
    private Integer sueldo;
    @Size(max = 45)
    private String usuario;
    @Size(max = 45)
    private String password;
    @JoinColumn(name = "id_empleado", referencedColumnName = "id_empleado")
    @ManyToOne
    private Empleado empleado;

    public Taller() {
    }

    public Taller(Integer idMec) {
        this.idMec = idMec;
    }

    public Taller(String nombre, String apellido, Integer sueldo, String usuario, String password, Empleado empleado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.usuario = usuario;
        this.password = password;
        this.empleado = empleado;
    }
    
    
    
    public Integer getIdMec() {
        return idMec;
    }

    public void setIdMec(Integer idMec) {
        this.idMec = idMec;
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

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMec != null ? idMec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Taller)) {
            return false;
        }
        Taller other = (Taller) object;
        if ((this.idMec == null && other.idMec != null) || (this.idMec != null && !this.idMec.equals(other.idMec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Taller{" + "idMec=" + idMec + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + ", usuario=" + usuario + ", password=" + password + '}';
    }

    
    
}
