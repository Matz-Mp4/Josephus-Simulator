package Controller;
import Model.*;
import Gui.Window;

public class StartController {
    public StartController(){
        inicialize();
    }

    public void inicialize(){
        ILinkedList list = new LinkedList();
        Window mainWindow = new Window();
        ViewController.setCirclePlaces(mainWindow.getPnlCircle(), list);
        JosephusSimulation jsGame = new JosephusSimulation(list, mainWindow.get, amount)
    }
}
