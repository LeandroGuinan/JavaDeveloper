/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.com.em.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author guina
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Activos.findAll", query = "SELECT a FROM Activos a"),
    @NamedQuery(name = "Activos.findByIdActivos", query = "SELECT a FROM Activos a WHERE a.idActivos = :idActivos"),
    @NamedQuery(name = "Activos.findByLeyenda", query = "SELECT a FROM Activos a WHERE a.leyenda = :leyenda"),
    @NamedQuery(name = "Activos.findByCantidad", query = "SELECT a FROM Activos a WHERE a.cantidad = :cantidad"),
    @NamedQuery(name = "Activos.findByFecha", query = "SELECT a FROM Activos a WHERE a.fecha = :fecha")})
public class Activos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_activos")
    private Integer idActivos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String leyenda;
    @Basic(optional = false)
    @NotNull
    private int cantidad;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @OneToMany(mappedBy = "idAcivos", cascade = CascadeType.ALL)
    private List<Balance> balanceList;

    public Activos() {
    }

    public Activos(Integer idActivos) {
        this.idActivos = idActivos;
    }

    public Activos(String leyenda, int cantidad, Date fecha) {
        this.leyenda = leyenda;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }
    
    public Activos(Integer idActivos, String leyenda, int cantidad, Date fecha) {
        this.idActivos = idActivos;
        this.leyenda = leyenda;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Integer getIdActivos() {
        return idActivos;
    }

    public void setIdActivos(Integer idActivos) {
        this.idActivos = idActivos;
    }

    public String getLeyenda() {
        return leyenda;
    }

    public void setLeyenda(String leyenda) {
        this.leyenda = leyenda;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @XmlTransient
    public List<Balance> getBalanceList() {
        return balanceList;
    }

    public void setBalanceList(List<Balance> balanceList) {
        this.balanceList = balanceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idActivos != null ? idActivos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Activos)) {
            return false;
        }
        Activos other = (Activos) object;
        if ((this.idActivos == null && other.idActivos != null) || (this.idActivos != null && !this.idActivos.equals(other.idActivos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Activos{" + "idActivos=" + idActivos + ", leyenda=" + leyenda + ", cantidad=" + cantidad + ", fecha=" + fecha + '}';
    }
}
