//1. Escreva um programa que verifica se um número é positivo, negativo ou zero.

package JAVA.Aula_25_06.exercicio;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = scanner.nextDouble();
        
        if(numero > 0) {
            System.out.println("O número é positivo.");
        } else if(numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
}
}
