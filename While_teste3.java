// Declaração do pacote ao qual a classe While_teste3 pertence
package PrimeiroExercicios;

// Declaração da classe While_teste3
public class While_teste3 {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Inicialização das variáveis x e y com o valor 100
        double x = 100;
        double y = 100;

        // Loop while que executa enquanto x for diferente de y
        while (x != y) {
            // Imprime "olha" no console
            System.out.println("olha");
            
            // Atualiza o valor de x para a raiz quadrada de y
            x = Math.sqrt(y);
        }
    }
}