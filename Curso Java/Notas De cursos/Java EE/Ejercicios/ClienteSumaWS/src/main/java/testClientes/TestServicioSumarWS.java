
package testClientes;

import clientews.servicio.ServicioSumarIMPLService;
import clientews.servicio.ServicioSumarWS;

/**
 *
 * @author guina
 */
public class TestServicioSumarWS {
    
    public static void main(String[] args) {
        ServicioSumarWS servicioSumar = new ServicioSumarIMPLService().getServicioSumarIMPLPort();
        
        System.out.println("Ejecutando servicio sumar WS");
        
        int a = 6;
        int b = 3;
        
        int res = servicioSumar.sumar(a, b);
        
        System.out.println("res = " + res);
        System.out.println("Fin de servicio sumar");
    }
}
