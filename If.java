// Declaração do pacote ao qual a classe If pertence
package PrimeiroExercicios;

// Declaração da classe If
public class If {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Declaração e inicialização da variável x com o valor 5
        int x = 5;

        // Imprime "Bom dia"
        System.out.println("Bom dia ");

        // Condição: Se x for menor que 0, imprime "Boa tarde"
        if (x < 0) {
            System.out.println("Boa tarde ");
        }

        // Imprime "Boa noite" independentemente da condição acima
        System.out.println("Boa noite ");
    }
}