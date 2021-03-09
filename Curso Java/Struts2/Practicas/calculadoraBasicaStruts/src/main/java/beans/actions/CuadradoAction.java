package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Result(name="success",location="/WEB-INF/content/cuadrado.jsp")
public class CuadradoAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(CuadradoAction.class);
    
    @Action("cuadrado")
    @Override
    public String execute() throws Exception {
        log.info("Entrando a cuadrado action");
        return SUCCESS;
    }
    
    
}
