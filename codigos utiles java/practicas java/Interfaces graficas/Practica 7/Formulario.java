import javax.swing.*;

public class Formulario extends JFrame{

  private JTextField textfile1;
  private JTextArea textarea1;

  public Formulario(){
  setLayout(null);

  textfile1 = new JTextField();
  textfile1.setBounds(10,10,200,30);
  add(textfile1);

  textarea1 = new JTextArea();
  textarea1.setBounds(10,50,400,300);
  add(textarea1);
 }
  
  public static void main(String args[]){
 
   Formulario vent = new Formulario();
   vent.setBounds(0,0,540,400);
   vent.setVisible(true);
   vent.setResizable(false);
   vent.setLocationRelativeTo(null);
 }
}
