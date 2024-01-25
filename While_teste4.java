// Declaração do pacote ao qual a classe While_teste4 pertence
package PrimeiroExercicios;

// Declaração da classe While_teste4
public class While_teste4 {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {
        
        // Inicialização da variável x com o valor 0
        int x = 0;
        
        // Loop while que executa enquanto x for menor que 5
        while (x < 5) {
            // Declaração e inicialização da variável y com o valor de x multiplicado por 3
            int y = x * 3;
            
            // Imprime o valor de y no console
            System.out.println(y);
            
            // Incrementa o valor de x
            x = x + 1;
        }
        
        // Imprime "Fim" no console após o término do loop
        System.out.println("Fim");
    }
}