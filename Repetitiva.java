// Declaração do pacote ao qual a classe Repetitiva pertence
package PrimeiroExercicios;

// Importação da classe Scanner do pacote java.util
import java.util.Scanner;

// Declaração da classe Repetitiva
public class Repetitiva {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Criação de um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Leitura do primeiro número inteiro do usuário
        int x = sc.nextInt();

        // Inicialização da variável soma com o valor 0
        int soma = 0;

        // Loop while que continua enquanto o valor de x for diferente de zero
        while (x != 0) {
            // Adiciona o valor de x à variável soma
            soma = soma + x;
            
            // Lê o próximo número inteiro do usuário
            x = sc.nextInt();
        }

        // Imprime a soma dos números inseridos (excluindo o zero final)
        System.out.println(soma);

        // Fecha o objeto Scanner
        sc.close();
    }
}