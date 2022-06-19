package Controller;

import Model.*;
import Gui.*;
import java.awt.*;

public class JosephusSimulation{

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
            }while((n != 1) && (this.stop != true));
        }
    }

    public void stopSimulation(){
        this.stop = true;
    }
   
}