package JAVA.Aula_27_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
         //ArrayList
        ArrayList<String> alunos = new ArrayList<>();
        alunos.add("Anajara");
        alunos.add("Pedro");
        alunos.add(0,"Sebastião");
        alunos.add( "Lucas");
        System.out.println(alunos);

        alunos.remove(0);
        System.out.println(alunos);
        // String valor = alunos.get(0);

        //Adicionando varios alunos addAll()
        List<String> novosAlunos = Arrays.asList("Thiago", "Luciana", "Douglas");

        alunos.addAll(novosAlunos);
        System.out.println(alunos);

        // ArrayList<Integer> lista = new ArrayList<>(10);

          //Imprimir os indices e os elementos da lista
          System.out.println("Índices e elementos da lista");
          for(int i = 0; i<alunos.size(); i++){
              System.out.println("Índice " + i + ": " + alunos.get(i));
          }
    }
}
