// Declaração do pacote ao qual a classe IfElse pertence
package PrimeiroExercicios;

// Importação da classe Scanner do pacote java.util
import java.util.Scanner;

// Declaração da classe IfElse
public class IfElse {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Criação de um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Declaração da variável hora
        int hora;

        // Solicita ao usuário que insira o número de horas
        System.out.println("Quantas horas? ");
        hora = sc.nextInt();

        // Condição: Se a hora for menor que 12, imprime "Bom dia"
        if (hora < 12) {
            System.out.println("Bom dia ");
        }
        // Se a condição acima for falsa, executa o bloco de código abaixo
        else {
            // Condição: Se a hora for menor que 18, imprime "Boa tarde"
            if (hora < 18) {
                System.out.println("Boa tarde");
            }
            // Se a condição acima for falsa, imprime "Boa noite"
            else {
                System.out.println("Boa noite");
            }
        }

        // Fecha o objeto Scanner
        sc.close();
    }
}