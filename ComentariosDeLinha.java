// Declaração do pacote ao qual a classe ComentariosDeLinha pertence
package PrimeiroExercicios;

// Importação das classes Scanner e Locale do pacote java.util
import java.util.Locale;
import java.util.Scanner;

// Declaração da classe ComentariosDeLinha
public class ComentariosDeLinha {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Configura o Locale para US (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Criação de um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis para os coeficientes e o delta
        double a, b, c, delta;

        // Solicita ao usuário que digite os valores dos coeficientes
        System.out.println("Digite os valores dos coeficientes:");

        // Leitura dos coeficientes fornecidos pelo usuário
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        // Cálculo do valor de delta
        delta = b * b - 4 * a * c;

        // Agora você pode prosseguir com o cálculo das raízes da equação quadrática
        // e a exibição dos resultados, incluindo tratamento para diferentes casos de delta
        // (por exemplo, delta > 0, delta = 0, delta < 0).

        // Fechar o objeto Scanner
        sc.close();
    }
}