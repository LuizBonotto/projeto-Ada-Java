import java.util.Scanner;

public class DesenhaMatrizQuadrados {
    public static void main(String[] args) {
        System.out.println("Bem-vindo ao desenhador de quadrados");
        int tamanho = scanTamanho();
        String[][] matriz = criaMatriz(tamanho);
        imprimeMatriz(matriz);
        System.out.printf("\nFim do programa");
    }

    private static int scanTamanho(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho do quadrado: ");
        int nome = scan.nextInt();
        scan.close();
        return nome;
    }

    private static String[][] criaMatriz (int tamanho) {
        String[][] matriz = new String[tamanho][tamanho];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = " * ";
            }
        }
        return matriz;
    }

    private static void imprimeMatriz (String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
