package Gui;

import javax.swing.*;
import java.awt.*;

public class PanelCircle extends JPanel{

  public PanelCircle(){
    //setPreferredSize(new Dimension(400,400));
    setLayout(null);
    initialize();
  }

  private void initialize(){
    setBackground(GuiUtils.BACKGROUND);
    setForeground(GuiUtils.FOREGROUND);
    GuiUtils.createGap(this, 20, 10);
  }
  public RoundedPanel addCircle(){
    RoundedPanel circle = GuiUtils.createCircle(50, 50);
    return circle;
  }
    
  public void setCirclePlaces(){
    int centerX = 400/2;
    int centerY = 400/2;
    int range = centerX;
    double angule;



    for(int i = 0; i <= 360; i+= 10){
        RoundedPanel aux = addCircle();
        angule = (Math.PI/180) * i;
        double cos = Math.cos(angule);
        double sen = Math.sin(angule);
        aux.setBounds((int)(cos * range)+centerX, (int)(sen * range)+centerY, 30, 30);
        add(aux);
    }

  }
}
