package beans.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.logging.log4j.*;

//extendemos de la clase ActionSuport, que es la clase mas completa
//para procesar acciones
public class MostrarPersonaAction extends ActionSupport{
    /*
    clase de accion de struts no necesariamente debe extender o implementar otra clase java
    */
    
    //aqui indicamos en este log la clase que estamos llamando
    Logger log = LogManager.getLogger(MostrarPersonaAction.class);
    
    private String nombre;
    
    //para que sea una clase de accion debe existir el metodo, y ademas se sobreescribe el metodo por ende::
    @Override
    public String execute(){
        log.info("El nombre es: " + nombre);
        return SUCCESS;
    }
    /*
    Struts funciona de la siguiente manera:
    1.en el index se hace referencia a una accion, en este caso "saludar"
    
    (en este caso se salta el paso 2, gracias al uso de convenciones)
    2.esta accion es procesada por el struts.xml, por tanto debe existir
    una accion con este nombre
    
    3.en este xml procesa la accion y ejecuta el execute de la clase
    establecida en esta(en este caso: beans.MostrarPersonaAction)
    
    4.esta redirige la llamada a la pagina jsp estableccida
    
    5.esta pagina jsp puede acceder a la informacion de la clase
    accion
    
    */
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //al hacer extends de la clase ActionSupport tenemos acceso al metodo getText, que nos permite
    //recuperar el texto de una llave en archivo de propiedades
    //creamos el metodo get:
    public String getTitulo(){
        //llamamos al metodo de la clase padre, y enviamos el nombre de la llave:
        return getText("persona.titulo");
    }
    
    //y del mismo modo con las demas llaves:
    public String getValor(){
        return getText("persona.valor");
    }
    
    public String getBoton(){
        return getText("persona.boton");
    }
}
