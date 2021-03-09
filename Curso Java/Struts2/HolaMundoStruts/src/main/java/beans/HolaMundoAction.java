package beans;

import org.apache.logging.log4j.*;


public class HolaMundoAction {
    /*
    clase de accion de struts no necesariamente debe extender o implementar otra clase java
    */
    
    //aqui indicamos en este log la clase que estamos llamando
    Logger log = LogManager.getLogger(HolaMundoAction.class);
    
    private String saludosAtr;
    
    //para que sea una clase de accion debe existir el metodo:
    public String execute(){
        log.info("Ejecutando metodo Execute");
        this.saludosAtr = "Adios Desde Struts2";
        return "exito";
    }
    /*
    Struts funciona de la siguiente manera:
    1.en el index se hace referencia a una accion, en este caso "saludar"
    
    2.esta accion es procesada por el struts.xml, por tanto debe existir
    una accion con este nombre
    
    3.en este xml procesa la accion y ejecuta el execute de la clase
    establecida en esta(en este caso: beans.HolaMundoAction)
    
    4.esta redirige la llamada a la pagina jsp estableccida
    
    5.esta pagina jsp puede acceder a la informacion de la clase
    accion
    
    */
    
    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
    
    
}
