/*
Derechos reservados Leandro Guinan
*/
package prueba;

import com.gm.JavaDoc.*;

/**
 * clase para probar el comcepto de javadoc
 * @author Leandro Guinan
 * @version 1.0
 */
public class PruebaJavaDoc {
    /**
     * metodo que ejecuta la prueba de la calse aritmetica
     * @param args es un arreglo de tipo String de la linea de comandos
     */
    public static void main(String[]args){
        
        Aritmetica aritmetica1 = new Aritmetica(3,2);
        int resultado;
        
        resultado = aritmetica1.sumar();
        System.out.println("resultado = " + resultado);
    }
}
