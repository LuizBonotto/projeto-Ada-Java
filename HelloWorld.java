import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        String nome = scanNome();

        System.out.printf("Hello World, %s", nome);
    }

    private static String scanNome(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        scan.close();
        return nome;
    }
}
