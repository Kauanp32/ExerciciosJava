// Declaração do pacote ao qual a classe CondicionalTernária pertence
package PrimeiroExercicios;

// Importação da classe Scanner do pacote java.util
import java.util.Scanner;

// Declaração da classe CondicionalTernária
public class CondicionalTernária {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Criação de um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Declaração e inicialização da variável preco com o valor 34.5
        double preco = 34.5;

        // Utilização da expressão condicional ternária para calcular o desconto
        // Se preco for menor que 20.0, desconto é 10% do preco, senão, desconto é 5% do preco
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        // Imprime o valor do desconto
        System.out.println(desconto);

        // Fecha o objeto Scanner
        sc.close();
    }
}