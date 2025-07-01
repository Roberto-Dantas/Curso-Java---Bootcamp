import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String name = scanner.next();
        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();

        if(age < 18){
            System.out.printf("%s, você é menor de idade e não pode dirigir.\n", name);
        }
        else if(age >= 18 && age < 70){
            System.out.printf("%s, você é maior de idade e pode dirigir.\n", name);
        }
        else {
            System.out.printf("%s, você é idoso e pode dirigir, mas deve ter cuidado.\n", name);
        }

        System.out.println("\nObrigado por usar nosso sistema!");
        scanner.close();
    }
}
