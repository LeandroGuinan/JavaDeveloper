package test;

import genericos.ClaseGenerica;

public class ManejoGenericosTest {
    public static void main(String[]args){
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        
        objetoInt.ObtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Prueba");
        objetoString.ObtenerTipo();
        
        //no es posible asignarle valores enteros primitivos a estos tipos
    }
}
