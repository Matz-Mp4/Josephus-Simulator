package Gui.Events;
import java.awt.event.*;

import Gui.PanelMenu;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MenuEvent{

  private PanelMenu pnlMenu;
  private StatesButton btnState = new StatesButton();

  public MenuEvent(PanelMenu pnlMenu){
    this.pnlMenu = pnlMenu;
    setEvent();
  }

  private void setEvent(){
      pnlMenu.getBtnStart().addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            btnState.setPlayingStatus(true);
        }
    });

    pnlMenu.getBtnStop().addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            btnState.setPlayingStatus(false);
        }
    });

    pnlMenu.getSlider().addChangeListener(new ChangeListener() {
        public void stateChanged(ChangeEvent e){
          btnState.setAmountCircles(pnlMenu.getSlider().getValue());
        }
    });
  }

  public StatesButton getStatesButton(){
    return btnState;
  }

}