
import java.util.Scanner;

public class SomaPorLinha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double[][] matriz = new double[3][2];

        double totalGeral = 0;

        // Ler as notas da matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite a nota do aluno "
                        + (i + 1) + " na disciplina "
                        + (j + 1) + ": ");

                matriz[i][j] = entrada.nextDouble();
            }
        }

        // Somar as notas de cada linha
        for (int i = 0; i < 3; i++) {

            double soma = 0;

            for (int j = 0; j < 2; j++) {
                soma += matriz[i][j];
            }

            System.out.println("Soma das notas do aluno "
                    + (i + 1) + ": " + soma);

            totalGeral += soma;
        }

        // Mostrar o total geral
        System.out.println("Total geral: " + totalGeral);

        entrada.close();
    }
}
