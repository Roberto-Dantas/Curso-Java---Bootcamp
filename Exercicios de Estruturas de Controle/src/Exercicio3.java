import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Insira um número inteiro: ");
        int numero1 = scanner.nextInt();
        System.out.println("Insira outro número inteiro maior que o primeiro: ");
        int numero2 = scanner.nextInt();
        while (numero2 <= numero1) {
            System.out.println("O segundo número deve ser maior que o primeiro. Tente novamente.");
            System.out.println("Insira outro número inteiro maior que o primeiro: ");
            numero2 = scanner.nextInt();
        }
        System.out.printf("\nEscolha entre ver números Pares ou Impares entre %d e %d (Digite 'P' para Pares ou 'I' para Impares): ", numero1, numero2);
        char escolha = scanner.next().toUpperCase().charAt(0);

        switch (escolha) {
            case 'P':
                System.out.println("Números Pares entre " + numero1 + " e " + numero2 + ":");
                for (int i = numero1; i <= numero2; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                break;
            case 'I':
                System.out.println("Números Impares entre " + numero1 + " e " + numero2 + ":");
                for (int i = numero1; i <= numero2; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + " ");
                    }
                }
                break;
            default:
                break;
        }
        System.out.println("\nObrigado por usar o programa!");
        scanner.close();
    }
}
