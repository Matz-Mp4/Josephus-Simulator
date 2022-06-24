package Gui;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.*;

import Gui.Panel.RoundedPanel;

import javax.swing.*;

/** Variables and functions which will be used without the need of creating a new object
 * Most of them are related to colors, buttons and object's format
 * @author: Mateus Assalti Santana
 */
public class GuiUtils {

  //Colors
  public static final Color BACKGROUND = new Color(1,1,80);
  public static final Color BACKGROUND_CIRCLE = new Color(255,236,61);
  public static final Color FOREGROUND = new Color(250,214,52);
  public static final Color FOREGROUND_MENU = new Color(52,63,250);
  public static final Color COLOR_BUTTON = new Color(207, 0, 15);

  //Fonts
  public static final String FONT = "Arial"; 

  //Dimensions
  public static final Dimension DIMENSION_TITLE = new Dimension(300,200);

  /**
   * Change the shape of the button to rounded
   * @param JButton
   * @return void
   */
  private static void setShapeButton(JButton jbtn){
    Border compound;
    Border raisedbevel = BorderFactory.createRaisedBevelBorder();
    Border loweredbevel = BorderFactory.createLoweredBevelBorder();
    compound = BorderFactory.createCompoundBorder(
                          raisedbevel, loweredbevel);
                          
    jbtn.setBorder(compound);
  }

  /**
   * Sets font and color of button 
   * @param JButton
   * @return void
   */
  public static void setButton(JButton jbtn){
    setShapeButton(jbtn);
    jbtn.setFont(new Font("Arial", Font.BOLD, 17));
    jbtn.setBackground(COLOR_BUTTON);
    jbtn.setForeground(Color.white);
  }

  /**
   * Creates a gap/space between components of a JPanel. It needs to be add manually in the place which the gap will be located
   * @param int height of gap
   * @param int width of gap
   * @param JPanel
   * @return void
   */
  public static void createGap(JPanel painel, int height, int width) {
      painel.add(Box.createRigidArea(new Dimension(height, width)));
  }

  /**
   * Configures format, color and justification of a title
   * @param jpnl JPanel
   * @param name String
   */
  public static void setPanelBorder(JPanel jpnl, String name) {

    Border linhaCor = BorderFactory.createLineBorder(FOREGROUND);
    TitledBorder titulo = new TitledBorder(linhaCor, name);
    titulo.setTitleFont(new Font(FONT, Font.BOLD | Font.ITALIC, 15));
    titulo.setTitleColor(FOREGROUND);
    titulo.setTitleJustification(TitledBorder.CENTER);
    jpnl.setBorder(titulo);

  }

  /**
   * Sets the color, numbers/tracks, titles and border of a JSlider
   * @param jslider JSlider
   * @param name String
   */
  public static void setSliderHorizontal(JSlider jslider, String name){
    jslider.setMajorTickSpacing(10);
    jslider.setMinorTickSpacing(1);
    jslider.setBackground(FOREGROUND);
    jslider.setForeground(BACKGROUND);
    jslider.setPaintTicks(true);
    jslider.setPaintLabels(true);
    Border Colorline = BorderFactory.createLineBorder(BACKGROUND);
    TitledBorder title = new TitledBorder(Colorline, name); 
    title.setTitleColor(BACKGROUND);
    title.setTitleFont(new Font(FONT, Font.BOLD | Font.ITALIC, 12));
    jslider.setBorder(title);
  }

/**
 * Creates a RoundedPanel with Dimension 'height' and 'width', with color that matches the background
 * @param height
 * @param width
 * @return RoundedPanel
 */
 public static RoundedPanel createCircle(int height, int width){
    Dimension d = new Dimension(height, width);
    RoundedPanel aux = new RoundedPanel(200, GuiUtils.BACKGROUND_CIRCLE);
    aux.setPreferredSize(d);
    aux.setBackground(GuiUtils.BACKGROUND);
    return aux;
  }

  
}
