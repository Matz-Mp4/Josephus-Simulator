package Application;

import Gui.*;
import Gui.Panel.RoundedPanel;
import java.awt.*;
import Data.*;

/**
 * Class that works with Josephus Algorithm and its variables states within them whole application.
 * Inherit Thread
 */
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
                    //Change the color to represented that person is dead 
                    rpnl.changeColor(Color.red);
                    rpnl.repaint();
                    try { Thread.sleep(delay);} catch (InterruptedException ex) {}
                    cont = 1;
                    aux = aux.getProximo();
                    
                    storer.remover(dead.getId());
                }
                n = storer.getQtdNos();
                //Stop the simulation until remains only a person or someone click the stop button
            }while((n != 1) && (stop == false));
            simulating = false;
        }
    }

    /**
     * Stops the simulation with a flag included in the josephus algorithm, and stop the thread
     */
    public void stopSimulation(){
        this.simulating = false;
        this.stop = true;
        this.interrupt();
    }

    /**
     * Return the status of simulation. Ie, if it's simulating or not
     * @return boolean
     */
    public boolean getSimulating(){
        return this.simulating;
    }

    /**
     * <ethod inherited from thread. It is necessary to create a new thread, when the start method is called
     */
    public void run(){
        startSimulation();
    }
     /**
     * Set the signal to stop simulation
     * @param setp
     */    
    public  void setStep(int step){
        this.step = step;
    }

    /**
     * Sets the linked list that the simulator will work with it
     * @param list ILinkedList which the objects 'Person' will be alocated
     */
    public void setLinkedList(ILinkedList list){
        this.storer = list;
    }

    /**
     * Set the amount of circles
     * @param amount
     */    
    public void setAmount(int amounT){
        amount = amounT;
        
    }

    /**
     * Set the delay between circles
     * @param delay
     */
    public void setDelay(int delay){
        this.delay = delay;
    }
 
   
}