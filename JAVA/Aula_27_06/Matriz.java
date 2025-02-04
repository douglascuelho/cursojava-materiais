public class matriz {
    public static void main(String[] args) {
        int [][] matriz = {
            {1,2,3}, //Linha 1,  indiceLinha 0 - 
            //IndiceColuna [0,0]= 1
            //IndiceColuna [0,1]= 2
            //IndiceColuna [0,2]= 3
            {4,5,6,10}, //Linha 2,  indiceLinha 1 - 
            {7,8,9}, //Linha 3,  indiceLinha 2 - 
            {0}
        };
        //Número de linhas
        int numLinhas = matriz.length;
        System.out.println("Número de Linhas da Matriz: "+ numLinhas);
        //Número de colunas (assumir que todas as linhas possuem o mesmo nº col)
        // int numColunas = matriz[0].length;
        int numColunas=0;
        //Econtrar o número máximo de colunas
        for(int[] linha : matriz){
            if(linha.length > numColunas){
                numColunas = linha.length;
                // System.out.println("colunas: "+ numColunas);
            }
        }
        System.out.println("Número de Colunas da Matriz: "+ numColunas);

        //Percorrendo a matriz e imprimindo os valores
        // for(int L = 0; L < numLinhas; L++){
        //     for(int C = 0; C < numColunas; C++){
        //         System.out.print(matriz[L][C] + " ");
        //     }
        //     System.out.println("******");
        // }

        for (int[] linha: matriz){
            for(int elemento: linha){
                System.out.print(elemento + " ");
            }
            System.out.println("******");
        }
         // int numProfundidade = 3;
        // int numLinhas = 3;
        // int numColunas = 3;

        // int [][][] matriz = new int[numProfundidade][numLinhas][numColunas];
        // int [][][] matriz = new int[3][3][3];

        int [][][] matriz = {
            {
                //linhas
                {1,2,3},
                {4,5,6},
                {7,8,9}
            },
            {
                //colunas
                {10,11,12},
                {13,14,15},
                {16,17,18}
            },
            {
                //profundidade
                {19,20,21},
                {22,23,24},
                {25,26,27}
            }
        };

        //EXIBINDO A MATRIZ TRIDIMENSIONAL
        System.out.println("Matriz Tridimensional Preenchida");
        int pagina = 0;
        for(int [][] paginaMatriz : matriz){
            // System.out.println("Página " + (pagina + 1) + ":");
            int linha = 0;
            for(int[] linhaMatriz : paginaMatriz){
                // System.out.println("Linha " + (linha+1)+ ":");
                for(int valorColuna : linhaMatriz){
                    System.out.print(valorColuna + "|");
                }
                System.out.println();
                linha++;
            }
            pagina++;
        }


    }
}
