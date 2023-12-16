import java.util.Scanner;

public class TerceiraQuestaoTriangulo {
    public static void main(String[] args) {
        System.out.println("Desenho de triangulos");
        System.out.println("Digite o tamanho da base:");
        Scanner scan = new Scanner(System.in);
        int tamanho = scan.nextInt();
        scan.close();
        desenhaTrianguloNormal(tamanho);
        //adicionando questão extra
        desenhaTrianguloInvertido(tamanho);
    }
    private static void desenhaTrianguloNormal(int tamanho){
        for (int i = 1; i <= (tamanho/2)+1; i++) {
            for (int j = 1; j <= tamanho - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void desenhaTrianguloInvertido(int tamanho){
        for (int i = (tamanho/2)+1; i >= 1; i--) {
            for (int j = 1; j <= tamanho - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
