// public class App {
//     public static void main(String[] args) throws Exception {
//         System.out.println("Hello, World!");
//     }
// }

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String numAgencia, nome;
        int num;
        double saldo; 
        Scanner leia = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência");
        num = leia.nextInt();
        System.out.println("Por favor, digite a agência");
        numAgencia = leia.next();
        System.out.println("Por favor, digite o nome do cliente");
        nome = leia.next();
        System.out.println("Por favor, digite o saldo do cliente");
        saldo = leia.nextDouble();
        System.err.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência %s,conta %d e seu saldo %.2f já está disponível para saque. ",nome,numAgencia,num,saldo);

    }
}