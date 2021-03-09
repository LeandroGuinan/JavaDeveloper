/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.com.em.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.Size;
import org.eclipse.persistence.jpa.config.Cascade;

/**
 *
 * @author guina
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Administracion.findAll", query = "SELECT a FROM Administracion a"),
    @NamedQuery(name = "Administracion.findByIdAdmin", query = "SELECT a FROM Administracion a WHERE a.idAdmin = :idAdmin"),
    @NamedQuery(name = "Administracion.findByNombre", query = "SELECT a FROM Administracion a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Administracion.findByApellido", query = "SELECT a FROM Administracion a WHERE a.apellido = :apellido"),
    @NamedQuery(name = "Administracion.findBySueldo", query = "SELECT a FROM Administracion a WHERE a.sueldo = :sueldo"),
    @NamedQuery(name = "Administracion.findByUsuario", query = "SELECT a FROM Administracion a WHERE a.usuario = :usuario"),
    @NamedQuery(name = "Administracion.findByPassword", query = "SELECT a FROM Administracion a WHERE a.password = :password")})
public class Administracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_admin")
    private Integer idAdmin;
    @Size(max = 45)
    private String nombre;
    @Size(max = 45)
    private String apellido;
    @Size(max = 45)
    private String sueldo;
    @Size(max = 45)
    private String usuario;
    @Size(max = 45)
    private String password;
    @JoinColumn(name = "id_emp", referencedColumnName = "id_empleado")
    @ManyToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL)
    private Empleado empleado;

    public Administracion() {
    }

    public Administracion(Integer idAdmin) {
        this.idAdmin = idAdmin;
    }

    public Integer getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(Integer idAdmin) {
        this.idAdmin = idAdmin;
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

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
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
        hash += (idAdmin != null ? idAdmin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Administracion)) {
            return false;
        }
        Administracion other = (Administracion) object;
        if ((this.idAdmin == null && other.idAdmin != null) || (this.idAdmin != null && !this.idAdmin.equals(other.idAdmin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Administracion{" + "idAdmin=" + idAdmin + ", nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + ", usuario=" + usuario + ", password=" + password + ", empleado=" + empleado + '}';
    }

    
    
}
