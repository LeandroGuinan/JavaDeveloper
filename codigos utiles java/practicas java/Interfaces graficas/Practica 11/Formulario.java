import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ItemListener{

  private JComboBox com;

  public Formulario(){
   setLayout(null);

   com = new JComboBox();
   com.setBounds(10,10,80,20);
   add(com);

   com.addItem("Rojo");
   com.addItem("verde");
   com.addItem("azul");
   com.addItem("negro");
   com.addItemListener(this);
 }

  public void itemStateChanged(ItemEvent eve){
  
   if(eve.getSource() == com){
    String seleccion = com.getSelectedItem().toString();
    setTitle(seleccion);
  }

 }

  public static void main(String args[]){

   Formulario vent = new Formulario();
   vent.setBounds(0,0,200,100);
   vent.setVisible(true);
   vent.setResizable(false);
   vent.setLocationRelativeTo(null);

 }
}