import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener, ChangeListener{

  private JLabel lb1;
  private JCheckBox chk1;
  private JButton bot1;

  public Formulario(){
   setLayout(null);
   
   lb1 = new JLabel("Aceptat terminos y condiciones");
   lb1.setBounds(10,10,400,30);
   add(lb1);

   chk1 = new JCheckBox("Acepto");
   chk1.setBounds(10,50,100,30);
   chk1.addChangeListener(this);
   add(chk1);

   bot1 = new JButton("Continuar");
   bot1.setBounds(10,100,100,30);
   bot1.addActionListener(this);
   add(bot1);
   bot1.setEnabled(false); 
 }



   public void stateChanged(ChangeEvent eve){
   if(chk1.isSelected() == true){
     bot1.setEnabled(true);
   }else {
     bot1.setEnabled(false);
   }
 }

  public void actionPerformed(ActionEvent eve){

   if(eve.getSource() == bot1){
    System.exit(0);
  }
 }



  public static void main(String args[]){
   Formulario vent = new Formulario();
   vent.setBounds(0,0,350,200);
   vent.setVisible(true);
   vent.setResizable(false);
   vent.setLocationRelativeTo(null);
 }
}