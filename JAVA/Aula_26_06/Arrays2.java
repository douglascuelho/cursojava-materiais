package JAVA.Aula_26_06;

import java.util.Arrays;

public class Arrays2 {
    int [] b = new int[10];
        int [] c = {1,2,3,4,5};
        String [] nomes = {"Douglas", "Dennys"};
        
        System.out.println(nomes[1]);
        nomes[0] = "Luciana";
        System.out.println(nomes[0]);

        for(int i = 0; i<nomes.length; i++){
            System.out.println("Elemento " + i + " nome = " + nomes[i]);
        }

        System.out.println(Arrays.toString(nomes));
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numeros));

for (int elemento : numeros){
            System.out.println(elemento);
        }

        for (String elemento : nomes){
            System.out.println(elemento);
        }

        double media;
        int soma = 0;
        for (int elemento : numeros){
            soma += elemento;
        }
        media = (double) soma / numeros.length;
        System.out.println("A média dos elementos: " + media);


// Novo elemento a ser adicionado
        int novoElemento = 7;
        //Criar um novo Array com tamanho maior
        int novoTamanho = numeros.length + 1;
        int [] numeros2 = new int[novoTamanho];
        //Copiando os elementos do array Original
        for(int i = 0; i< numeros.length; i++){
            numeros2[i] = numeros[i];
        }
        //Adicionando o novo elemento
        numeros2[novoTamanho - 1] = novoElemento;
        //Imprimir
        System.out.println("Novo Array: " + Arrays.toString(numeros2));

        
    //Array de Origem
        int [] numerosOrigem = {1,2,3,4,5};
        //Array de Destino
        int [] numerosDestino = new int [5];
        //Copiando
        System.arraycopy(numerosOrigem, 0, numerosDestino, 0, numerosOrigem.length);
        //Imprimindo
        System.out.println(Arrays.toString(numerosDestino));


        //Array Original
        int [] arrayOriginal = {1,2,3,4,5};
        //Copiando
        int[] arrayCopiado = Arrays.copyOf(arrayOriginal, arrayOriginal.length + 3);
        //Imprimindo
        System.out.println("Array copiado: " + Arrays.toString(arrayCopiado));

}
