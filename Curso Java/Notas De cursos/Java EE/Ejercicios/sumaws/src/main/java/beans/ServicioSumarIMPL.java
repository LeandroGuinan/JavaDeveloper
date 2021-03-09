package beans;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "beans.ServicioSumarWS")
public class ServicioSumarIMPL implements ServicioSumarWS{

    @Override
    public int sumar(int a, int b) {
        return a+b;
    }
    
}
