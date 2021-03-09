import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;

public class BackDoor extends JFrame implements ActionListener{
  
  private JTextArea Codex;
  private JScrollPane scroll;
  private JButton bot1, bot2, bot3;
  int A = 0, B = 0, C = 0;

  public BackDoor(){
   setLayout(null);

   Codex = new JTextArea();
   scroll = new JScrollPane(Codex);
   scroll.setBounds(10,10,400,300);
   add(scroll);

   bot1 = new JButton("Uranium");
   bot1.setBounds(20,330,100,30);
   add(bot1);
   bot1.addActionListener(this);

   bot2 = new JButton ("Plutonium");
   bot2.setBounds(130,330,100,30);
   add(bot2);
   bot2.addActionListener(this);

   bot3 = new JButton("Curium");
   bot3.setBounds(250,330,100,30);
   add(bot3);
   bot3.addActionListener(this);
 }

  public void actionPerformed(ActionEvent eve){
   if(eve.getSource() == bot1){
    A++;

  }if(eve.getSource() == bot2){
    B++;

  }if(eve.getSource() == bot3){
    C++;

  }
   if(A == 1 && B == 2 && C == 3){
    Codex.setText("El conocimiento abre paso a la presencia de la luna");

  }


 }

  public static void main(String args[]){

   
   BackDoor vent = new BackDoor();
   vent.setBounds(0,0,500,400);
   vent.setVisible(true);
   vent.setResizable(false);
   vent.setLocationRelativeTo(null);
   
   String Sl = "";
   Scanner in = new Scanner(System.in);

   System.out.print("Deseas activar protocolo BackDoor?");
   Sl = in.nextLine();

   if(Sl.equalsIgnoreCase("si")){
    System.out.println("Presiona (Uranium) una vez, (Plutonium) dos veces, (Curium) tres veces");

   }
 }
}