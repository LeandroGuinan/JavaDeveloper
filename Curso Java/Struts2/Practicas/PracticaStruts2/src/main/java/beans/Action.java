package beans;

import org.apache.logging.log4j.*;

public class Action {

    Logger log = LogManager.getLogger(Action.class);

    private String mensaje = "";

    public String execute() {
        if (mensaje.equals("")) {
            mensaje = "Hola Desde Action";
            log.info("Fase 1: Completada");
            return "ok";
        } else {
            mensaje ="Adios Desde Action";
            log.info("Fase 2: Completada");
            return "ok";
        }

    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
