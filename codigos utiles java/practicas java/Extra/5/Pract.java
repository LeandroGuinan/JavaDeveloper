import javax.swing.*;
import java.awt.event.*;

public class Pract extends JFrame implements ActionListener{
  private JLabel label;
  private JButton bot1, bot2, bot3;

  public Pract(){
   setLayout(null);
   bot1 = new JButton("1");
   bot1.setBounds(10,100,90,30);
   add(bot1);
   bot1.addActionListener(this);

   bot2 = new JButton("2");
   bot2.setBounds(110,100,90,30);
   add(bot2);
   bot2.addActionListener(this);
   
   bot3 = new JButton("3");
   bot3.setBounds(210,100,90,30);
   add(bot3);
   bot3.addActionListener(this);

  label = new JLabel(" ¿Cual boton cierra el programa?");
  label.setBounds(10,10,300,30);
  add(label);
 }

  public void actionPerformed(ActionEvent eve){

  if(eve.getSource() == bot1){
   System.exit(0);
  }if(eve.getSource() == bot2){
   System.exit(0);
  }if(eve.getSource() == bot3){
   System.exit(0);
  }
 }

  public static void main(String args[]){
   Pract ventana = new Pract();
   ventana.setBounds(0,0,350,200);
   ventana.setVisible(true);
   ventana.setLocationRelativeTo(null);
   ventana.setResizable(true);
 }
}