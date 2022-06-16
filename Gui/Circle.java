package Gui;
import javax.swing.*;
import java.awt.*;


public class Circle{

    private JPanel pnl;
  public Circle(JPanel pnl){
    this.pnl = pnl;
    paint();
  }

  
  public void paint() {
    Graphics  g = pnl.getGraphics();
    g.drawOval(150, 150, 100, 100);
    //g.setColor(Color.red);
  }


  
} 