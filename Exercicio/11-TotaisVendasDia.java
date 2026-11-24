
import java.util.Scanner;

public class ControleVendas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] vendas = new double[3][4];

        double totalGeral = 0;
        double maiorVenda = 0;

        // Ler as vendas
        for (int i = 0; i < 3; i++) {
            System.out.println("Funcionario " + (i + 1));

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



        for (int i = 0; i < 3; i++) {
            double soma = 0;

            for (int j = 0; j < 4; j++) {
                soma += vendas[i][j];
            }

            System.out.printf("Funcionario %d: R$ %.2f%n",
                    (i + 1), soma);

            totalGeral += soma;
        }

        double maiorDia = 0;
        int diaMaiorVenda = 0;

        for (int j = 0; j < 4; j++) {
            double somaDia = 0;

            for (int i = 0; i < 3; i++) {
                somaDia += vendas[i][j];
            }

            System.out.printf("Dia %d: R$ %.2f%n",
                    (j + 1), somaDia);

            if (j == 0 || somaDia > maiorDia) {
                maiorDia = somaDia;
                diaMaiorVenda = j + 1;
            }
        }


        System.out.printf("Maior Total: Dia %d (R$ %.2f)%n",
                diaMaiorVenda, maiorDia);

        entrada.close();
    }
}
