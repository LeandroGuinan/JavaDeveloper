import javax.swing.*;

public class Formulario extends JFrame{

  private JTextField txt1;
  private JScrollPane scroll;
  private JTextArea txt2;

  public Formulario(){
   setLayout(null);

   txt1 = new JTextField();
   txt1.setBounds(10,10,200,30);
   add(txt1);

   txt2 = new JTextArea();
   scroll = new JScrollPane(txt2);
   scroll.setBounds(10,50,400,300);
   add(scroll);
 }

  public static void main(String args[]){
   
  Formulario vent = new Formulario();
  vent.setBounds(0,0,540,400);
  vent.setVisible(true);
  vent.setResizable(false);
  vent.setLocationRelativeTo(null);

 }
}