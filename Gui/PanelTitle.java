package Gui;

import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;

public class PanelTitle extends JPanel{

  private JLabel jlbTitle;
  private RoundedPanel pnlTitle;

  public PanelTitle(){
    initialize();
    setMinimumSize(getSize());
  }
  private void initialize(){
    add(getPnlTitle());
    setBackground(GuiUtils.BACKGROUND);
    setForeground(GuiUtils.BACKGROUND);
  }

  private RoundedPanel getPnlTitle(){
    if(pnlTitle == null){
      pnlTitle = new RoundedPanel(30, GuiUtils.FOREGROUND);
      pnlTitle.setBackground(GuiUtils.BACKGROUND);
      pnlTitle.setPreferredSize(new Dimension(200, 30));
      
      jlbTitle = new JLabel("Josephus' Game");
      jlbTitle.setBackground(GuiUtils.FOREGROUND);
      jlbTitle.setForeground(GuiUtils.BACKGROUND);
      jlbTitle.setFont(new Font(GuiUtils.FONT, Font.BOLD, 18)); 
      jlbTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
      
      pnlTitle.add(jlbTitle);
    }
    return pnlTitle;
  }

  public Dimension getMinimumSize(){
    return super.getMinimumSize();
  }
}
