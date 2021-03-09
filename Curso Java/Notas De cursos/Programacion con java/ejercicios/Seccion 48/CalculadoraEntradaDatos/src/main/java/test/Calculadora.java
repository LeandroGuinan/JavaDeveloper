package test;

import java.util.Scanner;
import static calculadora.Operaciones.sumar;

public class Calculadora {
    
        public static void main(String[] args){
            System.out.println("Proporciona el primer valor: ");
            Scanner in = new Scanner(System.in);
            
            int a = in.nextInt();
            
            System.out.println("Proporciona el segundo valor: ");
            int b = in.nextInt();
            
            int resultado = sumar(a,b);
            
            System.out.println("Resultado: "+resultado);
            
        }
}
