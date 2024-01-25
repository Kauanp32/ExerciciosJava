// Declaração do pacote ao qual a classe While_teste6 pertence
package PrimeiroExercicios;

// Declaração da classe While_teste6
public class While_teste6 {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Declaração e inicialização de variáveis
        int x = 4;
        int y = 0;
        int i = 0;
        
        // Loop while que executa enquanto i for menor que x
        while (i < x) {
            // Incrementa o valor de i
            i = i + 1;
            
            // Adiciona o valor atual de i a y
            y = y + i;
            
            // Imprime o valor atual de i sem pular linha
            System.out.print(i);
            
            // Imprime o valor atual de y e pula para a próxima linha
            System.out.println(y);
        }

    }
}