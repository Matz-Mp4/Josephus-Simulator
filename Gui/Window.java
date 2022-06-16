package Gui;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import Gui.GuiUtils;

public class Window extends JFrame{
  
  private PanelTitle pnlTitle;
  private PanelMenu pnlMenu;

  public Window(){
    initialize();
    
  }
  /** Configure the main window elements
   */
  private void initialize(){
    setLayout(new BorderLayout());
    add(getPnlTitle(), BorderLayout.PAGE_START);
    add(getPnlMenu(), BorderLayout.CENTER);
    setVisible(true);
    setResizable(false);
    getContentPane().setBackground(GuiUtils.BACKGROUND);
    getContentPane().setForeground(GuiUtils.FOREGROUND);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(500, 600);

  }

  private PanelTitle getPnlTitle(){

    if(pnlTitle == null){
      pnlTitle = new PanelTitle();
    }
    return pnlTitle;
  }

  private PanelMenu getPnlMenu(){
    if(pnlMenu == null){
      pnlMenu = new PanelMenu();
    }

    return pnlMenu;
  }
}
