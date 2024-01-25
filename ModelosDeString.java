// Declaração do pacote ao qual a classe ModelosDeString pertence
package PrimeiroExercicios;

// Declaração da classe ModelosDeString
public class ModelosDeString {

    // Método principal, ponto de entrada do programa
    public static void main(String[] args) {

        // String original
        String original = "abcde FGHIJ ABC abc DEFG  ";
        
        // Converte todas as letras para minúsculas
        String s01 = original.toLowerCase();
        
        // Converte todas as letras para maiúsculas
        String s02 = original.toUpperCase();
        
        // Remove espaços em branco no início e no final da string
        String s03 = original.trim();
        
        // Obtém uma substring a partir da posição 2 até o final da string
        String s04 = original.substring(2);
        
        // Obtém uma substring a partir da posição 2 até a posição 9 (exclusive)
        String s05 = original.substring(2, 9);
        
        // Substitui todas as ocorrências do caractere 'a' pelo caractere 'x'
        String s06 = original.replace('a', 'x');
        
        // Substitui todas as ocorrências da substring "abc" pela substring "xy"
        String s07 = original.replace("abc", "xy");
        
        // Encontra a posição da primeira ocorrência da substring "bc"
        int i = original.indexOf("bc");
        
        // Encontra a posição da última ocorrência da substring "bc"
        int j = original.lastIndexOf("bc");

        // Imprime os resultados
        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2, 9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("indexOf('bc'): " + i);
        System.out.println("lastIndexOf('bc'): " + j);
    }
}