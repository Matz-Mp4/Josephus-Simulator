package Gui;

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;

public class PanelMenu extends JPanel{

  private JButton jbtnStart ;

  public PanelMenu(){
    initialize();

  }

  private void initialize(){
    setLayout(new FlowLayout());
    jbtnStart = new JButton("Start");
    jbtnStart.setBackground(Color.red);
    jbtnStart.setForeground(Color.white);

    setBackground(GuiUtils.BACKGROUND);
    setForeground(GuiUtils.FOREGROUND);
    add(jbtnStart);
    new Circle(this);
  }
}
 