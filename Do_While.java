// Declaração do pacote ao qual a classe Do_While pertence
package PrimeiroExercicios;

// Importação das classes Scanner e Locale do pacote java.util
import java.util.Scanner;
import java.util.Locale;

// Declaração da classe Do_While
public class Do_While {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Configura o Locale para US (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Criação de um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Declaração da variável resp para armazenar a resposta do usuário
        char resp;

        // Loop do-while que executa pelo menos uma vez e continua enquanto a resposta do usuário não for 'n'
        do {
            // Solicita ao usuário que digite a temperatura em Celsius
            System.out.print("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();

            // Converte a temperatura de Celsius para Fahrenheit
            double F = 9.0 * C / 5.0 + 32.0;

            // Imprime o equivalente em Fahrenheit
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", F);

            // Solicita ao usuário se deseja repetir (s/n) e armazena a resposta em resp
            System.out.print("Deseja repetir (s/n)? ");
            resp = sc.next().charAt(0);

        } while (resp != 'n'); // Continua o loop se a resposta do usuário não for 'n'

        // Fecha o objeto Scanner
        sc.close();
    }
}