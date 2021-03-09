import javax.swing.*;
import java.awt.event.*;

public class Calculadora extends JFrame implements ActionListener{

  private JButton Sm, Rs, Ml, Dv, Res;
  private JLabel etq;
  private JTextField txt1, txt2;

  public Calculadora(){
   setLayout(null);

   Sm = new JButton("+");
   Sm.setBounds(200,100,100,30);
   add(Sm);
   Sm.addActionListener(this);

   Rs = new JButton("-");
   Rs.setBounds(200,120,100,30);
   add(Rs);
   
   Ml = new JButton("*");
   Ml.setBounds(200,140,100,30);
   add(Ml);
   Ml.addActionListener(this);

   Dv = new JButton("/");
   Dv.setBounds(200,160,100,30);
   add(Dv);

   Res = new JButton("=");
   Rs.setBounds(200,180,100,30);
   add(Rs);
   Rs.addActionListener(this);

   etq = new JLabel("Resultado:");
   etq.setBounds(50,50,100,50);
   add(etq);

   txt1 = new JTextField();
   txt1.setBounds(50,100,100,30);
   add(txt1);

   txt2 = new JTextField();
   txt2.setBounds(50,140,100,30);
   add(txt2);
 }


  public void actionPerformed(ActionEvent eve){

  int val1 = 0, val2 = 0, res = 0, op = 0;


  val1 = Integer.parseInt(txt1.getText());
  val2 = Integer.parseInt(txt2.getText());
  
   if(eve.getSource() == Sm){
    op = 1;

  }if(eve.getSource() == Rs){
    op = 2;

  }if(eve.getSource() == Ml){
    op = 3;

  }if(eve.getSource() == Dv){
    op = 4;

  }if(eve.getSource() == Rs){

    switch(op){

    case 1:
    res = val1 + val2;
    etq.setText("Resultado: " + res);

    case 2:
    res = val1 - val2;
    etq.setText("Resultado: " + res);
  
    case 3:
    res = val1 * val2;
    etq.setText("Resultado: " + res);
  
    case 4:
    res = val1 / val2;
    etq.setText("Resultado: " + res);

    default:

   }

  }

 } 

  public static void main(String args[]){

   Calculadora vent = new Calculadora();
   vent.setBounds(0,0,300,400);
   vent.setVisible(true);
   vent.setResizable(false);
   vent.setLocationRelativeTo(null);
   vent.setTitle("Calculadora");

 }
}
