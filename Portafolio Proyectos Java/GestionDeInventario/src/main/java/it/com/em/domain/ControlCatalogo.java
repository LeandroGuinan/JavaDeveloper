/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.com.em.domain;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author guina
 */
@Entity
@Table(name = "control_catalogo")
@NamedQueries({
    @NamedQuery(name = "ControlCatalogo.findAll", query = "SELECT c FROM ControlCatalogo c"),
    @NamedQuery(name = "ControlCatalogo.findByIdProducto", query = "SELECT c FROM ControlCatalogo c WHERE c.idProducto = :idProducto"),
    @NamedQuery(name = "ControlCatalogo.findByNombre", query = "SELECT c FROM ControlCatalogo c WHERE c.nombre = :nombre"),
    @NamedQuery(name = "ControlCatalogo.findByPrecio", query = "SELECT c FROM ControlCatalogo c WHERE c.precio = :precio"),
    @NamedQuery(name = "ControlCatalogo.findByFecha", query = "SELECT c FROM ControlCatalogo c WHERE c.fecha = :fecha")})
public class ControlCatalogo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_producto")
    private Integer idProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    private int precio;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public ControlCatalogo() {
    }

    public ControlCatalogo(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public ControlCatalogo(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
        Date fecha2 = new Date();
        this.fecha = fecha2;
    }
    
    

    public ControlCatalogo(Integer idProducto, String nombre, int precio, Date fecha) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProducto != null ? idProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ControlCatalogo)) {
            return false;
        }
        ControlCatalogo other = (ControlCatalogo) object;
        if ((this.idProducto == null && other.idProducto != null) || (this.idProducto != null && !this.idProducto.equals(other.idProducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String fechaFormat;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        fechaFormat = format.format(fecha);
        return  "idProducto: " + idProducto + ", nombre: " + nombre + ", precio: " + precio+'$' + ", fecha de Ingreso: " + fechaFormat + '}';
    }
}
