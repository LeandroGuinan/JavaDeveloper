
package beans.model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Named
@RequestScoped

public class Candidato {
    
    private String nombre;
    private String apellido;
    private String salarioDeseado;
    
    Logger log = LogManager.getRootLogger();
    
    
    public Candidato(){
        log.info("Creadon el objeto Candidato");
        this.setNombre(nombre);
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

    public String getSalarioDeseado() {
        return salarioDeseado;
    }

    public void setApellido(String apellido) {
        log.info("Modificando la propiedad de apellido " + this.apellido);
        this.apellido = apellido;
    }

    public void setSalarioDeseado(String salarioDeseado) {
        log.info("Modificando la propiedad de salario deseado: "+this.salarioDeseado);
        this.salarioDeseado = salarioDeseado;
    }
    
    
    
}
