import java.util.Scanner;

public class PrimeiraQuestaoTabelaSac {
    public static void main(String[] args) {

        System.out.println("Tabela SAC");
        System.out.println("Cálculo de prestações de impréstimos");
        System.out.println("-----------------------------------------");
        //coletando dados
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor de um empréstimo: RS");
        double valorEmprestimo = scan.nextDouble();
        System.out.printf("\nDigite a taxa de juros do empréstimo:");
        double taxaJuros = scan.nextDouble();
        System.out.printf("\nDigite o tempo de pagamento do empréstimo:");
        double tempoPagamento = scan.nextDouble();
        scan.close();

        double saldo_devedor_atual = valorEmprestimo;
        final double AMORTIZACAO = valorEmprestimo / tempoPagamento;
        double juros_mensal = 0;
        double parcela_mensal = 0;
        double totalPago = 0;

        System.out.printf("\nValor fixo da amortização R$%.2f, Saldo devedor total R$%.2f com um juros de %.1f%% ao mês\n",AMORTIZACAO, saldo_devedor_atual,taxaJuros );

        for (int i = 1; i <= tempoPagamento; i++){
            juros_mensal = saldo_devedor_atual * taxaJuros/100;
            parcela_mensal = juros_mensal + AMORTIZACAO;
            saldo_devedor_atual = saldo_devedor_atual - AMORTIZACAO;
            totalPago += parcela_mensal;
            System.out.printf("Parcela %2d | Juros: R$%.2f | Prestação: R$%.2f | Saldo devedor: R$%.2f\n",i ,juros_mensal, parcela_mensal, saldo_devedor_atual);
        }
        System.out.printf("Total: Prestação R$%.2f, Juros R$%.2f, Amortização R$%.2f",totalPago, (totalPago - valorEmprestimo), valorEmprestimo);
    }
}
