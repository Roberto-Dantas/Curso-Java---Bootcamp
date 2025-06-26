import java.util.Scanner;
import java.time.Year;

public class Exercicio_1 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // Nome do usuario  
        System.out.println("Por favor, digite seu nome:");
        String nome = leia.nextLine();

        // Data de Nascimento
        System.out.println("\nDigite o seu ano de nascimento:");
        int anoNascimento = leia.nextInt();
        
        // Calcular idade
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;

        // Exibir mensagem
        System.out.println("\n Olá, " + nome + "!");
        System.out.println(" Você tem " + idade + " anos de idade.\n");

        leia.close();
    }
}