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

  private JosephusSimulation jsAux = new JosephusSimulation();
  
  /**
    * Set events of the PanelMenus' components 
    * @param PanelMneu,  
    * @param PanelCircle 
    * @param ILinkedList
    * @return void
   */
  public void setEvent(PanelMenu pnlMenu, PanelCircle pnlCircle, ILinkedList list){

    /**
      * Set event of StartButton: everytime you click it 
      *                           he creates a new Josephus' 
      *                           simulation presseted with 
      *                           the data from the other 
      *                           components
     */
    pnlMenu.getBtnStart().addActionListener(new ActionListener(){    
      public void actionPerformed(ActionEvent e){
          if(!jsAux.getSimulating()){
          //Adding circles to linked list
          Component[] components = pnlCircle.getComponents();
          list.limparLista();
          for(Component comp: components){
            if(comp.getClass() == RoundedPanel.class) list.inserirFim(new Person((Object) comp));
          }
          
          //Disabling the sliders
          pnlMenu.getSliderAmount().setEnabled(false);
          pnlMenu.getSliderStep().setEnabled(false);
          
          //Creating a new reference/thread of simulator
          jsAux = new JosephusSimulation(pnlMenu,list, pnlMenu.getSliderStep().getValue());        
          int delay = 1000/pnlMenu.getSliderDelay().getValue();
          jsAux.setDelay(delay);
          pnlMenu.getStatesButton().setPlayingStatus(true);
          jsAux.start();
        }
      }
    });

     /**
      * Set event of StopButton:  everytime you click it, 
      *                           it sends a signal to stop 
      *                           simulation 
     */
    pnlMenu.getBtnStop().addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
          if(jsAux.getSimulating()){
              jsAux.stopSimulation();
          }
        }
    });
    /**
      * Set event of SliderAmount: everytime you slide it to right or to left, 
      *                            he changes the amount of circles in the window
     */
    pnlMenu.getSliderAmount().addChangeListener(new ChangeListener() {
        public void stateChanged(ChangeEvent e){
          if(jsAux.getSimulating() == false){
            int amountCircles;
            amountCircles = pnlMenu.getSliderAmount().getValue(); 
      
            if (pnlMenu.getSliderAmount().getValueIsAdjusting()) {
              pnlCircle.removeAll();
              pnlCircle.setCirclePlaces(amountCircles);
              pnlCircle.revalidate();
              pnlCircle.repaint();
            }
          }
        }
    });

     /**
      * Set event of SliderAmount: everytime you slide it to right or to left, 
      *                            he changes the amount of steps 
     */
    pnlMenu.getSliderStep().addChangeListener(new ChangeListener(){
      public void stateChanged(ChangeEvent e){

      }
    });

     /**
      * Set event of SliderAmount: everytime you slide it to right or to left, 
      *                            he changes the delay 
     */
     pnlMenu.getSliderDelay().addChangeListener(new ChangeListener(){
      public void stateChanged(ChangeEvent e){
        int delay = 1000/pnlMenu.getSliderDelay().getValue();
        jsAux.setDelay(delay);
      }
    });
  }
} 