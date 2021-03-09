public class CiclosDos{
  public static void main(String args[]){
  
  int i =1, j = 99;

  System.out.println("serie con for");
  for(i = 1; i <=5; i++){
   if(i < 5){
   System.out.print(i + ", ");
   System.out.print(j + ", ");
   }else {
     System.out.print(i +", ");
      System.out.print(j); 
   }
   j--;
  }

   i = 1;
   j = 99;

   System.out.println("serie con while");

  while(i <= 5){
  if(i < 5){
   System.out.print(i + ", ");
   System.out.print(j + ", ");
   }else {
     System.out.print(i +", ");
      System.out.print(j); 
   }
   j--;
   i++;
  }
  

   i = 1;
   j = 99;

   System.out.println("serie con do-while");

   do{
    if(i < 5){
   System.out.print(i + ", ");
   System.out.print(j + ", ");
   }else {
     System.out.print(i +", ");
      System.out.print(j); 
   }
   j--;
   i++;
  }while(i <=5);
 }
}