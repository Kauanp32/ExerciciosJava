// Declaração do pacote ao qual a classe StringSplit pertence
package PrimeiroExercicios;

// Declaração da classe StringSplit
public class StringSplit {
    
    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {
        
        // String contendo palavras separadas por espaços
        String s = "potato apple lemon orange";
        
        // Utiliza o método split para dividir a string em um array de substrings, usando o espaço como delimitador
        String[] vect = s.split(" ");
        
        // Imprime as substrings resultantes
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);
    }
}