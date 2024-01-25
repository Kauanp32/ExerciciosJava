// Declaração do pacote ao qual a classe While_teste1 pertence
package PrimeiroExercicios;

// Declaração da classe While_teste1
public class While_teste1 {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Inicialização da variável x com o valor 5
        int x = 5;
        
        // Inicialização da variável y com o valor 0
        int y = 0;
        
        // Loop while que executa enquanto x for maior que 2
        while (x > 2) {
            // Imprime o valor de x no console
            System.out.println(x);
            
            // Atualiza o valor de y somando x
            y = y + x;
            
            // Decrementa o valor de x em 1
            x = x - 1;
        }
    }
}