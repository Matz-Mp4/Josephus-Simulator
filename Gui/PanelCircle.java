package Gui;

import javax.swing.*;

import Model.ILinkedList;

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

}
