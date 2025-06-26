import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) throws Exception{
        Scanner leia = new Scanner(System.in);

        // Sistema de cálculo da área do quadrado:
        System.out.println("-----------------------------------------------------\n");
        System.out.println("Bem-vindo ao sistema de cálculo da área do quadrado!\n");
        System.out.println("-----------------------------------------------------\n");

        // Tamanho do lado do quadrado:
        System.out.println("Insira o tamanho do lado do quadrado (em metros): ");
        double lado = leia.nextDouble();

        // Cálculo da área do quadrado:
        double area = lado * lado;

        // Exibir o resultado:
        System.out.println("\n A área do quadrado com lado de " + lado + " é igual a " + area + "metros quadrados.\n");

        leia.close();
    }
}
