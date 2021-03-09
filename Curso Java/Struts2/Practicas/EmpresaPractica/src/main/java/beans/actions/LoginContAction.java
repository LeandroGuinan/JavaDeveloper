package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;

@Result(name = "success", location="/WEB-INF/content/contabilidad.jsp")
public class LoginContAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(LoginContAction.class);
    
    @Action("loginCont")
    @Override
    public String execute() throws Exception {
        log.info("Entrando A Departamento De Contabilidad");
        return SUCCESS;
    }
    
    
    
}
