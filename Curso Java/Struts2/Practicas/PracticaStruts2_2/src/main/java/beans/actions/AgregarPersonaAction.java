package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;


public class AgregarPersonaAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(AgregarPersonaAction.class);
    
    private String nombre;
    
    
    @Override
    public String execute() throws Exception {
        log.info("Fase Nombre: Completa");
        return SUCCESS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
