import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Escolha um número inteiro positivo:");
        double numero1 = scanner.nextDouble();
        System.out.println("Escolha outro número inteiro (ele deve ser maior que o primeiro):");
        double numero2 = scanner.nextDouble();

        do {
            if (numero2 <= numero1) {
                System.out.println("O segundo número deve ser maior que o primeiro. Tente novamente.");
                numero2 = scanner.nextDouble();
            } else if (numero1 % numero2 == 0) {
                System.out.println("O primeiro número não pode ser divisível pelo segundo. Tente novamente.");
                numero1 = scanner.nextDouble();
            }
        } while (numero2 <= numero1 || numero1 % numero2 == 0);

        System.out.printf("\nO número %.2f não é divisível por %.2f.%n", numero1, numero2);
        System.out.printf("A divisão de %.2f por %.2f é igual a %.2f.%n", numero1, numero2, numero1 / numero2);
        System.out.printf("O resto da divisão de %.2f por %.2f é igual a %.2f.%n", numero1, numero2, 20 % numero2);
        scanner.close();
    }
}
