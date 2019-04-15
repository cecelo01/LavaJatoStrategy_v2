package lavajato;
public class SelecionaTipo {
    protected int tipo;
    
        Desconto lavagemcompleta = new LavagemCompleta();
        Desconto lavagem = new Lavagem();
        Desconto motor = new Motor();
        Desconto pretim = new Pretim();
        Desconto ducha = new Ducha();
        Desconto aspirar = new Aspirar();
        CalculadorDeDesconto calc = new CalculadorDeDesconto();

    protected void SelecionaTipoLavagem(){
            if (tipo < 1){
            IllegalArgumentException erro = new IllegalArgumentException();
            System.out.println("Numéro digitado não atende a um tipo.");
            throw erro;
        }
        else if (tipo > 6){
            IllegalArgumentException erro = new IllegalArgumentException();
                System.out.println("Numéro digitado não atende a um tipo.");
            throw erro;
        }
        else if (tipo == 1){
            Orcamento orcamento = new Orcamento(20);
            calc.realizaCalculo(orcamento, lavagemcompleta);
        }
        else if (tipo == 2){
            Orcamento orcamento = new Orcamento(15);
            calc.realizaCalculo(orcamento, lavagem);
        }
        else if (tipo == 3){
            Orcamento orcamento = new Orcamento(10);
            calc.realizaCalculo(orcamento, ducha);
            System.out.println();
        }
        else if (tipo == 4){
            Orcamento orcamento = new Orcamento(5);
            calc.realizaCalculo(orcamento, aspirar);
        }
        else if (tipo == 5){
            Orcamento orcamento = new Orcamento(5);
            calc.realizaCalculo(orcamento, pretim);
        }
        else{
            Orcamento orcamento = new Orcamento(20);
            calc.realizaCalculo(orcamento, motor);
        };
    }

}
