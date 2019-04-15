package lavajato;
public class CalculadorDeDesconto {
    
    public void realizaCalculo(Orcamento orcamento, Desconto desconto){
        double valor = desconto.calcula(orcamento);
        System.out.println("Valor a descontar: " + valor);
        System.out.println("Valor a pagar: " + (orcamento.getValor() - valor));
    }

}
