package it.com.sga.web;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.annotation.FacesConfig;
import static javax.faces.annotation.FacesConfig.Version.JSF_2_3;

//para configurar el JSF 2.3
@FacesConfig(
        version =JSF_2_3
)
//agregamos otra anotacion para indicar que esta aplicacion es de alcance:
@ApplicationScoped
//y que este presente en toda la configuracion
public class ConfiguracionBean {
    
}
