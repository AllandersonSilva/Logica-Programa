
import java.util.Scanner;

public class CombinarVetores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];
        int[] D = new int[10];

        // Ler o vetor A
        System.out.println("Digite os 5 valores do vetor A:");
        for (int i = 0; i < 5; i++) {
            A[i] = entrada.nextInt();
        }

        // Ler o vetor B
        System.out.println("Digite os 5 valores do vetor B:");
        for (int i = 0; i < 5; i++) {
            B[i] = entrada.nextInt();
        }

        // Somar os valores e intercalar
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];

            D[i * 2] = A[i];
            D[i * 2 + 1] = B[i];
        }

        // Mostrar vetor C
        System.out.println("\nVetor C (soma):");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }

        // Mostrar vetor D
        System.out.println("\n\nVetor D (intercalado):");
        for (int i = 0; i < 10; i++) {
            System.out.print(D[i] + " ");
        }

        entrada.close();
    }
}
