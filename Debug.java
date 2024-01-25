// Declaração do pacote ao qual a classe Debug pertence
package PrimeiroExercicios;

// Importação das classes Scanner e Locale do pacote java.util
import java.util.Locale;
import java.util.Scanner;

// Declaração da classe Debug
public class Debug {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Configura o Locale para US (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Criação de um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que insira a largura, o comprimento e o preço por metro quadrado
        System.out.println("Digite a largura, o comprimento e o preço por metro quadrado:");

        // Leitura dos valores inseridos pelo usuário
        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double precoMetroQuadrado = sc.nextDouble();

        // Cálculo da área
        double area = largura * comprimento;

        // Cálculo do preço
        double preco = area * precoMetroQuadrado;

        // Imprime a área formatada com duas casas decimais
        System.out.printf("ÁREA = %.2f%n", area);

        // Imprime o preço formatado com duas casas decimais
        System.out.printf("PREÇO = %.2f%n", preco);

        // Fecha o objeto Scanner
        sc.close();
    }
}