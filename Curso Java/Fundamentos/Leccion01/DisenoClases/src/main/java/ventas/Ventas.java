package ventas;

import com.gm.ventas.*;

public class Ventas {
    public static void main(String[]args){
        //Crear varios objetos de tipo productos
        Producto producto1 = new Producto("Camisa",50);
        Producto producto2 = new Producto("Pantalon",100);
        
        //creamos objetos tipo orden
        Orden orden1 = new Orden();
        //Agregamos los productos a la orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
        //imprimir orden
        orden1.mostrarOrden();
        
    }
}
