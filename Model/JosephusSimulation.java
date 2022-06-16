package Model;

public class JosephusSimulation{

    private IListaLigada storer;
    private int step;
    private int amount;

    JosephusSimulation(IListaLigada storer, int step, int amount){
        this.storer = storer;
        this.step = step;
        this.amount = amount;
        createPeople();
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
                    auxDead.setAlive(false);
                    aux = aux.getProximo();
                    cont = 1;
                    storer.remover(dead.getId());
                }
            }while(n != 1);
        }
    }
    
    /** Create people given the amount passed by the constructor
     */
    private void createPeople(){
        if(storer != null){
            for(int i = 1; i <= amount; i++){
                storer.inserirInicio(new Person());
            }
        }
    }

}