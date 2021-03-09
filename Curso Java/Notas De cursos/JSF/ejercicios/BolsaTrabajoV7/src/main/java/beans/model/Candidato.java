package beans.model;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped

public class Candidato {

    private String nombre;
    private String apellido;
    private int salarioDeseado;
    private Date fechaDeNacimiento;
    private String codigoPostal;
    private String ciudad;
    private String comentario;
    private int colinaId;

    Logger log = LogManager.getRootLogger();

    public Candidato() {
        log.info("Creadon el objeto Candidato");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        log.info("Modificando la propiedad de Nombre: " + this.nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public int getSalarioDeseado() {
        return salarioDeseado;
    }

    public void setApellido(String apellido) {
        log.info("Modificando la propiedad de apellido " + this.apellido);
        this.apellido = apellido;
    }

    public void setSalarioDeseado(int salarioDeseado) {
        log.info("Modificando la propiedad de salario deseado: " + this.salarioDeseado);
        this.salarioDeseado = salarioDeseado;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getColinaId() {
        return colinaId;
    }

    public void setColinaId(int colinaId) {
        this.colinaId = colinaId;
    }
}
