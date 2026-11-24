
import java.util.Scanner;

public class MetodosVetor {

    static Scanner sc = new Scanner(System.in);

    // Metodo para ler os 6 numeros
    public static int[] lerVetor() {
        int[] v = new int[6];

        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o " + (i + 1) + " numero: ");
            v[i] = sc.nextInt();
        }

        return v;
    }

    // Metodo para mostrar os numeros
    public static void mostrar(int[] v) {
        System.out.print("Vetor: ");

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        System.out.println();
    }

    // Metodo para somar
    public static int somar(int[] v) {
        int soma = 0;

        for (int i = 0; i < v.length; i++) {
            soma += v[i];
        }

        return soma;
    }

    // Metodo para calcular a media
    public static double media(int[] v) {
        return (double) somar(v) / v.length;
    }

    // Metodo para encontrar o maior numero
    public static int maior(int[] v) {
        int maior = v[0];

        for (int i = 1; i < v.length; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
        }

        return maior;
    }

    // Metodo para contar quantas vezes um valor aparece
    public static int contar(int[] v, int valor) {
        int quantidade = 0;

        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor) {
                quantidade++;
            }
        }

        return quantidade;
    }

    public static void main(String[] args) {

        int[] numeros = lerVetor();

        mostrar(numeros);

        System.out.println("Soma: " + somar(numeros));

        System.out.printf("Media: %.2f%n", media(numeros));

        System.out.println("Maior: " + maior(numeros));

        System.out.print("Contar qual valor? ");
        int valor = sc.nextInt();

        System.out.println("O valor " + valor + " aparece "
                + contar(numeros, valor) + " vez(es)");

        sc.close();
    }
}
