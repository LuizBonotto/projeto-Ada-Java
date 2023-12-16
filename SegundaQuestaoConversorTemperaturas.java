import java.util.Scanner;

public class SegundaQuestaoConversorTemperaturas {
    public static void main(String[] args) {
        System.out.println("Conversor de Temperaturas");
        System.out.println("-----------------------------------------");

        //coletando dados
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a Temperatura: ");
        double temperaturaOrigem = scan.nextDouble();
        System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
        String unidadeOrigem = scan.next();
        unidadeOrigem = unidadeOrigem.toUpperCase();
        //laço de verificaçao força entrada correta
        while (!(unidadeOrigem.equals("C") || unidadeOrigem.equals("K") || unidadeOrigem.equals("F"))){
            System.out.println("Entrada desconhecida, digite novamente a unidade de origem 30[C, K, F] ");
            unidadeOrigem = scan.next();
            unidadeOrigem = unidadeOrigem.toUpperCase();
        }
        System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
        String unidadeDestino = scan.next();
        unidadeDestino = unidadeDestino.toUpperCase();
        //laço de verificaçao força entrada correta
        while (!(unidadeDestino.equals("C") || unidadeDestino.equals("K") || unidadeDestino.equals("F"))){
            System.out.println("Entrada desconhecida, digite novamente a unidade de destino [C, K, F] ");
            unidadeDestino = scan.next();
            unidadeDestino = unidadeDestino.toUpperCase();
        }
        scan.close();

        double temperaturaConvertida = 0;

        switch (unidadeOrigem) {
            case "C":
                if (unidadeDestino.equals("K")) {
                    temperaturaConvertida = temperaturaOrigem + 273.15;
                } else if (unidadeDestino.equals("F")) {
                    temperaturaConvertida = (temperaturaOrigem * 9 / 5) + 32;
                } else {
                    temperaturaConvertida = temperaturaOrigem;
                }
                break;
            case "K":
                if (unidadeDestino.equals("C")) {
                    temperaturaConvertida = temperaturaOrigem - 273.15;
                } else if (unidadeDestino.equals("F")) {
                    temperaturaConvertida = (temperaturaOrigem - 273.15) * 9 / 5 + 32;
                } else {
                    temperaturaConvertida = temperaturaOrigem;
                }
                break;
            case "F":
                if (unidadeDestino.equals("C")) {
                    temperaturaConvertida = (temperaturaOrigem - 32) * 5 / 9;
                } else if (unidadeDestino.equals("K")) {
                    temperaturaConvertida = (temperaturaOrigem - 32) * 5 / 9 + 273.15;
                } else {
                    temperaturaConvertida = temperaturaOrigem;
                }
                break;
            default:
                System.out.println("Erro desconhecido, finalizando programa");
                return;
        }

        System.out.printf("%.2f %s = %.2f %s", temperaturaOrigem, unidadeOrigem, temperaturaConvertida, unidadeDestino);
    }
}
