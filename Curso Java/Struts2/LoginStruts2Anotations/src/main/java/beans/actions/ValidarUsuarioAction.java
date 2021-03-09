package beans.actions;

import static com.opensymphony.xwork2.Action.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;
import org.apache.struts2.convention.annotation.*;

//debido a que utilizaremos varias acciones, utilicamos la anotacin:
@Results({
    //y en esta anotacion individualmente establecemos los restultados de estas acciones, de forma que:
    //en este caso particular, al retornar success la accion, se redirige a la pagina bienvenido.jsp
    @Result(name="success", location="/WEB-INF/content/bienvenido.jsp"),
    //en este caso al retornar el valor de input, nos redirige a la accion de login, que nos regresa a la pagina login.jsp    
    @Result(name="input", location="login",type="redirectAction")    
})
public class ValidarUsuarioAction extends ActionSupport {

    Logger log = LogManager.getLogger(LoginAction.class);

    private String user;
    private String pass;
    
    //de igual manera debemos darle nombre a la accion realizada en este metodo execute, de manera que lo podemos llamar:
    @Action("validarUsuario")
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
