import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100); // Gera um número entre 0 e 99
        Scanner scanner = new Scanner(System.in);
        int tentativas = 5;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100. Você tem " + tentativas + " tentativas.");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número.");
                break; // Sai do loop se o usuário acertar
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente!");
            } else {
                System.out.println("O número é menor. Tente novamente!");
            }

            if (i == tentativas) {
                System.out.println("Fim das tentativas! O número correto era " + numeroAleatorio);
            }
        }

        scanner.close();
    }
}