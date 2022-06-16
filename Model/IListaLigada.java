package Model;

public interface IListaLigada{
    public boolean estaVazia(); 
    public void inserirInicio(Object novo);
    public void inserirFim(Object novo);
    public No getInicio();
    public boolean inserirApos(long chave, Object novo);
    public Object removerInicio();
    public Object removerFim();
    public Object remover(long chave);
    public String toStringDoFim();
    public int getQtdNos();
}