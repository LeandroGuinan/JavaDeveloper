public class Eleccion{
  public static void main(String args[]){
  
  int val_uno = 5;
  int val_dos = 5;
  int val_tres = 10;
  int res = 0;
 
  res = (val_uno + val_dos + val_tres)/2;

  if(res >= 11){
    System.out.println("tu operacion es correcta");
  } else{
    System.out.println("Tu operacion es incorrecta");
  }
 }
}