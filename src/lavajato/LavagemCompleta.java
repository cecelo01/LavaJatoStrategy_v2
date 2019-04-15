package lavajato;
public class LavagemCompleta implements Desconto {
    
    //Ducha, aspirar e pretim.
    //Desconto 10%
    
    private double valor;
    
    public double calcula (Orcamento orcamento){
        return orcamento.getValor() * 0.10;
    }
    
}
