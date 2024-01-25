// Declaração do pacote ao qual a classe SwitchCase1 pertence
package PrimeiroExercicios;

// Importação da classe Scanner do pacote java.util
import java.util.Scanner;

// Declaração da classe SwitchCase1
public class SwitchCase1 {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Criação de um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Leitura de um número inteiro do usuário
        int x = sc.nextInt();
        
        // Declaração da variável dia
        String dia;

        // Estrutura condicional if-else para determinar o dia da semana com base no valor de x
        if (x == 1) {
            dia = "Domingo";
        } else if (x == 2) {
            dia = "Segunda";
        } else if (x == 3) {
            dia = "Terça";
        } else if (x == 4) {
            dia = "Quarta";
        } else if (x == 5) {
            dia = "Quinta";
        } else if (x == 6) {
            dia = "Sexta";
        } else if (x == 7) {
            dia = "Sábado";
        } else {
            dia = "Valor Inválido";
        }

        // Imprime o resultado no console
        System.out.println("Dia da semana: " + dia);

        // Fecha o objeto Scanner
        sc.close();
    }
}