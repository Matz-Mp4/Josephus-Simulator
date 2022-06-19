package Controller;

import Gui.*;
import javax.swing.*;
import Model.ILinkedList;
import java.awt.*;
import Model.*;

public class ViewController{

     /**
   * Function that places the circles/people on the main panel. Automatically adjusts to screen size
   * It works based on the use of sine and cosine
   */
  public static void setCirclePlaces(PanelCircle pcCircle, ILinkedList list){
    int centerX = (int) (pcCircle.getMinimumSize().width/2)-20; //add 20 to center the 'centerX'
    int centerY = (int) (pcCircle.getMinimumSize().height/2)-35; //add 35 gap between components
    int range = centerY;
    double angule;

    for(int i = 0; i <= 360; i+= 15){
      RoundedPanel aux = pcCircle.addCircle();
      angule = (Math.PI/180) * i;
      double boundX = Math.cos(angule) * range + centerX;
      double boundY = Math.sin(angule) * range + centerY;
      aux.setBounds((int)boundX, (int)boundY, 30, 30); //height and width configure the panel shape
      pcCircle.add(aux);
      list.inserirInicio(new Person(aux));
    }
  }

  public static void reajustCirclePlaces(PanelCircle pcCircle, ILinkedList list){
    int centerX = (int) (pcCircle.getMinimumSize().width/2)-20; //add 20 to center the 'centerX'
    int centerY = (int) (pcCircle.getMinimumSize().height/2)-35; //add 35 gap between components
    int range = centerY;
    int radian = 0;
    No circle = list.getInicio();

    while(circle != null){
      double angule = (Math.PI/180) * radian;
      double boundX = Math.cos(angule) * range + centerX;
      double boundY = Math.sin(angule) * range + centerY;
      Person objAux = (Person) circle.getConteudo(); RoundedPanel rpCircle = (RoundedPanel) objAux.getObject();
      rpCircle.setBounds((int)boundX, (int)boundY, 30, 30); //height and width configure the panel shape
      pcCircle.add(rpCircle);
      list.inserirInicio(new Person(rpCircle));
      circle.getProximo();
      radian += 15;
      pcCircle.repaint();
    }
  }
}  

