package testclientews;

import clientews.servicio.ServicioSumarImplService;
import clientews.servicio.ServicioSumarWS;

public class TestServicioSumarWS {

    public static void main(String[] args) {
        //aqui estamos creando una instancia del objeto ServicioSumarImpl y creando una instancia del servicio web
        ServicioSumarWS servicioSumar = new ServicioSumarImplService().getServicioSumarImplPort();
        System.out.println("Ejecutando servicio sumar ws");
        int x = 6;
        int y = 9;
        int resultado = servicioSumar.sumar(x, y);
        System.out.println("Resultado: " + resultado);
        System.out.println("Fin de servicio sumar WS");
    }
}
