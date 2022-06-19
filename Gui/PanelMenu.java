package Gui;

import javax.swing.JPanel;

import Gui.Events.MenuEvent;

import java.awt.*;
import javax.swing.*;

public class PanelMenu extends JPanel{

  private JButton jbtnStart;
  private JButton jbtnStop;
  private JSlider jslider;
  private RoundedPanel rpnlMenu;

  public PanelMenu(){
    initialize();
    setMinimumSize(getSize());
    new MenuEvent(this);
  }

  private void initialize(){

   // GuiUtils.setPanelBorder(this, "Menu");
    
    setLayout(new FlowLayout());
    setBackground(GuiUtils.BACKGROUND);
    setForeground(GuiUtils.BACKGROUND);
    add(getRoundedPanelMenu());

  }


  private RoundedPanel getRoundedPanelMenu(){
    if(rpnlMenu == null){
     rpnlMenu = new RoundedPanel(40, GuiUtils.FOREGROUND);
     rpnlMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
     rpnlMenu.setBackground(GuiUtils.BACKGROUND);
     rpnlMenu.setPreferredSize(new Dimension(800, 80));
     rpnlMenu.setLayout(new FlowLayout());

      jbtnStart = new JButton("Start");
      GuiUtils.setButton(jbtnStart);
      jbtnStop = new JButton("Stop");
      GuiUtils.setButton(jbtnStop);
      jslider = new JSlider(JSlider.HORIZONTAL, 0, 30, 5);
      GuiUtils.setSliderHorizontal(jslider, "Sem Pressao Aqui é xandao");

      rpnlMenu.add(jbtnStart);
      GuiUtils.createGap(this, 30, 10);
      rpnlMenu.add(jbtnStop);
      GuiUtils.createGap(this, 30, 10);
      rpnlMenu.add(jslider);
      
    }
    return rpnlMenu;
  }

  public Dimension getMinimumSize(){
    return super.getMinimumSize();
  }

  public JSlider getSlider(){
    return jslider;
  }

  public JButton getBtnStart(){
    return jbtnStart;
  }

  public JButton getBtnStop(){
    return jbtnStop;
  }
}
 