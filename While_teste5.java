// Declaração do pacote ao qual a classe While_teste5 pertence
package PrimeiroExercicios;

// Declaração da classe While_teste5
public class While_teste5 {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {
        
        // Declaração e inicialização de variáveis
        int x = 2;
        int y = 10;
        
        // Imprime a string "olá" no console
        System.out.println("olá");
        
        // Loop while que executa enquanto x for menor que y
        while (x < y) {
            // Imprime os valores de x e y concatenados com a string " - " no console
            System.out.println(x + " - " + y);
            
            // Atualiza o valor de x multiplicando por 2
            x = x * 2;
            
            // Atualiza o valor de y incrementando 1
            y = y + 1;
        }
    }
}