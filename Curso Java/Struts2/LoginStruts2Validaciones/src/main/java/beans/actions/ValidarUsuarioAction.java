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
    @Result(name="input", location="/WEB-INF/content/login.jsp")
        //en este caso se redirige a la pagina jsp para que podamos validar mensajes de error,
        //si no hacemos esto estos mensajes se pierden, y podemos quitar el type
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
            //existen varias formas de enviar mensajes, no necesariamente de error a nuestros jsp
            //en este caso mensaje informativo, una de ellas es la siguiente:
            addActionMessage(getText("usuario.valido"));
            //la cual llama a una a una llave en configuraciones, y envia esta al jsp
            
            log.info("Ejecucion Correcta");
            return SUCCESS;
        } else {
            return INPUT;
        }

    }
    
    
    //si queremos agregar validaciones a nuestras acciones, debemos agregar el metodo:
    @Override
    public void validate() {
        //que ocurre si el usuario es nulo, o si es igual a cadena vacia tanto a la izquierda como la derecha
        if(this.user == null || "".equals(this.user.trim())){
            //este metodo regresa un error el cual esta definido en archivo de propiedades
            addFieldError("user",getText("val.user"));
        }else if(!usuarioValido()){
            //en este campo se verifica que el ususario sea valido en el metodo:
            addActionError(getText("user.invalido"));
            // de ser invalido este geneta este error.
        }
        
        //ahora agregamos las validaciones respectivas al campo de password, en este caso si es igual a null o si es igual a cadena
        //vacia:
        if(this.pass == null || "".equals(this.pass.trim())){
            //iguales condiciones a la validacion de user anterior
            addFieldError("pass",getText("val.pass"));
        }else if(pass.length() < 3){
            //en esta condicion revisamos si el pass es menor a 3 caracteres
            addFieldError("pass", getText("val.pass.min.len"));
        }
        
    }
    //con este metodo verificamos que el valor del ususario sea admin
    private boolean usuarioValido(){
        return "admin".equals(this.user);
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
