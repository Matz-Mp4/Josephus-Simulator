package Gui;

import javax.swing.JFrame;
import Gui.Panel.*;
import java.awt.*;

/**
 * Main GUI class, to which all other components will be added
 * @author: Luis Felipe A. B. Matos
 * @author: Mateus Assalti Santana
 * @version: 1.0
 */
public class Window extends JFrame{
  
  private PanelTitle pnlTitle;
  private PanelMenu pnlMenu;
  private PanelCircle pnlCircle;

  public Window(){
    initialize();
  }

  /** Configure the main window elements
   * @return void
   */
  private void initialize(){

    setMinimumSize(new Dimension(1400, 1000));
    setLayout(new BorderLayout());
    
    add(getPnlTitle(), BorderLayout.PAGE_START);   
    add(getPnlMenu(), BorderLayout.PAGE_END);
    setVisible(true);
    add(getPnlCircle(), BorderLayout.CENTER);
    setVisible(true);
    setResizable(false);
    getContentPane().setBackground(GuiUtils.BACKGROUND);
    getContentPane().setForeground(GuiUtils.FOREGROUND);
    setDefaultCloseOperation(EXIT_ON_CLOSE);

  }

/**
 * Returns the panel that contains the title
 * @return PanelTitle
 */
  private PanelTitle getPnlTitle(){

    if(pnlTitle == null){
      pnlTitle = new PanelTitle();
    }
    return pnlTitle;
  }

  /**
   * Returns the panel that contains the menu with options
   * @return PanelMenu
   */
  public PanelMenu getPnlMenu(){
    if(pnlMenu == null){
      pnlMenu = new PanelMenu();
    }

    return pnlMenu;
  }

/**
 * Returns the panel that contains the circles 
 * @return PanelCircle
 */
  public PanelCircle getPnlCircle(){
    if(pnlCircle == null){
      pnlCircle = new PanelCircle(getSizeComponents());
    }
    return pnlCircle;
  }

  /**
   * Calculates the PanelCircle's Dimension
   * @return Dimension
   */
  private Dimension getSizeComponents(){
    Dimension aux = null;
    Dimension pnlTitleDimension = pnlTitle.getSize();
    Dimension pnlMenuDimension = pnlMenu.getSize();
    Dimension pnlFrame = this.getMinimumSize();
    double height =  pnlFrame.getHeight() - (pnlTitleDimension.getHeight() + pnlMenuDimension.getHeight());
    aux = new Dimension((int) pnlFrame.getWidth(), (int) height);
    return aux;
  }
}
