package Application.Events;
import java.awt.Component;
import java.awt.event.*;

import Gui.Panel.PanelMenu;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import Application.JosephusSimulation;
import Data.ILinkedList;
import Data.LinkedList;
import Gui.Panel.*;
import Data.Person;

public class MenuEvent{

  //private static StatesButton sbValidator = new StatesButton();
  
  public static void setEvent(PanelMenu pnlMenu, PanelCircle pnlCircle, JosephusSimulation simulation, ILinkedList list){
    pnlMenu.getBtnStart().addActionListener(new ActionListener(){    
      public void actionPerformed(ActionEvent e){
        
        if(pnlMenu.getStatesButton().getPlayingStatus() == false){
          Component[] components = pnlCircle.getComponents();
          list.limparLista();
          for(Component comp: components){
            if(comp.getClass() == RoundedPanel.class) list.inserirFim(new Person((Object) comp));
          }

          JosephusSimulation simular = new JosephusSimulation(list, pnlMenu.getSliderStep().getValue(), pnlMenu.getSliderAmount().getValue());
          
          pnlMenu.getStatesButton().setPlayingStatus(true);
          simular.start();

        }
        pnlMenu.getStatesButton().setPlayingStatus(false);
      }
    });

    pnlMenu.getBtnStop().addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          pnlMenu.getStatesButton().setPlayingStatus(false);

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