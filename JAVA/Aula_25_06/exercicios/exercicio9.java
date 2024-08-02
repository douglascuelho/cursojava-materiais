package JAVA.Aula_25_06.exercicio;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();
        
        String textoLimpo = texto.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String textoReverso = new StringBuilder(textoLimpo).reverse().toString();
        
        if (textoLimpo.equals(textoReverso)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
    }
}
