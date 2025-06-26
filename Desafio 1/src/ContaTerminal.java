import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        System.out.println("-----------------------------------------------------\n");
        System.out.println("Bem-vindo ao Desafio 1 - Conta Banco!\n");
        System.out.println("-----------------------------------------------------\n");

        // Solicita os dados da conta
        System.out.println("Por favor, digite o número da agência:");
        int num = leia.nextInt();
        leia.nextLine();
        System.out.println("\nPor favor, digite o nome da agência:");
        String numAgencia = leia.nextLine();
        System.out.println("\nPor favor, digite o nome do cliente:");
        String nome = leia.nextLine();
        System.out.println("\nPor favor, digite o saldo do cliente:");
        double saldo = leia.nextDouble();

        // Exibe os dados da conta
        System.err.printf("\nOlá %s,\nMuito obrigado por criar uma conta em nosso banco: \n Agência: %s \n Conta: %d \n Seu saldo de: %.2f já está disponível para saque!\n",nome,numAgencia,num,saldo);

        leia.close();
    }
}