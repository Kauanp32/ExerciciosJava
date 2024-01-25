// Declaração do pacote ao qual a classe BitWise2 pertence
package PrimeiroExercicios;

// Importação da classe Scanner do pacote java.util
import java.util.Scanner;

// Declaração da classe BitWise2
public class BitWise2 {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Criação de um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Máscara binária 0b100000 (32 em decimal)
        int mask = 0b100000;

        // Solicita ao usuário que insira um número inteiro
        System.out.println("Digite um número inteiro:");

        // Lê o número inteiro fornecido pelo usuário
        int n = sc.nextInt();

        // Verifica se o 6º bit do número é verdadeiro usando a operação bitwise AND
        if ((n & mask) != 0) {
            System.out.println("O 6º bit está ativado!");
        } else {
            System.out.println("O 6º bit está desativado!");
        }

        // Fecha o objeto Scanner
        sc.close();
    }
}