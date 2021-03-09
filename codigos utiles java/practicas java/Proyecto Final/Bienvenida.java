import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

  private JTextField txt1;
  private JLabel etq1, etq2, etq3, etq4;
  private JButton bot1;
  public static String texto = "";

  public Bienvenida(){
   setLayout(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);

   setTitle("Bienvenido");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

   ImageIcon imagen = new ImageIcon("images/logo-coca.png");
   etq1 = new JLabel(imagen);
   etq1.setBounds(25,15,300,150);
   add(etq1);

   etq2 = new JLabel("Sistema de Control Vacacional");
   etq2.setBounds(35,135,300,30);
   etq2.setFont(new Font("Andale Mono", 3, 18));
   etq2.setForeground(new Color(255,255,255));
   add(etq2);

   etq3 = new JLabel("Ingrese su nombre");
   etq3.setBounds(45,212,200,30);
   etq3.setFont(new Font("Andale Mono", 1, 12));
   etq3.setForeground(new Color(255,255,255));
   add(etq3);

   etq4 = new JLabel("©2017 the Coca-Cola Company");
   etq4.setBounds(85,375,300,30);
   etq4.setFont(new Font("Andale Mono", 1, 12));
   etq4.setForeground(new Color(255,255,255));
   add(etq4);
  
   txt1 = new JTextField();
   txt1.setBounds(45,240,255,25);
   txt1.setBackground(new Color(224,224,224));
   txt1.setFont(new Font("Andale Mono", 1, 14));
   txt1.setForeground(new Color(255,0,0));
   add(txt1);

   bot1 = new JButton("Ingresar");
   bot1.setBounds(125,280,100,30);
   bot1.setBackground(new Color(255,255,255));
   bot1.setFont(new Font("Andale Mono", 1, 14));
   bot1.setForeground(new Color(255,0,0));
   bot1.addActionListener(this);
   add(bot1);
 }
  public void actionPerformed(ActionEvent eve){
  
   if(eve.getSource() == bot1){
    texto = txt1.getText().trim();
    if(texto.equals("")){
     JOptionPane.showMessageDialog(null, "Debes Ingresar Tu Nombre");
   }else{
     
     Licencia vent = new Licencia();
     vent.setBounds(0,0,600,360);
     vent.setVisible(true);
     vent.setResizable(false);
     vent.setLocationRelativeTo(null);
     this.setVisible(false);
   }    
  }
 }


  public static void main(String args[]){
   Bienvenida vent = new Bienvenida();
   vent.setBounds(0,0,350,450);
   vent.setVisible(true);
   vent.setResizable(false);
   vent.setLocationRelativeTo(null);

 }
}