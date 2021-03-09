package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

@Result(name = "success", location="/WEB-INF/content/taller.jsp")
public class LoginTalAction extends ActionSupport{
    
    Logger log = LogManager.getLogger(LoginTalAction.class);
    
    
    @Action("loginTal")
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }
}
