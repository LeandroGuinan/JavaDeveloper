import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

  private JTextField txt1,txt2;
  private JLabel val1, val2, Res;
  private JButton bot1;

  public Formulario(){
   setLayout(null);

   val1 = new JLabel("valor 1:");
   val1.setBounds(50,5,100,30);
   add(val1);

   val2 = new JLabel("Valor 2:");
   val2.setBounds(50,35,100,30);
   add(val2);

   Res = new JLabel("Resultado: ");
   Res.setBounds(120,80,100,30);
   add(Res);

   txt1 = new JTextField();
   txt1.setBounds(120,10,150,20);
   add(txt1);
 
   txt2 = new JTextField();
   txt2.setBounds(120,40,150,20);
   add(txt2);

   bot1 = new JButton("Sumar");
   bot1.setBounds(10,80,100,30);
   add(bot1);
   bot1.addActionListener(this);
 }

  public void actionPerformed(ActionEvent eve){
   if(eve.getSource() == bot1){
    int valor1 = 0, valor2 = 0, res = 0;

    valor1 = Integer.parseInt(txt1.getText());
    valor2 = Integer.parseInt(txt2.getText());

    res = valor1 + valor2;
 
    Res.setText("Resultado: " + res); 
  }
 }

  public static void main(String args[]){
   Formulario vent = new Formulario();
   vent.setBounds(0,0,300,150);
   vent.setVisible(true);
   vent.setResizable(false);
   vent.setLocationRelativeTo(null);
   vent.setTitle("Suma");
 }
}