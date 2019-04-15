package lavajato;
import java.util.Scanner;
public class LavaJato {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        LayoutPrint menu = new LayoutPrint();
        SelecionaTipo seleciona = new SelecionaTipo();

        menu.Print();  //Imprime Menu Opções
        
        seleciona.tipo = entrada.nextInt(); // Recebe tipo
        
        seleciona.SelecionaTipoLavagem();// Chama o tipo escolhido
        
    }
   
}
