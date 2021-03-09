package test;

import Domain.Division;
import Domain.OperacionExepcion;



public class ManejoExepciones1 {
    public static void main(String[]args){
        
        try {
            Division division = new Division(10,2);
        } catch (OperacionExepcion ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println("El programa continua");
        
    }
}
