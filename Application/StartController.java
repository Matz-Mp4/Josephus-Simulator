package Application;

import Application.Events.MenuEvent;
import Data.*;

public class StartController {

    private Window mainWindow;
    private MenuEvent meEvents;
    private ILinkedList list;

    public StartController(){
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
