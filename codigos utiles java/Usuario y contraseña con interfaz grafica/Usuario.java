import javax.swing.*;
import java.awt.event.*;

public class Usuario extends JFrame implements ActionListener{

  private JLabel us, ps, Hablador;
  private JTextField usf, psf;
  private JButton ent;
  String uss = "Leandro", pss = "resident00evil";
  int i = 0;

  public Usuario(){
  setLayout(null);
  
  us = new JLabel("Usuario:");
  us.setBounds(50,25,50,10);
  add(us);

  ps = new JLabel("Contraseña:");
  ps.setBounds(50,110,70,10);
  add(ps);

  usf = new JTextField();
  usf.setBounds(50,50,100,25);
  add(usf);

  psf = new JTextField();
  psf.setBounds(50,130,100,25);
  add(psf);
  
  Hablador = new JLabel("En espera");
  Hablador.setBounds(300,100,200,10);
  add(Hablador);

  ent = new JButton("Entrar");
  ent.setBounds(300,200,100,30);
  add(ent);
  ent.addActionListener(this);
  
 }

  public void actionPerformed(ActionEvent eve){
   if(eve.getSource() == ent){
    String txt1 = usf.getText();
    String txt2 = psf.getText();
      
     if(txt1.equals(uss) && txt2.equals(pss)){
      i++;
      System.exit(0);
    }else{
      Hablador.setText("Usuario o contraseña Incorrecta");
      
   }
  }

 }

  public static void main(String args[]){
   Usuario vent = new Usuario();
   vent.setBounds(0,0,550,300);
   vent.setTitle("Usuario");
   vent.setVisible(true);
   vent.setResizable(false);
   vent.setLocationRelativeTo(null);

 }
}