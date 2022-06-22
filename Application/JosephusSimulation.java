package Application;

import Gui.*;
import Gui.Panel.RoundedPanel;

import java.awt.*;

import Data.*;

public class JosephusSimulation extends Thread{

    private ILinkedList storer;
    private int step;
    private int amount;
    private boolean stop = false;
    private boolean simulating = false;
    private int delay;

    public JosephusSimulation(ILinkedList storer, int step, int amount){
        this.storer = storer;
        this.step = step;
        this.amount = amount;
    }

    public JosephusSimulation(){

    }

    /** Simulates Josephus' algorithm
     */
    public void startSimulation(){
        int n = storer.getQtdNos();

        if(n > 1){
            No aux = storer.getInicio();
            int cont = 1;
            No dead = null;
            simulating = true;

            do{
                aux = aux.getProximo();
                cont ++;
                if(cont == step){
                    dead = aux;
                    Person auxDead = (Person) dead.getConteudo();
                    RoundedPanel rpnl  = (RoundedPanel) auxDead.getObject();
                    rpnl.changeColor(Color.red);
                    rpnl.repaint();
                    try { Thread.sleep(delay);} catch (InterruptedException ex) {}
                    cont = 1;
                    aux = aux.getProximo();
                    storer.remover(dead.getId());
                }
                n = storer.getQtdNos();
            }while((n != 1) && (stop == false));
            simulating = false;
        }
    }

    public void stopSimulation(){
        this.simulating = false;
        this.stop = true;
        this.interrupt();
    }

    public boolean getSimulating(){
        return this.simulating;
    }

    public void run(){
        startSimulation();
    }

    public  void setStep(int step){
        this.step = step;
    }

    public void setLinkedList(ILinkedList list){
        this.storer = list;
    }
    
    public void setAmount(int amounT){
        amount = amounT;
        
    }

    public void setDelay(int delay){
        this.delay = delay;
        
    }
 
   
}