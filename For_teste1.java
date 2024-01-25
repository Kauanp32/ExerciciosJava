// Declaração do pacote ao qual a classe For_teste1 pertence
package PrimeiroExercicios;

// Importação da classe Scanner do pacote java.util
import java.util.Scanner;

// Declaração da classe For_teste1
public class For_teste1 {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Criação de um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro (N)
        int N = sc.nextInt();

        // Inicialização da variável soma com o valor 0
        int soma = 0;

        // Estrutura de repetição for que itera N vezes
        for (int i = 0; i < N; i++) {
            // Lê um número inteiro (x) do usuário a cada iteração
            int x = sc.nextInt();
            
            // Adiciona o valor de x à variável soma
            soma = soma + x;
        }

        // Imprime a soma dos números inseridos
        System.out.println(soma);

        // Fecha o objeto Scanner
        sc.close();
    }
}