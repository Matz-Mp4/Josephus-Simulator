package Gui.Panel;

import javax.swing.JPanel;
import Gui.GuiUtils;
import java.awt.*;
import javax.swing.*;

/**
 * Class that holds the simulator menu. It extends JPanel and creates buttons and jsliders 
 * @author Mateus Assalti Santana
 */
public class PanelMenu extends JPanel{

  //Buttons
  private JButton jbtnStart;
  private JButton jbtnStop;

  //JSliders
  private JSlider jsliderCircles;
  private JSlider jsliderSteps;
  private JSlider jsliderDelay;

  //RoundedPanel
  private RoundedPanel rpnlMenu;

  //StatesButton
  private  StatesButton sbValidator = new StatesButton();

  public PanelMenu(){
    initialize();
    setMinimumSize(getSize());
  }

  /**
   * Inicialize and configures the layout, color and StatesButton
   */
  private void initialize(){
    setLayout(new FlowLayout());
    setBackground(GuiUtils.BACKGROUND);
    setForeground(GuiUtils.BACKGROUND);
    add(getRoundedPanelMenu());
    sbValidator = new StatesButton();
  }

/**
 * Add butons and sliders
 * @return RoundedPael
 */
  private RoundedPanel getRoundedPanelMenu(){
    if(rpnlMenu == null){
     rpnlMenu = new RoundedPanel(40, GuiUtils.FOREGROUND);
     rpnlMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
     rpnlMenu.setBackground(GuiUtils.BACKGROUND);
     rpnlMenu.setPreferredSize(new Dimension(800, 75));
     rpnlMenu.setLayout(new FlowLayout());

      jbtnStart = new JButton("Start");
      GuiUtils.setButton(jbtnStart);
      jbtnStop = new JButton("Stop");
      GuiUtils.setButton(jbtnStop);
      jsliderCircles = new JSlider(JSlider.HORIZONTAL, 2, 30, 5);
      GuiUtils.setSliderHorizontal(jsliderCircles, "Amount Circles");
      jsliderSteps = new JSlider(JSlider.HORIZONTAL, 1, 50, 3);
      GuiUtils.setSliderHorizontal(jsliderSteps, " Steps ");
      jsliderDelay = new JSlider(JSlider.HORIZONTAL, 1, 11, 3);

      GuiUtils.setSliderHorizontal(jsliderDelay, " Delay ");

      rpnlMenu.add(jbtnStart);
      rpnlMenu.add(jbtnStop);
      rpnlMenu.add(jsliderCircles);
      rpnlMenu.add(jsliderSteps);
      rpnlMenu.add(jsliderDelay);
      
      
    }
    return rpnlMenu;
  }

  
  public Dimension getMinimumSize(){
    return super.getMinimumSize();
  }

/**
 * Get the slider that holds amount of circles
 * @return JSlider
 */
  public JSlider getSliderAmount(){
    return jsliderCircles;
  }

  /**
 * Get the slider that holds amount of steps
 * @return JSlider
 */
  public JSlider getSliderStep(){
    return jsliderSteps;
  }

/**
 * Get the button which the simulation will be started
 * @return JButton
 */
  public JButton getBtnStart(){
    return jbtnStart;
  }

/**
 * Get the button which the simulation will be stopped
 * @return JButtton
 */
  public JButton getBtnStop(){
    return jbtnStop;
  }

/**
 * Get the StatesButton
 * @return StatesButton
 */
  public StatesButton getStatesButton(){
    return sbValidator;
  }

  /**
  * Get the slider that holds delay 
  * @return JSlider
  */
  public JSlider getSliderDelay(){
    return jsliderDelay;
  }
}
 