package Gui;

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;

public class PanelMenu extends JPanel{

  private JButton jbtnStart;
  private JButton jbtnStop;

  public PanelMenu(){
    initialize();

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
 
    add(jbtnStart);
    GuiUtils.createGap(this, 10, 10);
    add(jbtnStop);

  }
}
 