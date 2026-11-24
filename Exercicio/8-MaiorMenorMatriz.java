
import java.util.Scanner;

public class MaiorMenorMatriz {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][3];

        // Ler os valores da matriz
        System.out.println("Digite os valores da matriz 4x3:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Inicializar maior e menor
        int maior = matriz[0][0];
        int menor = matriz[0][0];

        // Procurar o maior e o menor
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }

                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        // Mostrar resultados
        System.out.println("\nMaior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);

        entrada.close();
    }
}
