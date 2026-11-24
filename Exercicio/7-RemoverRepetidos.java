
import java.util.Scanner;

public class RemoverRepetidos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];

        int quantidade = 0;

        // Ler os 10 números
        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            A[i] = entrada.nextInt();
        }

        // Remover os números repetidos
        for (int i = 0; i < 10; i++) {

            boolean repetido = false;

            for (int j = 0; j < quantidade; j++) {
                if (A[i] == B[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                B[quantidade] = A[i];
                quantidade++;
            }
        }

        // Mostrar vetor original
        System.out.println("\nVetor original:");
        for (int i = 0; i < 10; i++) {
            System.out.print(A[i] + " ");
        }

        // Mostrar novo vetor
        System.out.println("\n\nVetor sem repetidos:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(B[i] + " ");
        }

        // Mostrar quantidade removida
        int removidos = 10 - quantidade;

        System.out.println("\n\nQuantidade de valores removidos: " + removidos);

        entrada.close();
    }
}
