public class PraticandoJava {
    public static void main(String[] args) {
        // 1. Média de duas notas decimais
        double nota1 = 8.5;
        double nota2 = 7.2;
        double media = (nota1 + nota2) / 2;
        System.out.println("Média das notas: " + media);

        // 2. Casting de double para int
        double valorDouble = 9.78;
        int valorInt = (int) valorDouble;
        System.out.println("Valor double: " + valorDouble);
        System.out.println("Valor convertido para int: " + valorInt);

        // 3. Concatenação de char e String
        char letra = 'J';
        String palavra = "ava";
        System.out.println("Mensagem: " + letra + palavra);

        // 4. Cálculo do valor total de um produto
        double precoProduto = 15.99;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Valor total da compra: R$ " + valorTotal);

        // 5. Conversão de dólares para reais
        double valorEmDolares = 50.0;
        double cotacao = 4.94;
        double valorEmReais = valorEmDolares * cotacao;
        System.out.printf("Valor em reais: R$ %.2f%n", valorEmReais);

        // 6. Cálculo de desconto
        double precoOriginal = 200.0;
        double percentualDesconto = 10.0;
        double valorDesconto = (precoOriginal * percentualDesconto) / 100;
        double novoPreco = precoOriginal - valorDesconto;
        System.out.printf("Preço original: R$ %.2f%n", precoOriginal);
        System.out.printf("Desconto: R$ %.2f%n", valorDesconto);
        System.out.printf("Novo preço com desconto: R$ %.2f%n", novoPreco);
    }
}
