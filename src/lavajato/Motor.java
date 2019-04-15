package lavajato;
public class Motor implements Desconto{
    
    //Somente motor.
    //Sem desconto.
    
    public double calcula (Orcamento orcamento){
        return orcamento.getValor() * 0;
    }
}
