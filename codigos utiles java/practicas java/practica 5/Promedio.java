public class Promedio{
  public static void main(String args[]){
 
  int Matematicas = 5;
  int Biologia = 5;
  int Quimica = 5;
  int Prom = 0;
  
  Prom = (Matematicas + Biologia + Quimica) / 3;

  if(Prom >= 6){
    System.out.println("El alumno aprobo, con un promedio de: " + Prom);
  } else{
    System.out.println("El alumno reprobo, con un promedio de: " + Prom);
  }
 }
}