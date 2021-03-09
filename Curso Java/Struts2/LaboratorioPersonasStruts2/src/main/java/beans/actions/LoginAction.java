package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class LoginAction extends ActionSupport {

    Logger log = LogManager.getLogger(LoginAction.class);

    private String user;
    private String pass;

    @Override
    public String execute() throws Exception {
        log.info("Ejecucion Correcta");
        return SUCCESS;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getHead() {
        return getText("login.head");
    }

    public String getUs() {
        return getText("login.us");
    }

    public String getPs() {
        return getText("login.ps");
    }
    public String getTitulo(){
        return getText("login.titulo");
    }
    public String getBt(){
        return getText("login.bt");
    }
}
