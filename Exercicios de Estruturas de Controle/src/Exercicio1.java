import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Escolha um número para calcular a tabuada: ");
        int numero = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d%n", numero, i, numero * i);
        }
        System.out.printf("\nObrigado %s, a tabuada do número %d foi gerada com sucesso!%n", nome, numero);
        scanner.close();
    }
}
