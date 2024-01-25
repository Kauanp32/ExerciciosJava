// Declaração do pacote ao qual a classe Escopo_Inicialização pertence
package PrimeiroExercicios;

// Declaração da classe Escopo_Inicialização
public class Escopo_Inicialização {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Declaração e inicialização da variável price com o valor 400.00
        double price = 400.00;

        // Declaração da variável discount sem inicialização
        double discount;

        // Verifica se o valor de price é menor que 200.00
        if (price < 200.00) {
            // Se verdadeiro, calcula o desconto como 10% do preço
            discount = price * 0.1;
        } else {
            // Se falso, define o desconto como 0
            discount = 0;
        }

        // Imprime o valor original de price (400.00)
        System.out.println(price);
    }
}