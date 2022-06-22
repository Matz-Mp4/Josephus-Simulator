package Application.Events;
import java.awt.Component;
import java.awt.event.*;

import Gui.Panel.PanelMenu;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import Application.JosephusSimulation;
import Data.ILinkedList;
import Gui.Panel.*;
import Data.Person;

public class MenuEvent{

  //private static StatesButton sbValidator = new StatesButton();
  private JosephusSimulation jsAux = new JosephusSimulation();
  
  public void setEvent(PanelMenu pnlMenu, PanelCircle pnlCircle, ILinkedList list){
    pnlMenu.getBtnStart().addActionListener(new ActionListener(){    
      public void actionPerformed(ActionEvent e){
          if(!jsAux.getSimulating()){
          //Adding circles to linked list
          Component[] components = pnlCircle.getComponents();
          list.limparLista();
          for(Component comp: components){
            if(comp.getClass() == RoundedPanel.class) list.inserirFim(new Person((Object) comp));
          }
          
          //Creating a new reference/thread of simulator
          jsAux = new JosephusSimulation(list, pnlMenu.getSliderStep().getValue(), pnlMenu.getSliderAmount().getValue());        
          pnlMenu.getStatesButton().setPlayingStatus(true);
          jsAux.start();
        }
      }
    });

    pnlMenu.getBtnStop().addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          if(jsAux.getSimulating()){
              jsAux.stopSimulation();
          }
        }
    });

    pnlMenu.getSliderAmount().addChangeListener(new ChangeListener() {

        public void stateChanged(ChangeEvent e){
          int amountCircles;
          amountCircles = pnlMenu.getSliderAmount().getValue(); 
        
          if (pnlMenu.getSliderAmount().getValueIsAdjusting()) {
            pnlCircle.removeAll();
            pnlCircle.setCirclePlaces(amountCircles);
            pnlCircle.revalidate();
            pnlCircle.repaint();
          }
        }
    });

    pnlMenu.getSliderStep().addChangeListener(new ChangeListener(){
      public void stateChanged(ChangeEvent e){

      }
    });
  }
} 