import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        var name = "";

        // While - verifica a condição antes de rodar o código
        // Do While -  primeiro roda o código e depois verifica a condição
        
        while(!name.equals("exit")) {
            System.out.println("Informe um nome:");
            name = scanner.nextLine();
            if(name.equals("exit")) {   
                System.out.println("Saindo...");
                break;  
            }
        }
        System.out.println("\nPrograma encerrado.");
        scanner.close();
    }
}