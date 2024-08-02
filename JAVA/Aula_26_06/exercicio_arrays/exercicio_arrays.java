package JAVA.Aula_26_06.exercicio_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class exercicio_arrays {

//1. Ordenação Personalizada: Implemente um algoritmo que ordene um array de objetos com base em um critério personalizado (por exemplo, ordem alfabética de strings ou ordenação numérica).
public static void main(String[] args) {
    Integer[] numeros = {5, 2, 9, 1, 5, 6};

    Arrays.sort(numeros, new Comparator<Integer>() {
        @Override
        public int compare(Integer n1, Integer n2) {
            return n1 - n2;
        }
    });

    System.out.println("Array ordenado em ordem numérica crescente:");
    for (int numero : numeros) {
        System.out.println(numero);
    }
}
// 2. Fusão de Arrays: Crie um método que receba dois arrays de inteiros ordenados e os funda em um único array ordenado.
public static void main(String[] args) {
    int[] array1 = {1, 3, 5, 7};
    int[] array2 = {2, 4, 6, 8};

    int[] resultado = fundirArraysOrdenados(array1, array2);

    System.out.println("Array fundido e ordenado: " + Arrays.toString(resultado));
}

public static int[] fundirArraysOrdenados(int[] arr1, int[] arr2) {
    int[] resultado = new int[arr1.length + arr2.length];
    int i = 0, j = 0, k = 0;

    while (i < arr1.length && j < arr2.length) {
        if (arr1[i] <= arr2[j]) {
            resultado[k++] = arr1[i++];
        } else {
            resultado[k++] = arr2[j++];
        }
    }

    while (i < arr1.length) {
        resultado[k++] = arr1[i++];
    }

    while (j < arr2.length) {
        resultado[k++] = arr2[j++];
    }

    return resultado;
}

// 3. Média e Desvio Padrão: Escreva um programa que calcule a média e o desvio padrão de um array de números inteiros ou de ponto flutuante.
public static void main(String[] args) {
    double[] numeros = {1.0, 2.0, 3.0, 4.0, 5.0};

    double media = calcularMedia(numeros);
    double desvioPadrao = calcularDesvioPadrao(numeros, media);

    System.out.printf("Média: %.2f\n", media);
    System.out.printf("Desvio Padrão: %.2f\n", desvioPadrao);
}

public static double calcularMedia(double[] numeros) {
    double soma = 0.0;
    for (double num : numeros) {
        soma += num;
    }
    return soma / numeros.length;
}

public static double calcularDesvioPadrao(double[] numeros, double media) {
    double somaQuadrados = 0.0;
    for (double num : numeros) {
        somaQuadrados += Math.pow(num - media, 2);
    }
    return Math.sqrt(somaQuadrados / numeros.length);
}
// 4. Pesquisa em Matriz: Implemente um método para pesquisar um elemento em uma matriz multidimensional e retorne sua posição ou um indicativo de não encontrado.
public static void main(String[] args) {
    int[][] matriz = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    
    int elemento = 5;
    int[] resultado = pesquisarElemento(matriz, elemento);
    
    if (resultado[0] == -1) {
        System.out.println("Elemento não encontrado");
    } else {
        System.out.println("Elemento encontrado na posição: (" + resultado[0] + ", " + resultado[1] + ")");
    }
}

public static int[] pesquisarElemento(int[][] matriz, int elemento) {
    int[] posicao = {-1, -1};
    
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
            if (matriz[i][j] == elemento) {
                posicao[0] = i;
                posicao[1] = j;
                return posicao;
            }
        }
    }
    return posicao;
}
// 5. Operações de Conjunto: Escreva funções que realizem operações de união, interseção e diferença entre dois arrays.
public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        int[] uniao = uniao(array1, array2);
        int[] intersecao = intersecao(array1, array2);
        int[] diferenca = diferenca(array1, array2);

        System.out.println("União: " + Arrays.toString(uniao));
        System.out.println("Interseção: " + Arrays.toString(intersecao));
        System.out.println("Diferença: " + Arrays.toString(diferenca));
    }

    public static int[] uniao(int[] array1, int[] array2) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }
        for (int num : array2) {
            set.add(num);
        }
        int[] resultado = new int[set.size()];
        int i = 0;
        for (int num : set) {
            resultado[i++] = num;
        }
        return resultado;
    }

    public static int[] intersecao(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }
        for (int num : array2) {
            set2.add(num);
        }
        set1.retainAll(set2); 
        int[] resultado = new int[set1.size()];
        int i = 0;
        for (int num : set1) {
            resultado[i++] = num;
        }
        return resultado;
    }

    public static int[] diferenca(int[] array1, int[] array2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : array1) {
            set1.add(num);
        }
        for (int num : array2) {
            set2.add(num);
        }
        set1.removeAll(set2); 
        int[] resultado = new int[set1.size()];
        int i = 0;
        for (int num : set1) {
            resultado[i++] = num;
        }
        return resultado;
    }
