package lavajato;
public class Aspirar implements Desconto{
    
    //Somente aspirar 5$.
    //Sem desconto.
    
    public double calcula(Orcamento orcamento){
        return 0 * orcamento.getValor();
    }
    
}
