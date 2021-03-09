package mundopc;
import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[]args){
        Monitor monitorA = new Monitor("Toshiba",13);
        Teclado tecladoA = new Teclado("Bluetooth","Toshiba");
        Raton ratonA = new Raton("Inalambrico","Toshiba");
        Computadora computadora1 = new Computadora("Toshiba",monitorA,tecladoA,ratonA);
        
        Computadora pcfinal = new Computadora("pc armada",monitorA,tecladoA,ratonA);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(pcfinal);
        
        orden1.motrarOrden();
        
    }
    
}
