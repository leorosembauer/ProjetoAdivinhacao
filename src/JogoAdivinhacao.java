import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
  public static void main(String[] args) {
      Random random = new Random();
      int numeroAleatorio = random.nextInt(101);//Gera um número aleatório entre 0 a 100
      int tentativas = 5;

      System.out.println("Bem-vindo ao Jogo de Adivinhação!");
      System.out.println("Tente adivinhar o número entre 0 e 100. Você tem " + tentativas + " tentativas.");

      Scanner scanner = new Scanner(System.in);

      while (tentativas > 0) {
          System.out.println("Digite um número: ");
          int palpite = scanner.nextInt();

          if (palpite == numeroAleatorio) {
              System.out.println("Parabéns! Você acertou o número!");
              break;
          } else if (palpite < numeroAleatorio) {
              System.out.println("O número digitado é menor do que o número a ser adivinhado.");
          } else {
              System.out.println("O número digitado é maior do que o número a ser adivinhado.");
          }

          tentativas--;
          System.out.println("Tentativas restantes:" + tentativas);
      }

      if (tentativas == 0) {
          System.out.println("Suas tentativas acabaram. O número correto era:" +numeroAleatorio);
      }

      scanner.close();
          }
      }
