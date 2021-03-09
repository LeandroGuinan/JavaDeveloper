package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

public class LoginAction extends ActionSupport {

    Logger log = LogManager.getLogger(LoginAction.class);

    private String user;
    private String pass;

    @Override
    public String execute() throws Exception {
        if ("admin".equals(this.user)) {
            log.info("Ejecucion Correcta");
            return SUCCESS;
        } else {
            return INPUT;
        }

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
}
