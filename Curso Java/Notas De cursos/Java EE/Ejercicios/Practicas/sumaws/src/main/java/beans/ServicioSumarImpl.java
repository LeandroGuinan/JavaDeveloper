package beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

//esta clase es un ejb por lo tanto debe agregarse la implementacion:
@Stateless

//al ser un web service tambien se debe agregar esta anotacion: haciendo referencia a la interface WS que implementa
@WebService(endpointInterface = "beans.ServicioSumarWS")
public class ServicioSumarImpl implements ServicioSumarWS {

    @Override
    public int sumar(int a, int b) {
        return a + b;
    }
    
    //terminada la implementacion se sube este WebService al servidor de aplicaciones

}
