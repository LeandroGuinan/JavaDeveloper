/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.com.em.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author guina
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Balance.findAll", query = "SELECT b FROM Balance b"),
    @NamedQuery(name = "Balance.findByIdBalance", query = "SELECT b FROM Balance b WHERE b.idBalance = :idBalance"),
    @NamedQuery(name = "Balance.findByBalance", query = "SELECT b FROM Balance b WHERE b.balance = :balance"),
    @NamedQuery(name = "Balance.findByFecha", query = "SELECT b FROM Balance b WHERE b.fecha = :fecha")})
public class Balance implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_balance")
    private Integer idBalance;
    @Basic(optional = false)
    @NotNull
    private int balance;
    @Basic(optional = false)
    @NotNull
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @JoinColumn(name = "id_acivos", referencedColumnName = "id_activos")
    @ManyToOne(cascade = CascadeType.ALL)
    private Activos idAcivos;
    @JoinColumn(name = "id_pasivos", referencedColumnName = "id_pasivos")
    @ManyToOne(cascade = CascadeType.ALL)
    private Pasivos idPasivos;

    public Balance() {
    }

    public Balance(Integer idBalance) {
        this.idBalance = idBalance;
    }

    public Balance(Integer idBalance, int balance, Date fecha) {
        this.idBalance = idBalance;
        this.balance = balance;
        this.fecha = fecha;
    }

    public Balance(int balance, Date fecha, Activos idAcivos) {
        this.balance = balance;
        this.fecha = fecha;
        this.idAcivos = idAcivos;
    }

    public Balance(int balance, Date fecha, Pasivos idPasivos) {
        this.balance = balance;
        this.fecha = fecha;
        this.idPasivos = idPasivos;
    }

    public Integer getIdBalance() {
        return idBalance;
    }

    public void setIdBalance(Integer idBalance) {
        this.idBalance = idBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Activos getIdAcivos() {
        return idAcivos;
    }

    public void setIdAcivos(Activos idAcivos) {
        this.idAcivos = idAcivos;
    }

    public Pasivos getIdPasivos() {
        return idPasivos;
    }

    public void setIdPasivos(Pasivos idPasivos) {
        this.idPasivos = idPasivos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBalance != null ? idBalance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Balance)) {
            return false;
        }
        Balance other = (Balance) object;
        if ((this.idBalance == null && other.idBalance != null) || (this.idBalance != null && !this.idBalance.equals(other.idBalance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Balance{" + "idBalance=" + idBalance + ", balance=" + balance + ", fecha=" + fecha + '}';
    }

    
    
}
