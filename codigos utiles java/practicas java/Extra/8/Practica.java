import javax.swing.*;
import java.awt.event.*;

public class Practica extends JFrame implements ActionListener{

  private JComboBox combo1;
  private JLabel etq;
  private JButton bot;

  public Practica(){
   setLayout(null);

   combo1 = new JComboBox();
   combo1.setBounds(50,50,100,30);
   
   combo1.addItem("Hola");
   combo1.addItem("Adios");

   add(combo1);

   etq = new JLabel("");
   etq.setBounds(50,80,100,30);
   add(etq);

   bot = new JButton("Responder");
   bot.setBounds(80,80,100,30);
   add(bot);
   bot.addActionListener(this);
 }



  public void actionPerformed(ActionEvent eve){
 
  if(eve.getSource() == bot){
    String seleccion = combo1.getSelectedItem().toString();

    if(seleccion.equals("Hola")){
     etq.setText("¿que tal como estas?");

   }if(seleccion.equals("Adios")){
     etq.setText("Hasta pronto");

   }
    
  }

 }

  public static void main(String args[]){

   Practica vent = new Practica();
   vent.setBounds(0,0,250,150);
   vent.setVisible(true);
   vent.setLocationRelativeTo(null);
   vent.setResizable(true);
 }
}