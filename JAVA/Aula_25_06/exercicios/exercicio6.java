package JAVA.Aula_25_06.exercicio;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números deseja inserir? ");
        int quantidade = scanner.nextInt();
        
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        
        System.out.println("O maior número é: " + maior);
    }
}
