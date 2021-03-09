package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

//esta anotacion remplaza la nececidad de utilizar el mapeado de acciones en struts.xml
//directamente definimos en el caso de success, el paht al que se va a redirigir
@Result(name="success", location="/WEB-INF/content/login.jsp")
public class LoginAction extends ActionSupport {
    
    //nombramos directamente la accion de este metodo execute, con la anotacion:
    @Action("login")
    @Override
    public String execute(){
        return SUCCESS;
    }
    
}
