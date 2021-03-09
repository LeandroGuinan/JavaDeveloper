package beans;

import javax.jws.WebMethod;
import javax.jws.WebService;

//al ser un WebService debe incluir la anotacion:
@WebService 
public interface ServicioSumarWS {
    
    
    //al ser este un metodo que se utilizara en el WebService
    @WebMethod
    public int sumar(int a, int b);
        
    
}
