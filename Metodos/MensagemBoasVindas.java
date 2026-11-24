import java.util.Scanner;
public class MensagemBoasVindas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = sc.nextLine();
    
    System.out.println("Olá, "+nome +", seja bem vindo(a). ");
    }

}
