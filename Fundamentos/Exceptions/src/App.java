import java.io.FileNotFoundException;

public class App {
    public static void main(String[] args) {
        test();
    }
    private static void test() {
       
        //Pai de exceptions e errors
        new Throwable(); 


        //Pai de todas as exceptions                //Pai de todos os erros
        new Exception();                            new OutOfMemoryError(); 
        // Representa situações que                 Usada para indicar que a 
        // podem acontecer durante a                JVM ficou sem memória.
        // execução do programa, mas que            É uma unchecked error, o que
        // podem ser tratadas (capturadas).         significa que você não precisa (e não deve)
        //                                          tratar. Em geral, quando ocorre,
        // Exemplo: erro ao abrir um arquivo,       é porque algo muito sério deu errado
        // conexão com banco de dados, etc.         (ex: loop infinito alocando memória).


        //Pai de todas as exceptions que podem ser lançadas em tempo de execução
        // superclasse das exceções unchecked
        new RuntimeException(); 
        // Isso significa que o compilador não obriga você a tratar (try/catch).
        // Usada para indicar erros de programação, como:
            // Acesso a índice inválido de array
            // Divisão por zero
            // NullPointerException, etc.



        //Exceção que indica que um arquivo não foi encontrado  
        new FileNotFoundException(); 
        // Representa uma exceção que ocorre quando um arquivo que 
        // deveria ser lido/aberto não existe ou não pode ser encontrado.
        // Precisa ser tratada ou declarada (try-catch ou throws).
    }


}
