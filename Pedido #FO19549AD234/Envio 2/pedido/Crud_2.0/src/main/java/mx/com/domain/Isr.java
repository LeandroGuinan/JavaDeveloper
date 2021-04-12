/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @NamedQuery(name = "Isr.findAll", query = "SELECT i FROM Isr i"),
    @NamedQuery(name = "Isr.findByIdISR", query = "SELECT i FROM Isr i WHERE i.idISR = :idISR"),
    @NamedQuery(name = "Isr.findByTipoIsr", query = "SELECT i FROM Isr i WHERE i.tipoIsr = :tipoIsr")})
public class Isr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ISR")
    private Integer idISR;
    @Size(max = 45)
    @Column(name = "tipo_isr")
    private String tipoIsr;
    @OneToMany(mappedBy = "idIsr")
    private List<Cliente> clienteList;

    public Isr() {
    }

    public Isr(Integer idISR) {
        this.idISR = idISR;
    }

    public Isr(String tipoIsr) {
        this.tipoIsr = tipoIsr;
    }
    
    

    public Integer getIdISR() {
        return idISR;
    }

    public void setIdISR(Integer idISR) {
        this.idISR = idISR;
    }

    public String getTipoIsr() {
        return tipoIsr;
    }

    public void setTipoIsr(String tipoIsr) {
        this.tipoIsr = tipoIsr;
    }

    @XmlTransient
    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idISR != null ? idISR.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Isr)) {
            return false;
        }
        Isr other = (Isr) object;
        if ((this.idISR == null && other.idISR != null) || (this.idISR != null && !this.idISR.equals(other.idISR))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Isr{" + "idISR=" + idISR + ", tipoIsr=" + tipoIsr + '}';
    }
}
