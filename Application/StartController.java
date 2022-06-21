package Application;

import Data.*;

public class StartController {

    private ILinkedList list;
    private Window mainWindow;
    private JosephusSimulation jsGame;

    public StartController(){
        inicialize();
    }

    public void inicialize(){
        list = new LinkedList();
        mainWindow = new Window();
        mainWindow.getPnlCircle().setCirclePlaces(7);
        mainWindow.getPnlCircle().repaint();
        jsGame = new JosephusSimulation(list, 3, 7);
        mainWindow.setSimulation(jsGame);
        mainWindow.setLinkedList(list);
    }
}
