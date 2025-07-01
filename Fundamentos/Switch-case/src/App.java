import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana (1-7): ");
        int dia = scanner.nextInt();

        var opcao = switch (dia) {
            case 1,7 -> {
                var day = dia == 1 ? "Domingo" : "Sabádo";
                // yield day;
                yield String.format("Hoje é %s final de semanaaa", day);
            }
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            default -> "Opção inválida!";
        };
        System.out.println("Dia da semana: " + opcao);

        scanner.close();
    }
}
