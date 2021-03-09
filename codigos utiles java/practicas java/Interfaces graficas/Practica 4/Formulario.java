import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{

  JButton boton1;
  public Formulario(){
  setLayout(null);
  boton1 = new JButton("Cerrar");
  boton1.setBounds(300,250,100,30);
  add(boton1);
  boton1.addActionListener(this);
 }

  public void actionPerformed(ActionEvent e){

   if(e.getSource() == boton1){
    System.exit(0);
  }
 }

  public static void main(String args[]){
  Formulario ventana = new Formulario();
  ventana.setBounds(0,0,450,350);
  ventana.setVisible(true);
  ventana.setLocationRelativeTo(null);
  ventana.setResizable(false);
  
 }
}