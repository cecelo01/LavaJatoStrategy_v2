package lavajato;
public class Ducha implements Desconto{
    
    //Somente ducha 10$.
    //Sem desconto.
    
  public double calcula(Orcamento orcamento){
        return orcamento.getValor() * 0;
    }
    
}
