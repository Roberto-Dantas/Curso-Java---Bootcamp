import java.util.Scanner;
import java.time.Year;

public class Exercicio_4 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // Sistema de cálculo de diferença de idades:
        System.out.println("-----------------------------------------------------\n");
        System.out.println("Bem-vindo ao sistema de cálculo de diferença de idades!\n");
        System.out.println("-----------------------------------------------------\n");

        // Nome e ano de nascimento da primeira pessoa:
        System.out.println("\n Insira o nome da primeira pessoa: ");
        String nome1 = leia.nextLine();
        System.out.println("\nInsira o ano de nascimento de "+nome1+":");
        int anoNascimento1 = leia.nextInt();
        leia.nextLine();
        
        // Nome e ano de nascimento da segunda pessoa:
        System.out.println("\n Insira o nome da segunda pessoa: ");
        String nome2 = leia.nextLine();
        System.out.println("\nInsira o ano de nascimento de "+nome2+":");
        int anoNascimento2 = leia.nextInt();

        // Calcular idades:
        int anoAtual = java.time.Year.now().getValue();
        int idade1 = anoAtual - anoNascimento1;
        int idade2 = anoAtual - anoNascimento2;

        // Calcular diferença de idades:
        if (idade1 > idade2) {
            // Idade 1 é maior que a idade 2
            int diferenca = idade1 - idade2;
            System.out.println("\n\n A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferenca + " ano(s).");
        } else if (idade2 > idade1) {
            // Idade 2 é maior que a idade 1
            int diferenca = idade2 - idade1;
            System.out.println("\n\n A diferença de idade entre " + nome2 + " e " + nome1 + " é de " + diferenca + " ano(S).");
        } else {
            System.out.println("\n\n " + nome1 + " e " + nome2 + " têm a mesma idade.");
        }

        leia.close();
        
    }
}
