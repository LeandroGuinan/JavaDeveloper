public class Fibonacci{
  public static void main(String args[]){

  int a = 0, b = 1,c = 0;

  while(c < 22){
   if(c == 0){
   System.out.print(a + ", ");
   }else{
   System.out.print(c +", ");
   }
  c = a + b;
  b = a;
  a = c;  
  }
 
  System.out.print(c);

 }
}