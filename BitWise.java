// Declaração do pacote ao qual a classe BitWise pertence
package PrimeiroExercicios;

// Declaração da classe BitWise
public class BitWise {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // Declaração e inicialização de duas variáveis inteiras
        int n1 = 89;
        int n2 = 60;
        
        // Operação bitwise AND (E) entre n1 e n2, resultado impresso no console
        System.out.println(n1 & n2);

        // Operação bitwise OR (OU) entre n1 e n2, resultado impresso no console
        System.out.println(n1 | n2);

        // Operação bitwise XOR (OU exclusivo) entre n1 e n2, resultado impresso no console
        System.out.println(n1 ^ n2);

    }
}