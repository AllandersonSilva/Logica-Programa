import java.util.Scanner;

public class BuscaNomes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[6];

        // Ler os 6 nomes
        for (int i = 0; i < 6; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = entrada.nextLine();
        }

        // Nome que deseja buscar
        System.out.print("Buscar qual nome? ");
        String busca = entrada.nextLine();

        int quantidade = 0;

        // Procurar o nome no vetor
        for (int i = 0; i < 6; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                System.out.println("Encontrado na posicao " + (i + 1));
                quantidade++;
            }
        }

        // Mostrar o resultado
        if (quantidade > 0) {
            System.out.println(busca + " aparece " + quantidade + " vez(es).");
        } else {
            System.out.println(busca + " nao foi encontrado.");
        }

        entrada.close();
    }
}
