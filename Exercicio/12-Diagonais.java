
import java.util.Scanner;

public class Diagonais {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        // Ler a matriz
        System.out.println("Digite os valores da matriz:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }

        // Mostrar a matriz e calcular as diagonais
        System.out.println("\nMatriz:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");

                if (i == j) {
                    somaPrincipal += matriz[i][j];
                }

                if (i + j == 3) {
                    somaSecundaria += matriz[i][j];
                }
            }

            System.out.println();
        }

        // Mostrar as somas
        System.out.println("\nSoma da diagonal principal: " + somaPrincipal);
        System.out.println("Soma da diagonal secundaria: " + somaSecundaria);

        entrada.close();
    }
}
