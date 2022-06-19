package Gui;
import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.*;
import javax.swing.*;


public class GuiUtils {

  public static final Color BACKGROUND = new Color(1,1,80);
  public static final Color BACKGROUND_CIRCLE = new Color(255,236,61);
  public static final Color FOREGROUND = new Color(250,214,52);
  public static final Color COLOR_BUTTON = new Color(52,53,250);
  public static final String FONT = "Arial"; 
  public static final Dimension DIMENSION_TITLE = new Dimension(300,200);

  private  static void setShapeButton(JButton jbtn){
    Border compound;
    Border raisedbevel = BorderFactory.createRaisedBevelBorder();
    Border loweredbevel = BorderFactory.createLoweredBevelBorder();
    compound = BorderFactory.createCompoundBorder(
                          raisedbevel, loweredbevel);
                          
    jbtn.setBorder(compound);
  }

  public static void setButton(JButton jbtn){
    setShapeButton(jbtn);
    jbtn.setFont(new Font("Arial", Font.BOLD, 17));
    jbtn.setBackground(COLOR_BUTTON);
    jbtn.setForeground(Color.white);
  }
    public static void createGap(JPanel painel, int height, int width) {

    painel.add(Box.createRigidArea(new Dimension(height, width)));
  }


  public static void setPanelBorder(JPanel jpnl, String name) {

    Border linhaCor = BorderFactory.createLineBorder(FOREGROUND);
    TitledBorder titulo = new TitledBorder(linhaCor, name);
    titulo.setTitleFont(new Font(FONT, Font.BOLD | Font.ITALIC, 15));
    titulo.setTitleColor(FOREGROUND);
    titulo.setTitleJustification(TitledBorder.CENTER);
    jpnl.setBorder(titulo);

  }

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


 public static RoundedPanel createCircle(int height, int width){
    Dimension d = new Dimension(height, width);
    RoundedPanel aux = new RoundedPanel(200, GuiUtils.BACKGROUND_CIRCLE);
    aux.setPreferredSize(d);
    aux.setBackground(GuiUtils.BACKGROUND);
    return aux;
  }

  
}
