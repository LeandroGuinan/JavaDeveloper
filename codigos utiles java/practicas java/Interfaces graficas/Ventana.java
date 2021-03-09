import javax.swing.*;

public class Ventana extends JFrame{
 
  public Ventana(){
  setLayout(null);
 }

  public static void main(String args[]){
   Ventana ventana1 = new Ventana();
   ventana1.setBounds(0,0,500,500);
   ventana1.setVisible(true);
   ventana1.setLocationRelativeTo(null);
   ventana1.setResizable(false);
 
   Ventana ventana2 = new Ventana();
   ventana2.setBounds(0,0,300,300);
   ventana2.setVisible(true);
   ventana2.setLocationRelativeTo(null);
   ventana2.setResizable(true);

 }
}