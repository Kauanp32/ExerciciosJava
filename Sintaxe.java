// Declaração do pacote ao qual a classe Sintaxe pertence
package PrimeiroExercicios;

// Importação de classes necessárias do pacote java.util
import java.util.Locale;
import java.util.Scanner;

// Declaração da classe Sintaxe
public class Sintaxe {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {
        
        // Configura o locale para US (ponto como separador decimal)
        Locale.setDefault(Locale.US);

        // Criação de um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);
        
        // Leitura do número de minutos a partir do teclado
        int minutos = sc.nextInt();
        
        // Declaração e inicialização da variável conta com o valor básico de R$ 50,00
        double conta = 50.0;

        // Verifica se a quantidade de minutos é maior que 100
        if (minutos > 100) {
            // Calcula o valor adicional e atualiza o valor da conta
            conta += (minutos - 100) * 2.0;
        }

        // Imprime o valor da conta formatado com duas casas decimais
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
                
        // Fecha o objeto Scanner
        sc.close();       
    }
}