package beans.actions;

import org.apache.logging.log4j.*;

public class SaludarAction {
    
    Logger log = LogManager.getLogger(SaludarAction.class);
    
    private String palabra;
    
    public String execute(){
        this.palabra = "Hola Desde Execute";
        log.info("Fase Saludar: Completa");
        return "ok";
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    
    
}
