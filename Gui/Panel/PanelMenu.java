package Gui.Panel;

import javax.swing.JPanel;

import Gui.GuiUtils;

import java.awt.*;
import javax.swing.*;

public class PanelMenu extends JPanel{

  private JButton jbtnStart;
  private JButton jbtnStop;
  private JSlider jsliderCircles;
  private JSlider jsliderSteps;
  private JSlider jsliderDelay;
  private RoundedPanel rpnlMenu;
  private  StatesButton sbValidator = new StatesButton();

  public PanelMenu(){
    initialize();
    setMinimumSize(getSize());
  }

  private void initialize(){

   // GuiUtils.setPanelBorder(this, "Menu");
    
    setLayout(new FlowLayout());
    setBackground(GuiUtils.BACKGROUND);
    setForeground(GuiUtils.BACKGROUND);
    add(getRoundedPanelMenu());
    sbValidator = new StatesButton();

  }


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

  public JSlider getSliderAmount(){
    return jsliderCircles;
  }

  public JSlider getSliderStep(){
    return jsliderSteps;
  }

  public JButton getBtnStart(){
    return jbtnStart;
  }

  public JButton getBtnStop(){
    return jbtnStop;
  }

  public StatesButton getStatesButton(){
    return sbValidator;
  }

  public JSlider getSliderDelay(){
    return jsliderDelay;
  }
}
 