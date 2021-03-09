package beans.actions;

import org.apache.logging.log4j.*;

public class DespedirAction {

  Logger log = LogManager.getLogger(DespedirAction.class);
  
  private String palabra;
  
  public String execute(){
      this.palabra = "Adios Desde Execute";
      log.info("Fase Despedir: Completa");
      return "ok";
  }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
  
  
}
