package JAVA.Aula_25_06.exercicio;

import java.util.Scanner;

public class exercicio8 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número decimal: ");
        int numero = scanner.nextInt();
        
        String binario = Integer.toBinaryString(numero);
        System.out.println("O número binário é: " + binario);
    }
}
