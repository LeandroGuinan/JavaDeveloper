import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
  
  private JTextField textfile1;
  private JLabel etq;
  private JButton bot1;

  public Formulario(){
  setLayout(null);
  
  etq = new JLabel("Usuario:");
  etq.setBounds(100,10,100,30);
  add(etq);

  textfile1 = new JTextField();
  textfile1.setBounds(120,17,150,20);
  add(textfile1);

  bot1 = new JButton("Aceptar");
  bot1.setBounds(10,80,100,30);
  add(bot1);
  bot1.addActionListener(this);
 }

  public void actionPerformed(ActionEvent eve){
  if (eve.getSource() == bot1){
    String txt = textfile1.getText();
    setTitle(txt);
  }
 }

  public static void main(String args[]){
  Formulario vent = new Formulario();
  vent.setBounds(0,0,300,150);
  vent.setVisible(true);
  vent.setLocationRelativeTo(null);
  vent.setResizable(false);
 }
}