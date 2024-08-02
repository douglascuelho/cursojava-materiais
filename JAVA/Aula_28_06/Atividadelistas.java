import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Atividadelistas {
//     1. Soma dos Elementos Pares:
//    Escreva um programa que calcule a soma dos elementos pares de uma lista de inteiros.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite a quantidade de elementos na lista: ");
    int n = scanner.nextInt();
    
    List<Integer> numeros = new ArrayList<>();
    System.out.println("Digite os elementos da lista:");
    for (int i = 0; i < n; i++) {
        numeros.add(scanner.nextInt());
    }
    
    int somaPares = 0;
    for (int numero : numeros) {
        if (numero % 2 == 0) {
            somaPares += numero;
        }
    }
    
    System.out.println("A soma dos elementos pares é: " + somaPares);
}

// 2. Verificação de Palíndromo:
//    Crie um método que verifique se uma lista de caracteres forma um palíndromo. Um palíndromo é uma sequência que se lê da mesma forma tanto da esquerda para a direita quanto da direita para a esquerda.
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a sequência de caracteres: ");
        String input = scanner.nextLine();
        
        List<Character> caracteres = new ArrayList<>();
        for (char c : input.toCharArray()) {
            caracteres.add(c);
        }
        
        boolean ehPalindromo = isPalindromo(caracteres);
        
        if (ehPalindromo) {
            System.out.println("A sequência é um palíndromo.");
        } else {
            System.out.println("A sequência não é um palíndromo.");
        }
    }
    
    public static boolean isPalindromo(List<Character> lista) {
        int esquerda = 0;
        int direita = lista.size() - 1;
        
        while (esquerda < direita) {
            if (!lista.get(esquerda).equals(lista.get(direita))) {
                return false;
            }
            esquerda++;
            direita--;
        }
        
        return true;
    }

// 3. Ordenação de Lista de Números:
//    Implemente um algoritmo de ordenação (por exemplo, Bubble Sort) para ordenar uma lista de números inteiros em ordem crescente.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite a quantidade de elementos na lista: ");
    int n = scanner.nextInt();
    
    List<Integer> numeros = new ArrayList<>();
    System.out.println("Digite os elementos da lista:");
    for (int i = 0; i < n; i++) {
        numeros.add(scanner.nextInt());
    }
    
    bubbleSort(numeros);
    
    System.out.println("Lista ordenada: " + numeros);
}

public static void bubbleSort(List<Integer> lista) {
    int n = lista.size();
    boolean trocou;
    
    for (int i = 0; i < n - 1; i++) {
        trocou = false;
        for (int j = 0; j < n - 1 - i; j++) {
            if (lista.get(j) > lista.get(j + 1)) {
                int temp = lista.get(j);
                lista.set(j, lista.get(j + 1));
                lista.set(j + 1, temp);
                trocou = true;
            }
        }
        if (!trocou) break; 
    }
}

// 4. Remoção de Elementos Duplicados:
//    Escreva um método que remova todos os elementos duplicados de uma lista, mantendo apenas a primeira ocorrência de cada elemento.
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de elementos na lista: ");
        int n = scanner.nextInt();
        
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Digite os elementos da lista:");
        for (int i = 0; i < n; i++) {
            numeros.add(scanner.nextInt());
        }
        
        List<Integer> semDuplicados = removerDuplicados(numeros);
        
        System.out.println("Lista sem duplicados: " + semDuplicados);
    }
    
    public static List<Integer> removerDuplicados(List<Integer> lista) {
        Set<Integer> conjunto = new HashSet<>();
        List<Integer> novaLista = new ArrayList<>();
        
        for (Integer numero : lista) {
            if (conjunto.add(numero)) {
                novaLista.add(numero);
            }
        }
        
        return novaLista;
    }

// 5. Média de Valores Únicos:
//    Implemente um programa que calcule a média aritmética dos valores únicos em uma lista de números inteiros, ou seja, excluindo os valores duplicados da média.
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite a quantidade de elementos na lista: ");
    int n = scanner.nextInt();
    
    List<Integer> numeros = new ArrayList<>();
    System.out.println("Digite os elementos da lista:");
    for (int i = 0; i < n; i++) {
        numeros.add(scanner.nextInt());
    }
    
    double media = calcularMediaUnicos(numeros);
    
    System.out.println("A média dos valores únicos é: " + media);
}

public static double calcularMediaUnicos(List<Integer> lista) {
    Set<Integer> conjunto = new HashSet<>(lista);
    int soma = 0;
    
    for (Integer numero : conjunto) {
        soma += numero;
    }
    
    return soma / (double) conjunto.size();
}
}
