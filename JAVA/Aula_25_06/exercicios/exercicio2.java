package JAVA.Aula_25_06.exercicio;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números deseja inserir? ");
        int quantidade = scanner.nextInt();
        
        double soma = 0;
        for(int i = 0; i < quantidade; i++) {
            System.out.println("Digite o número " + (i+1) + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
        }
        
        double media = soma / quantidade;
        System.out.println("A média dos números é: " + media);
    }
}
