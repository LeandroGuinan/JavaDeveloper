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
    @NamedQuery(name = "Contribuyente.findAll", query = "SELECT c FROM Contribuyente c"),
    @NamedQuery(name = "Contribuyente.findByIdContribuyente", query = "SELECT c FROM Contribuyente c WHERE c.idContribuyente = :idContribuyente"),
    @NamedQuery(name = "Contribuyente.findByDescripcion", query = "SELECT c FROM Contribuyente c WHERE c.descripcion = :descripcion")})
public class Contribuyente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_contribuyente")
    private Integer idContribuyente;
    @Size(max = 45)
    private String descripcion;
    @OneToMany(mappedBy = "idContribuyente")
    private List<Cliente> clienteList;

    public Contribuyente() {
    }

    public Contribuyente(Integer idContribuyente) {
        this.idContribuyente = idContribuyente;
    }

    public Integer getIdContribuyente() {
        return idContribuyente;
    }

    public void setIdContribuyente(Integer idContribuyente) {
        this.idContribuyente = idContribuyente;
    }

    public Contribuyente(String descripcion) {
        this.descripcion = descripcion;
    }
    
    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idContribuyente != null ? idContribuyente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contribuyente)) {
            return false;
        }
        Contribuyente other = (Contribuyente) object;
        if ((this.idContribuyente == null && other.idContribuyente != null) || (this.idContribuyente != null && !this.idContribuyente.equals(other.idContribuyente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Contribuyente{" + "idContribuyente=" + idContribuyente + ", descripcion=" + descripcion + '}';
    }

   
    
}
