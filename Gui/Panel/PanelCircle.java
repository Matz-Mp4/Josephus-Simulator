package Gui.Panel;

import javax.swing.*;
import Gui.GuiUtils;
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

  public void removeCircle(RoundedPanel pnlCircle){
    if(pnlCircle != null){
      remove(pnlCircle);
    }
  }

  public void changeColorCircle(RoundedPanel pnlCircle, Color newColor){
    if(pnlCircle != null){
      pnlCircle.changeColor(newColor);
    }
  }


     /**
   * Function that places the circles/people on the main panel. Automatically adjusts to screen size
   * It works based on the use of sine and cosine
   */
  public  void setCirclePlaces(int amount){
    int centerX = (int) (getMinimumSize().width/2)-20; //add 20 to center the 'centerX'
    int centerY = (int) (getMinimumSize().height/2)-35; //add 35 gap between components
    int range = centerY;
    double angule;
    int anguleAux = 360/amount;
    int j = 0;

    for(int i = 1; i <= amount; i++){
      //Calculate the next angule 
      j = anguleAux + j;
      
      RoundedPanel aux = addCircle();
      //Convert the angule in radian
      angule = (Math.PI/180) * j;
      //Calculate the coordinates
      double boundX = Math.cos(angule) * range + centerX;
      double boundY = Math.sin(angule) * range + centerY;
      //Set the position and the 
      aux.setBounds((int)boundX, (int)boundY, 33, 33); //height and width configure the panel shape
      add(aux);
    }
  }


}
