package manejoColecciones;

import java.util.*;


public class ManejoColecciones {
    public static void main(String[]args){
        
        //puede almacenar tanto tipos int como tipos object
        List miLista = new ArrayList();
        
        miLista.add("1");
        miLista.add(2);
        miLista.add(3);
        //elemento repetido
        miLista.add(3);
        
       // imprimir(miLista);
        
        Set miSet = new HashSet();
        miSet.add("100");
        miSet.add("200");
        miSet.add("300");
        // elemento duplicado no se agrega
        miSet.add("300");
        
        //imprimir(miSet);
        
        Map miMapa = new HashMap();
        //llave valor
        miMapa.put("valor1", "juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "jose");
        //elemento duplicado sustituye el valor agregado previamente
        miMapa.put("valor3", "Rosario");
        //imprimimos todas las llaves
    //    imprimir(miMapa.keySet());
        //imprmimos los valores asociados
    //    imprimir(miMapa.values());
    
        // con esto obtenemos el valor de una llave
         System.out.println( miMapa.get("valor2"));
        
    }
    
    private static void imprimir(Collection coleccion){
        for(Object elemento:coleccion){
            System.out.println("Elemento: " +elemento);
            System.out.println("");
        }
    }
}
