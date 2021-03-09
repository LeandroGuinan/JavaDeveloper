/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.com.en.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author guina
 */
@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Palabras.findAll", query = "SELECT p FROM Palabras p"),
    @NamedQuery(name = "Palabras.findByIdPalabras", query = "SELECT p FROM Palabras p WHERE p.idPalabras = :idPalabras"),
    @NamedQuery(name = "Palabras.findByPalabraEncriptada", query = "SELECT p FROM Palabras p WHERE p.palabraEncriptada = :palabraEncriptada")})
public class Palabras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_palabras")
    private Integer idPalabras;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    private String palabraEncriptada;

    public Palabras() {
    }

    public Palabras(Integer idPalabras) {
        this.idPalabras = idPalabras;
    }

    public Palabras(Integer idPalabras, String palabraEncriptada) {
        this.idPalabras = idPalabras;
        this.palabraEncriptada = palabraEncriptada;
    }

    public Palabras(String palabraEncriptada) {
        this.palabraEncriptada = palabraEncriptada;
    }
    
    

    public Integer getIdPalabras() {
        return idPalabras;
    }

    public void setIdPalabras(Integer idPalabras) {
        this.idPalabras = idPalabras;
    }

    public String getPalabraEncriptada() {
        return palabraEncriptada;
    }

    public void setPalabraEncriptada(String palabraEncriptada) {
        this.palabraEncriptada = palabraEncriptada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPalabras != null ? idPalabras.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Palabras)) {
            return false;
        }
        Palabras other = (Palabras) object;
        if ((this.idPalabras == null && other.idPalabras != null) || (this.idPalabras != null && !this.idPalabras.equals(other.idPalabras))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Palabras{" + "idPalabras=" + idPalabras + ", palabraEncriptada=" + palabraEncriptada + '}';
    }
}
