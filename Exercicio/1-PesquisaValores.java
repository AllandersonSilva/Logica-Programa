
import java.util.Scanner;

public class PesquisaValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int pares = 0;
        int impares = 0;
        int soma = 0;

        // Leitura dos 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();

            soma += numeros[i];

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Mostrar os números
        System.out.println("\nNumeros digitados:");

        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
        }

        // Mostrar os resultados
        System.out.println("\nPares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Soma: " + soma);

        sc.close();
    }
}
