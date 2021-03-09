package it.com.gm.actions;

import com.opensymphony.xwork2.ActionSupport;
import it.com.gm.model.Persona;
import org.apache.logging.log4j.*;

public class PersonasAction extends ActionSupport {

    Logger lod = LogManager.getLogger(PersonasAction.class);

    private Persona persona;

    @Override
    public String execute() throws Exception {
        if(this.persona != null){
            lod.info("\n");
            lod.info("Persona: " + persona);
        }else{
           lod.info("Persona con valor nulo");
        }
        return SUCCESS;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

}
