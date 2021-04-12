package mx.com.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class fecha {
    
    public String obtenerFecha(){
        Date fecha = new Date();
        DateFormat dataFecha = new SimpleDateFormat("dd-MM-yyyy");
        String dia = dataFecha.format(fecha);
        return dia;
    }
    
}
