import java.util.ArrayList;
import java.util.List;

public class Listas02 {
     public static void main(String[] args) {
        //Criar uma matriz usando listas
        List<List<Integer>> matriz = new ArrayList<>();
        matriz.add(new ArrayList<>(List.of(1, 2, 3)));
        matriz.add(new ArrayList<>(List.of(4, 5, 6, 10)));
        matriz.add(new ArrayList<>(List.of(7, 8, 9)));

        //Número de linhas
        int numLinhas = matriz.size();
        System.out.println("Número de linhas: " + numLinhas);
        
        //Percorrer a matriz e imprimir os valores usando for-each
        for(List<Integer> linha : matriz){
            for(int elemento : linha){
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
     }
}
