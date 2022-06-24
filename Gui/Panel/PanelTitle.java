package Gui.Panel;

import javax.swing.JPanel;
import Gui.GuiUtils;
import java.awt.*;
import javax.swing.*;

/**
 * Class that inherits JPanel and where the title will be placed
 * @author Mateus Assalti Santana
 */
public class PanelTitle extends JPanel{

  private JLabel jlbTitle;
  private RoundedPanel pnlTitle;


  public PanelTitle(){
    initialize();
    setMinimumSize(getSize());
  }

  /**
    * initialize the panel
    * @param void
    * @return void
   */
  private void initialize(){
    add(getPnlTitle());
    setBackground(GuiUtils.BACKGROUND);
    setForeground(GuiUtils.BACKGROUND);
  }

  /**
    * Create a panel and his components for the title of the window 
    * @param void
    * @return RoundedPanel
   */
  private RoundedPanel getPnlTitle(){
    if(pnlTitle == null){
      //Create a rounded panel with 30 of "curvature" in the borders
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
