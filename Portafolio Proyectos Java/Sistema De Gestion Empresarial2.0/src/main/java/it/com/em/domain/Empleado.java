package it.com.em.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Empleado implements Serializable{

    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Long idEmpleado;
    
    @JoinColumn(name="id_contacto")
    @ManyToOne(cascade = CascadeType.ALL)
    private Contacto contacto;
    
    @ManyToOne()
    @JoinColumn(name="id_departamento")
    @NotNull
    private Departamentos departamentos;
    
    @JoinColumn(name="id_direccion")
    @ManyToOne(cascade = CascadeType.ALL)
    private Direccion direcion;
    
    @NotEmpty
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotNull
    private Double sueldo;
    
}
