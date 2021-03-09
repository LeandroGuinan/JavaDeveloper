package test;

import enumeraciones.*;


public class EjemploEnumeraciones {
    public static void main(String[]args){
        //VALORES DE LA ENUMERACION
        System.out.println("Valor 1: "+Dias.LUNES);
        System.out.println("Valor 2: "+Dias.MARTES);
        
        //utilizamos la enumeracion de paises
        
        System.out.println("Continentes no.4 "+Continentes.AMERICA);
        System.out.println("Accedemos al numero de paises del continente no.4: "+ 
                Continentes.AMERICA.getPaises());
        
        System.out.println("Accedemos al continente no.1: "+Continentes.AFRICA);
        System.out.println("Accedemos al numero de paises del continente 1: " + Continentes.AFRICA.getPaises());
        
        indicarDia(Dias.LUNES);
    }

    private static void indicarDia(Dias dias) {
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            
        }
            
                
    }
    
}
