package Gui;

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;

public class PanelTitle extends JPanel{

  private JLabel jlbTitle;

  public PanelTitle(){
    initialize();
  }
  private void initialize(){
    
    jlbTitle = new JLabel("Josephus' Game");
    jlbTitle.setBackground(GuiUtils.BACKGROUND);
    jlbTitle.setForeground(GuiUtils.FOREGROUND);
    jlbTitle.setFont(new Font("Arial", Font.BOLD, 18));
    
    jlbTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
    add(jlbTitle);
    setBackground(GuiUtils.BACKGROUND);
    setForeground(GuiUtils.BACKGROUND);
  }
}
