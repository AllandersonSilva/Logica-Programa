
import java.util.Scanner;

public class TemperaturasSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[7];

        String[] dias = {
            "Domingo", "Segunda", "Terça",
            "Quarta", "Quinta", "Sexta", "Sábado"
        };

        double soma = 0;
        double media;
        double maior;

        // Ler as temperaturas
        for (int i = 0; i < 7; i++) {
            System.out.print("Temperatura de " + dias[i] + ": ");
            temperaturas[i] = sc.nextDouble();

            soma += temperaturas[i];
        }

        // Calcular a média
        media = soma / 7;

        // Encontrar a maior temperatura
        maior = temperaturas[0];
        int diaMaisQuente = 0;

        for (int i = 1; i < 7; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
                diaMaisQuente = i;
            }
        }

        // Mostrar a média
        System.out.printf("%nMédia da semana: %.1f °C%n", media);

        // Mostrar dias acima da média
        System.out.println("\nDias acima da média:");

        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] > media) {
                System.out.printf("%s (%.1f °C)%n",
                        dias[i], temperaturas[i]);
            }
        }

        // Mostrar o dia mais quente
        System.out.printf("%nDia mais quente: %s (%.1f °C)%n",
                dias[diaMaisQuente], maior);

        sc.close();
    }
}
