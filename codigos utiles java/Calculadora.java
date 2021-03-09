import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener{

  private JLabel etq;
  private JButton bot1, bot2, bot3, bot4, bot5;
  private JTextField ent1, ent2;
  Float val1 = 0, val2 = 0, res = 0; 
  int op = 0;

  public Calculadora(){
  setLayout(null);

  etq = new JLabel("El Resultado es: ");
  etq.setBounds(50,50,100,100);
  add(etq);
 
  bot1 = new JButton("+");
  bot1.setBounds(200,10,30,30);
  add(bot1);
  bot1.addActionListener(this);

  bot2 = new JButton("-");
  bot2.setBounds(200,30,30,30);
  add(bot2);
  bot2.addActionListener(this);
 
  bot3 = new JButton("*");
  bot3.setBounds(200,50,30,30);
  add(bot3);
  bot3.addActionListener(this);

  bot4 = new JButton("/");
  bot4.setBounds(200,70,30,30);
  add(bot4);
  bot4.addActionListener(this);

  bot5 = new JButton("=");
  bot5.setBounds(200,90,30,30);
  add(bot5);
  bot5.addActionListener(this);

  ent1 = new JTextField();
  ent1.setBounds(100,10,30,30);
  add(ent1);

  ent2 = new JTextField();
  ent2.setBounds(100,30,30,30);
  add(ent2);
 }

  public void actionPerformed(ActionEvent eve){
   if(eve.getSource() == bot1){
   op = 1;

  }if(eve.getSource() == bot2){
    op = 2;

  }if(eve.getSource() == bot3){
    op = 3;

  }if(eve.getSource() == bot4){
    op = 4;

  }if(eve.getSource() == bot5){

   String T1 = ent1.getText();
   String T2 = ent2.getText(); 
 
   Float T3 = Float.parseFloat(T1);
   Float T4 = Float.parseFloat(T2);

   val1 = T3;
   val2 = T4;
 
    switch(op){

     case 1:
     res = val1 + val2;
     etq.setText("Tu Resultado es: " + res);

     case 2: 
     res = val1 - val2;
     etq.setText("Tu Resultado es: " + res);  
   
     case 3:
     res = val1 * val2;
     etq.setText("Tu Resultado es: " + res);
 
     case 4:
     res = val1 / val2;
     etq.setText("Tu Resultado es: " + res);

     default:
     
 
   }

  }

 }

  public static void main(String args[]){

   Calculadora vent = new Calculadora();
   vent.setBounds(0,0,300,200);
   vent.setVisible(true);
   vent.setLocationRelativeTo(null);
   vent.setResizable(false);

 }
}