// 6. Maior Sequência Crescente: Encontre a maior sequência crescente de números em um array e imprima os números dessa sequência.
public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 5, 1, 7, 8, 9, 10, 2, 3, 4};
        List<Integer> maiorSequencia = maiorSequenciaCrescente(array);
        System.out.println("Maior Sequência Crescente: " + maiorSequencia);
    }

    public static List<Integer> maiorSequenciaCrescente(int[] array) {
        List<Integer> maiorSequencia = new ArrayList<>();
        List<Integer> sequenciaAtual = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (sequenciaAtual.size() == 0 || array[i] > sequenciaAtual.get(sequenciaAtual.size() - 1)) {
                sequenciaAtual.add(array[i]);
            } else {
                if (sequenciaAtual.size() > maiorSequencia.size()) {
                    maiorSequencia = new ArrayList<>(sequenciaAtual);
                }
                sequenciaAtual.clear();
                sequenciaAtual.add(array[i]);
            }
        }
        if (sequenciaAtual.size() > maiorSequencia.size()) {
            maiorSequencia = sequenciaAtual;
        }
        return maiorSequencia;
    }
// 7. Rotacionar um Array: Crie uma função para rotacionar os elementos de um array para a esquerda ou para a direita por um número específico de posições.
public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    int posicoes = 2;

    System.out.println("Array original: " + Arrays.toString(array));
    rotacionarEsquerda(array, posicoes);
    System.out.println("Array após rotação à esquerda: " + Arrays.toString(array));

    rotacionarDireita(array, posicoes);
    System.out.println("Array após rotação à direita: " + Arrays.toString(array));
}

public static void rotacionarEsquerda(int[] array, int posicoes) {
    int n = array.length;
    posicoes = posicoes % n;
    reverso(array, 0, posicoes - 1);
    reverso(array, posicoes, n - 1);
    reverso(array, 0, n - 1);
}

public static void rotacionarDireita(int[] array, int posicoes) {
    int n = array.length;
    posicoes = posicoes % n;
    reverso(array, 0, n - posicoes - 1);
    reverso(array, n - posicoes, n - 1);
    reverso(array, 0, n - 1);
}

public static void reverso(int[] array, int inicio, int fim) {
    while (inicio < fim) {
        int temp = array[inicio];
        array[inicio] = array[fim];
        array[fim] = temp;
        inicio++;
        fim--;
    }
}
// 8. Histograma de Frequência: Construa um histograma de frequência a partir de um array de números, mostrando quantas vezes cada número aparece.
public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};
        Map<Integer, Integer> histograma = histogramaFrequencia(array);

        for (Map.Entry<Integer, Integer> entry : histograma.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> histogramaFrequencia(int[] array) {
        Map<Integer, Integer> frequencia = new HashMap<>();
        for (int num : array) {
            frequencia.put(num, frequencia.getOrDefault(num, 0) + 1);
        }
        return frequencia;
    }
// 9. Subconjuntos de Soma Zero: Determine se existe um subconjunto não vazio de elementos em um array cuja soma seja igual a zero.
 public static void main(String[] args) {
        int[] array = {3, 1, -4, 2, -2};
        boolean existeSubconjunto = existeSubconjuntoSomaZero(array);
        System.out.println("Existe subconjunto com soma zero: " + existeSubconjunto);
    }

    public static boolean existeSubconjuntoSomaZero(int[] array) {
        Set<Integer> prefixSomas = new HashSet<>();
        int soma = 0;
        for (int num : array) {
            soma += num;
            if (soma == 0 || prefixSomas.contains(soma)) {
                return true;
            }
            prefixSomas.add(soma);
        }
        return false;
    }
// 10. Palíndromos: Verifique se um array de strings contém palavras que são palíndromos (palavras que se leem da mesma forma de trás para frente).
public static void main(String[] args) {
    List<String> palavras = Arrays.asList("radar", "java", "level", "world", "civic");
    System.out.println("Palíndromos: " + encontrarPalindromos(palavras));
}

public static List<String> encontrarPalindromos(List<String> palavras) {
    List<String> palindromos = new ArrayList<>();
    for (String palavra : palavras) {
        if (ehPalindromo(palavra)) {
            palindromos.add(palavra);
        }
    }
    return palindromos;
}

public static boolean ehPalindromo(String palavra) {
    int esquerda = 0;
    int direita = palavra.length() - 1;
    while (esquerda < direita) {
        if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
            return false;
        }
        esquerda++;
        direita--;
    }
    return true;
}
}
