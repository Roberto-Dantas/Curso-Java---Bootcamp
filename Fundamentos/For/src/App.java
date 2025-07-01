import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Bem-vindo ao programa de números!");
        System.out.println("\nEscolha até que número você gostaria de ver: ");
        int maxNumber = scanner.nextInt();
        System.out.println("\nDeseja ver números pares ou ímpares? (Digite '1' para par ou 2 para 'ímpar')");
        int choice = scanner.nextInt();

        if(choice == 1){
            for(int i = 0; i <= maxNumber; i++){
                if(i %2 != 0){
                    continue; 
                }
                System.out.println(i); // imprime apenas números pares
            }
        } else if(choice == 2){
            for(int i = 0; i <= maxNumber; i++){
                if(i %2 == 0){
                    continue; 
                }
                System.out.println(i); // imprime apenas números ímpares
        }
        } else {
            System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }
        
        System.out.println("\nObrigado por usar nosso sistema!");
        scanner.close();
    }
}
