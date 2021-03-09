import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

  private JLabel label1, label2, label3;
  private JComboBox com1, com2,com3;
  private JButton bot;

  public Formulario(){
   setLayout(null);

   label1 = new JLabel("Rojo");
   label1.setBounds(10,10,100,10);
   add(label1);
 
   com1 = new JComboBox();  
   for(int i = 0; i <=255; i++){
   com1.setBounds(120,10,50,30);
   com1.addItem(String.valueOf(i));
  }
   add(com1);

   label2 = new JLabel("Verde");
   label2.setBounds(50,10,100,10);
   add(label2);

   com2 = new JComboBox();   
   for(int i = 0; i <=255; i++){
   com2.setBounds(120,50,50,30);
   com2.addItem(String.valueOf(i));
  }
   add(com2);

   label3 = new JLabel("Azul");
   label3.setBounds(10,90,100,10);
   add(label2);

   com3 = new JComboBox();   
   for(int i = 0; i <=255; i++){
   com3.setBounds(120,90,50,30);
   com3.addItem(String.valueOf(i));
  }
   add(com3);

   bot = new JButton("Fijar Color");
   bot.setBounds(10,130,100,30);
   add(bot);
   bot.addActionListener(this);
 }



  public void actionPerformed(ActionEvent eve){

   if(eve.getSource() == bot){
    String cad1 = com1.getSelectedItem().toString();
    String cad2 = com2.getSelectedItem().toString();
    String cad3 = com3.getSelectedItem().toString();

    int rojo = Integer.parseInt(cad1);
    int verde = Integer.parseInt(cad2);
    int azul = Integer.parseInt(cad3);

    Color color1 = new Color(rojo,verde,azul);
    bot.setBackground(color1);
    
  } 
 }



 public static void main(String args[]){
 
  Formulario vent = new Formulario();
  vent.setBounds(0,0,190,220);
  vent.setVisible(true);
  vent.setResizable(false);
  vent.setLocationRelativeTo(null);
 }
}