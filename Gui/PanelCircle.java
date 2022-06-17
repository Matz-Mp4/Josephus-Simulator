package Gui;

import javax.swing.*;
import java.awt.*;

/**
 * Class that inherits JPanel and where the circles will be placed
 */
public class PanelCircle extends JPanel{

  public PanelCircle(Dimension component){
    setMinimumSize(component); //We need to set the size of its component to be able to calculate where the circle should be allocated
    setLayout(null); //Layout needs to be null to use absolute positions
    initialize(); 
  }

  /**
   * Start and configures the panel where the circles will be placed
   */
  private void initialize(){
    setBackground(GuiUtils.BACKGROUND);
    setForeground(GuiUtils.FOREGROUND);
    GuiUtils.createGap(this, 20, 10);
  }

/**
 * Creates a Circle of RoundedPanel type
 * @return RoundedPanel
 */
  public RoundedPanel addCircle(){
    RoundedPanel circle = GuiUtils.createCircle(50, 50);
    return circle;
  }

  /**
   * Function that places the circles/people on the main panel. Automatically adjusts to screen size
   * It works based on the use of sine and cosine
   */
  public void setCirclePlaces(){
    int centerX = (int) (getMinimumSize().width/2)-20; //add 20 to center the 'centerX'
    int centerY = (int) (getMinimumSize().height/2)-35; //add 35 gap between components
    int range = centerY;
    double angule;

    for(int i = 0; i < 360; i+= 15){
      RoundedPanel aux = addCircle();
      angule = (Math.PI/180) * i;
      double boundX = Math.cos(angule) * range + centerX;
      double boundY = Math.sin(angule) * range + centerY;
      aux.setBounds((int)boundX, (int)boundY, 30, 30); //height and width configure the panel shape
      add(aux);
  }

  }

}
