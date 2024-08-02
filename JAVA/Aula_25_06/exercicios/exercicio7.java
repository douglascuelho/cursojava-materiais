package JAVA.Aula_25_06.exercicio;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        
        int contadorVogais = 0;
        for (char c : frase.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'á' || c == 'à' || c == 'â' || c == 'ã' ||
                c == 'e' || c == 'é' || c == 'ê' ||
                c == 'i' || c == 'í' ||
                c == 'o' || c == 'ó' || c == 'ô' || c == 'õ' ||
                c == 'u' || c == 'ú' || c == 'ü') {
                contadorVogais++;
            }
        }
        
        System.out.println("O número de vogais na frase é: " + contadorVogais);
    }
}
