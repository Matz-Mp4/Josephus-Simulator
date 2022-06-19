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

    JosephusSimulation(ILinkedList storer, int step, int amount){
        this.storer = storer;
        this.step = step;
        this.amount = amount;
        startSimulation();
    }

    /** Simulates Josephus' algorithm
     */
    public void startSimulation(){
        int n = storer.getQtdNos();

        if(n > 1){
            No aux = storer.getInicio();
            int cont = 1;
            No dead = null;

            do{
                No current = aux;
                if(aux != null){
                aux = aux.getProximo();
                cont += 1;

                if(cont == step){
                    dead = aux;
                    Person auxDead = (Person) dead.getConteudo();
                    RoundedPanel rpnl  = (RoundedPanel) auxDead.getObject();
                    rpnl.changeColor(Color.red);
                    aux = aux.getProximo();
                    cont = 1;
                    storer.remover(dead.getId());
                }
            } else this.stop = true;
            }while((n != 1) && (this.stop != true));
        }
    }

    public void stopSimulation(){
        this.stop = true;
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
   
}