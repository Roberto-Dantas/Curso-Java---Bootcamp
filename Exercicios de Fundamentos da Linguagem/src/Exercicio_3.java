import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        // Sistema de cálculo da área do retângulo:
        System.out.println("-----------------------------------------------------\n");
        System.out.println("Bem-vindo ao sistema de cálculo da área retângulo!\n");
        System.out.println("-----------------------------------------------------\n");

        // Tamanho dos lados do retângulo:
        System.out.println("Insira o tamanho do primeiro lado (Altura) do retângulo (em metros): ");
        double lado1 = leia.nextDouble();
        System.out.println("Insira o tamanho do segundo lado (Base) do retângulo (em metros): ");
        double lado2 = leia.nextDouble();   

        // Cálculo da área do retângulo:
        double area = lado1 * lado2;    

        // Exibir o resultado
        System.out.println("\n A área do retângulo com lados de " + lado1 + " e " + lado2 + " é igual a " + area + " metros quadrados.\n");
        leia.close();
    }
}