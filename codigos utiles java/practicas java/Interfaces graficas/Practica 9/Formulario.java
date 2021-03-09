import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
 
  private JTextField txt1;
  private JScrollPane scroll;
  private JTextArea txt2;
  private JButton bot;

  String texto = "";

  public Formulario(){
   setLayout(null);

   txt1 = new JTextField();
   txt1.setBounds(10,10,200,30);
   add(txt1);

   bot = new JButton("Agregar");
   bot.setBounds(250,10,100,30);
   add(bot);
   bot.addActionListener(this);

   txt2 = new JTextArea();
   scroll = new JScrollPane(txt2);
   scroll.setBounds(10,50,400,300);
   add(scroll);
 }

 public void actionPerformed(ActionEvent eve){
  if(eve.getSource() == bot){
   texto += txt1.getText() + "\n";
   txt2.setText(texto);
   txt1.setText("");
  }
 }
  public static void main(String args[]){
   Formulario vent = new Formulario();
   vent.setBounds(0,0,540,400);
   vent.setVisible(true);
   vent.setResizable(false);
   vent.setLocationRelativeTo(null);
 }
}