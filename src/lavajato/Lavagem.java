package lavajato;
public class Lavagem implements Desconto{
    
    //Lagem e pretim
    //Desconto 5%
    
    private double valor;
    
    public double calcula (Orcamento orcamento){
        return orcamento.getValor() * 0.05;
    }
}
