package lavajato;
public class Pretim implements Desconto{
    
    //Somente pretim.
    //Sem desconto.
    
    public double calcula (Orcamento orcamento){
        return orcamento.getValor() * 0;
    }
    
}
