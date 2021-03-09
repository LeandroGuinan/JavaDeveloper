
package ejemploClasesAbstractas;
import Abstracto.Domain.*;

public class EjemploClasesAbstractas {
    public static void main(String[]args){
        //creando objetos:
        //FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        System.out.println(rectangulo);
        rectangulo.dibujar();
        
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        System.out.println(triangulo);
        triangulo.dibujar();
        
        FiguraGeometrica circulo = new Circulo("Circulo");
        System.out.println(circulo);
        circulo.dibujar();
    }
    
}
