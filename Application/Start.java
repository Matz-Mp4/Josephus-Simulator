package Application;

import Application.Events.MenuEvent;
import Data.*;
import Gui.Window;

public class Start {

    private Window mainWindow;
    private MenuEvent meEvents;
    private ILinkedList list;

    public Start(){
        inicialize();
    }

    public void inicialize(){
        mainWindow = new Window();
        mainWindow.getPnlCircle().setCirclePlaces(7);
        mainWindow.getPnlCircle().repaint();
        meEvents = new MenuEvent();
        list = new LinkedList();
        meEvents.setEvent(mainWindow.getPnlMenu(), mainWindow.getPnlCircle(), list);
    }
}
