public class ConversaoTemperatura {
    public static void main(String[] args) {
        // Variável para armazenar a temperatura em Celsius
        double celsius = 25.0;

        // Conversão para Fahrenheit usando a fórmula
        double fahrenheit = (celsius * 1.8) + 32;

        // Impressão do valor convertido (com casas decimais)
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);

        // Casting para inteiro (sem casas decimais)
        int fahrenheitInteiro = (int) fahrenheit;

        // Impressão do valor inteiro
        System.out.println("Temperatura em Fahrenheit (inteiro): " + fahrenheitInteiro);
    }
}
