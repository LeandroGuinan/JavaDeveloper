/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.com.em.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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
    @NamedQuery(name = "Departamentos.findAll", query = "SELECT d FROM Departamentos d"),
    @NamedQuery(name = "Departamentos.findByIdDepartamentos", query = "SELECT d FROM Departamentos d WHERE d.idDepartamentos = :idDepartamentos"),
    @NamedQuery(name = "Departamentos.findByNombreDepartamento", query = "SELECT d FROM Departamentos d WHERE d.nombreDepartamento = :nombreDepartamento"),
    @NamedQuery(name = "Departamentos.findByPresupuestoDepartamento", query = "SELECT d FROM Departamentos d WHERE d.presupuestoDepartamento = :presupuestoDepartamento")})
public class Departamentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_departamentos")
    private Integer idDepartamentos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_departamento")
    private String nombreDepartamento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "presupuesto_departamento")
    private double presupuestoDepartamento;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartamento", fetch = FetchType.LAZY)
    private List<Empleado> empleadoList;

    public Departamentos() {
    }

    public Departamentos(Integer idDepartamentos) {
        this.idDepartamentos = idDepartamentos;
    }

    public Departamentos(Integer idDepartamentos, String nombreDepartamento, double presupuestoDepartamento) {
        this.idDepartamentos = idDepartamentos;
        this.nombreDepartamento = nombreDepartamento;
        this.presupuestoDepartamento = presupuestoDepartamento;
    }

    public Integer getIdDepartamentos() {
        return idDepartamentos;
    }

    public void setIdDepartamentos(Integer idDepartamentos) {
        this.idDepartamentos = idDepartamentos;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public double getPresupuestoDepartamento() {
        return presupuestoDepartamento;
    }

    public void setPresupuestoDepartamento(double presupuestoDepartamento) {
        this.presupuestoDepartamento = presupuestoDepartamento;
    }

    @XmlTransient
    public List<Empleado> getEmpleadoList() {
        return empleadoList;
    }

    public void setEmpleadoList(List<Empleado> empleadoList) {
        this.empleadoList = empleadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDepartamentos != null ? idDepartamentos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamentos)) {
            return false;
        }
        Departamentos other = (Departamentos) object;
        if ((this.idDepartamentos == null && other.idDepartamentos != null) || (this.idDepartamentos != null && !this.idDepartamentos.equals(other.idDepartamentos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "it.com.em.domain.Departamentos[ idDepartamentos=" + idDepartamentos + " ]";
    }
    
}
