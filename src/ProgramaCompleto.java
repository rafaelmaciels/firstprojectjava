import java.util.Scanner;
import java.util.Random;

public class ProgramaCompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Loop para exibir o menu até o usuário escolher sair
        do {
            System.out.println("\n================ MENU =================");
            System.out.println("1. Verificar se um número é positivo ou negativo");
            System.out.println("2. Comparar dois números inteiros");
            System.out.println("3. Calcular área do quadrado ou círculo");
            System.out.println("4. Exibir tabuada de um número");
            System.out.println("5. Verificar se um número é par ou ímpar");
            System.out.println("6. Calcular o fatorial de um número");
            System.out.println("7. Jogo de adivinhação");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Executa a opção escolhida pelo usuário
            switch (opcao) {
                case 1:
                    verificarPositivoOuNegativo(scanner);
                    break;
                case 2:
                    compararNumeros(scanner);
                    break;
                case 3:
                    calcularArea(scanner);
                    break;
                case 4:
                    exibirTabuada(scanner);
                    break;
                case 5:
                    verificarParOuImpar(scanner);
                    break;
                case 6:
                    calcularFatorial(scanner);
                    break;
                case 7:
                    jogoAdivinhacao(scanner);
                    break;
                case 0:
                    System.out.println("Saindo... Obrigado por usar o programa!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    // Função que verifica se um número é positivo ou negativo
    public static void verificarPositivoOuNegativo(Scanner scanner) {
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        System.out.println(numero >= 0 ? "Número positivo" : "Número negativo");
    }

    // Função que compara dois números inteiros e exibe qual é maior ou se são iguais
    public static void compararNumeros(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais.");
        } else if (num1 > num2) {
            System.out.println("O primeiro número é maior.");
        } else {
            System.out.println("O segundo número é maior.");
        }
    }

    // Função que calcula a área de um quadrado ou círculo com base na escolha do usuário
    public static void calcularArea(Scanner scanner) {
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");
        System.out.print("Escolha a opção: ");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.print("Digite o lado do quadrado: ");
            double lado = scanner.nextDouble();
            System.out.println("Área do quadrado: " + (lado * lado));
        } else if (escolha == 2) {
            System.out.print("Digite o raio do círculo: ");
            double raio = scanner.nextDouble();
            System.out.println("Área do círculo: " + (Math.PI * raio * raio));
        } else {
            System.out.println("Opção inválida.");
        }
    }

    // Função que exibe a tabuada de um número escolhido pelo usuário
    public static void exibirTabuada(Scanner scanner) {
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // Função que verifica se um número é par ou ímpar
    public static void verificarParOuImpar(Scanner scanner) {
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        System.out.println(numero % 2 == 0 ? "O número é par." : "O número é ímpar.");
    }

    // Função que calcula o fatorial de um número fornecido pelo usuário
    public static void calcularFatorial(Scanner scanner) {
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }

    // Função que implementa um jogo de adivinhação com 5 tentativas
    public static void jogoAdivinhacao(Scanner scanner) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100); // Gera um número entre 0 e 99
        int tentativas = 5;

        System.out.println("Tente adivinhar o número entre 0 e 100. Você tem " + tentativas + " tentativas.");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número.");
                break; // Sai do loop ao acertar
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior. Tente novamente!");
            } else {
                System.out.println("O número é menor. Tente novamente!");
            }

            // Se chegar ao limite de tentativas, exibe o número correto
            if (i == tentativas) {
                System.out.println("Fim das tentativas! O número correto era " + numeroAleatorio);
            }
        }
    }
}