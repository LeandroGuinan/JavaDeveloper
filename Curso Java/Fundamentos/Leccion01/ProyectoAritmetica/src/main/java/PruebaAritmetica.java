public class PruebaAritmetica {
    public static void main(String[]args){
       //variable local: son aquellas definidads dentro de un metodo
       int operandoA = 6;
       int operandoB = 2;
       
       //creamos un objeto de clase aritmetica enviando argumentos
       Aritmetica objeto1 = new Aritmetica(operandoA,operandoB);
       
       //imprimimos los valores de los operadores
        System.out.println("operandoA = " + operandoA);
        System.out.println("operandoB = " + operandoB);
           
        //Imprimimos el resultado de la suma
        System.out.println("\n resultado de la suma: "+objeto1.sumar());
        //Imprimimos resultados de las restas:
        System.out.println("\n resultado de la suma: "+objeto1.restar());
        //Imprimimos el resultado de la multiplicacion:
        System.out.println("\n resultado de la multiplicacion: "+objeto1.multiplicar());
        //Imprimimos el resultado de la division:
        System.out.println("\n resultado de la division: "+objeto1.dividir());
       
       
    }
    
  }
