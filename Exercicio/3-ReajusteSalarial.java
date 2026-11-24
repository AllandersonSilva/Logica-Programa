
import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salarios = new double[5];

        // Ler os salários
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": R$ ");
            salarios[i] = sc.nextDouble();

            // Aplicar aumento de 10%
            if (salarios[i] < 2000) {
                salarios[i] = salarios[i] * 1.10;
            }
        }

        // Mostrar os salários atualizados
        System.out.println("\nSalários atualizados:");

        for (int i = 0; i < 5; i++) {
            System.out.printf("Funcionário %d: R$ %.2f%n",
                    (i + 1), salarios[i]);
        }

        sc.close();
    }
}
