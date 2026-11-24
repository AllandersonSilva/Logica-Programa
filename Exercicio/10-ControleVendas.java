
import java.util.Scanner;

public class ControleVendas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] vendas = new double[3][4];

        double totalGeral = 0;
        double maiorVenda = 0;

        // Ler as vendas
        for (int i = 0; i < 3; i++) {
            System.out.println("Funcionário " + (i + 1));

            for (int j = 0; j < 4; j++) {
                System.out.print("Venda do dia " + (j + 1) + ": ");
                vendas[i][j] = entrada.nextDouble();

                if (i == 0 && j == 0) {
                    maiorVenda = vendas[i][j];
                }

                if (vendas[i][j] > maiorVenda) {
                    maiorVenda = vendas[i][j];
                }
            }
        }

        // Calcular o total de cada funcionário
        for (int i = 0; i < 3; i++) {

            double soma = 0;

            for (int j = 0; j < 4; j++) {
                soma += vendas[i][j];
            }

            System.out.println("Total do funcionário "
                    + (i + 1) + ": R$ " + soma);

            totalGeral += soma;
        }

        // Mostrar resultados
        System.out.println("\nTotal geral: R$ " + totalGeral);
        System.out.println("Maior venda: R$ " + maiorVenda);

        entrada.close();
    }
}
