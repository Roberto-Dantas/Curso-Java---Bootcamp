import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Cálculo do IMC");
        System.out.println("Informe seus dados abaixo:");

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();
        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();
        double imc = peso / (altura * altura);
        String classificacao;
        System.out.print(peso);

        if(imc <= 18.5) {
            classificacao = "Abaixo do peso";
        } else if(imc <= 24.9) {
            classificacao = "Peso ideal";
        } else if(imc <= 29.9) {
            classificacao = "Levemente acima do peso";
        } else if(imc <= 34.9) {
            classificacao = "Obesidade Grau I";
        } else if(imc <= 39.9) {
            classificacao = "Obesidade Grau II (Severa)";
        } else {
            classificacao = "Obesidade Grau III (Mórbida)";
        }
        System.out.printf("%n%s,\nSeus Dados:\n Altura: %s metros\n Peso: %s kg\n IMC: %s\nSignifica que está %s.", nome, altura, peso, imc, classificacao);
        scanner.close();
    }
}
