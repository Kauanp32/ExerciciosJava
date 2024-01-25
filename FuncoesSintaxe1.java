// Declaração do pacote ao qual a classe FuncoesSintaxe1 pertence
package PrimeiroExercicios;

// Importação da classe Scanner do pacote java.util
import java.util.Scanner;

// Declaração da classe FuncoesSintaxe1
public class FuncoesSintaxe1 {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Criação de um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que insira três números
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Verifica qual é o maior número usando estruturas condicionais
        if (a > b && a > c) {
            System.out.println("Higher = " + a);
        } else if (b > c) {
            System.out.println("Higher = " + b);
        } else {
            System.out.println("Higher = " + c);
        }

        // Fecha o objeto Scanner
        sc.close();
    }
}