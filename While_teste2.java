// Declaração do pacote ao qual a classe While_teste2 pertence
package PrimeiroExercicios;

// Declaração da classe While_teste2
public class While_teste2 {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Inicialização da variável x com o valor 2
        int x = 2;
        
        // Inicialização da variável y com o valor 0
        int y = 0;
        
        // Loop while que executa enquanto x for menor que 60
        while (x < 60) {
            // Imprime o valor de x no console
            System.out.println(x);
            
            // Atualiza o valor de x multiplicando por 2
            x = x * 2;
            
            // Atualiza o valor de y somando 10
            y = y + 10;
        }
    }
}