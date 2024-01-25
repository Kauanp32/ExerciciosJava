// Declaração do pacote ao qual a classe FuncoesSintaxe2 pertence
package PrimeiroExercicios;

// Importação da classe Scanner do pacote java.util
import java.util.Scanner;

// Declaração da classe FuncoesSintaxe2
public class FuncoesSintaxe2 {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Criação de um objeto Scanner para leitura de entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que insira três números
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Chama a função max para calcular o maior valor entre os três números
        int higher = max(a, b, c);

        // Chama a função showResult para exibir o resultado
        showResult(higher);

        // Fecha o objeto Scanner
        sc.close();
    }

    // Função para calcular o maior valor entre três números
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    // Função para exibir o resultado
    public static void showResult(int value) {
        System.out.println("higher = " + value);
    }
}