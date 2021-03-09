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
    @NamedQuery(name = "Pasivos.findAll", query = "SELECT p FROM Pasivos p"),
    @NamedQuery(name = "Pasivos.findByIdPasivos", query = "SELECT p FROM Pasivos p WHERE p.idPasivos = :idPasivos"),
    @NamedQuery(name = "Pasivos.findByLeyenda", query = "SELECT p FROM Pasivos p WHERE p.leyenda = :leyenda"),
    @NamedQuery(name = "Pasivos.findByCantidad", query = "SELECT p FROM Pasivos p WHERE p.cantidad = :cantidad"),
    @NamedQuery(name = "Pasivos.findByFecha", query = "SELECT p FROM Pasivos p WHERE p.fecha = :fecha")})
public class Pasivos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_pasivos")
    private Integer idPasivos;
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
    @OneToMany(mappedBy = "idPasivos", cascade = CascadeType.ALL)
    private List<Balance> balanceList;

    public Pasivos() {
    }

    public Pasivos(Integer idPasivos) {
        this.idPasivos = idPasivos;
    }

    public Pasivos(String leyenda, int cantidad, Date fecha) {
        this.leyenda = leyenda;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }
    
    
    
    public Pasivos(Integer idPasivos, String leyenda, int cantidad, Date fecha) {
        this.idPasivos = idPasivos;
        this.leyenda = leyenda;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Integer getIdPasivos() {
        return idPasivos;
    }

    public void setIdPasivos(Integer idPasivos) {
        this.idPasivos = idPasivos;
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
        hash += (idPasivos != null ? idPasivos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pasivos)) {
            return false;
        }
        Pasivos other = (Pasivos) object;
        if ((this.idPasivos == null && other.idPasivos != null) || (this.idPasivos != null && !this.idPasivos.equals(other.idPasivos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pasivos{" + "idPasivos=" + idPasivos + ", leyenda=" + leyenda + ", cantidad=" + cantidad + ", fecha=" + fecha + '}';
    }

    
    
}
