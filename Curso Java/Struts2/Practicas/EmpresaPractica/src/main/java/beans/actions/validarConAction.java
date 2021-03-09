package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
    @Result(name = "success",location="/WEB-INF/content/bienvenidoCont.jsp"),
    @Result(name="input",location="loginCont",type = "redirectAction")
})
public class validarConAction extends ActionSupport{
    
    String user, password;
    
    @Action("validarCon")
    @Override
    public String execute() throws Exception {
        if(user.equals("adminCon") && password.equals("123")){
            return SUCCESS;
        }else{
            return INPUT;
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
