package appli;

import javax.swing.JFrame;

import elements.Element;

public class Fenetre extends JFrame {
	
  public Fenetre(Element[][] carte){
    this.setTitle("JAVAGAME");
    this.setSize(700, 730);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
    this.setVisible(true);
    this.setResizable(false);
    this.setContentPane(new Panneau());
  }
  
}