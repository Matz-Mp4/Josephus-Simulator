package Gui;

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;

public class PanelMenu extends JPanel{

  private JButton jbtnStart;
  private JButton jbtnStop;
  private JSlider jslider;

  public PanelMenu(){
    initialize();
    setMinimumSize(getSize());
  }

  private void initialize(){

    GuiUtils.setPanelBorder(this, "Menu");
    
    setLayout(new FlowLayout());
    setBackground(GuiUtils.BACKGROUND);
    setForeground(GuiUtils.BACKGROUND);

    jbtnStart = new JButton("Start");
    GuiUtils.setButton(jbtnStart);
    jbtnStop = new JButton("Stop");
    GuiUtils.setButton(jbtnStop);
    jslider = new JSlider(JSlider.HORIZONTAL, 0, 30, 1);
    GuiUtils.setSliderHorizontal(jslider, "Sem Pressao Aqui é xandao");
    add(jbtnStart);
    GuiUtils.createGap(this, 10, 10);
    add(jbtnStop);
    GuiUtils.createGap(this, 10, 10);
    add(jslider);


  }

  public Dimension getMinimumSize(){
    return super.getMinimumSize();
  }
}
 