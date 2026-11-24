import java.util.Scanner;

public class BoletimTurma{
  public static void main (String[] args) {
    Scanner entrada = new Scanner(System.in);

    String[] nomes = new String[4];

    double[][] notas = new double [4][3];

    String[] disciplinas = {
      "Lógica",
      "Banco de Dados",
      "Redes"
    };

    double maiorMedia = 0;
    String melhorAluno = "";

    for (int i = 0; i < 4; i++) {
      System.out.print("\nNome do aluno " + (i +1) + ": ");
      nomes [i] = entrada.nextLine();

      for (int j = 0; j < 3; j++) {
        System.out.print("Nota de " + disciplinas[j] + ": ");
        notas[i][j] = entrada.nextDouble();
      }
      entrada.nextLine();
    }
    for (int i = 0; i < 4; i++) {
      double soma = 0;
      for (int j = 0; j < 3; j++) {
        soma += notas[i][j];
      }
      double media = soma / 3;
      System.out.printf("%nAluno: %s%n", nomes [i]);
      System.out.printf("Media: %.2f%n", media);
      if (media >= 7){
        System.out.println("Situação: Aprovado");
      }else if (media >= 5) {
        System.out.println("Situação: Recuperação");
      } else {
        System.out.println("Situação: Reprovado");
      }
      if (i == 0 || media > maiorMedia) {
        maiorMedia = media;
        melhorAluno = nomes[i];
      }
      }
    for (int j = 0; j < 3; j++) {
      double soma = 0;
      for (int i = 0; i < 4; i++) {
        soma += notas [i][j];
      
      }
      double mediaDisciplina = soma / 4;
      System.out.printf("%s: %.2f%n", disciplinas[j], mediaDisciplina);
    }
    System.out.println("Aluno: " + melhorAluno);
    System.out.printf("Maior media: %.2f%n", maiorMedia);
    entrada.close();
      }
    }
  
