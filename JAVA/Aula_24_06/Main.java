package JAVA.Aula_24_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //CORPO DO CÓDIGO
        // System.out.println("Hello, World!");

        //VARIÁVEIS
        // Dois tipos de DADOS
        /* 
         * Por Valor (tipos primitivos)
         * Por referência (objetos)
         */

        // int idade;
        // idade = 20;

        //  int integer = 2147483647;
        //  long inteiroLongo = 214748366456448L;
        //  double flutuanteLongo = 474836645644.5466;
        //  float flutuante = 5435345.67F;
        //  boolean logico = false;
        //  char letra = 'I';
        //  letra = 'G';
        //  integer = 17;
        //  // integer = "Oi";
        //  String nome = "Adriano gosta de chocolate.";

    // int -> Integer -> Inteiro (Numerico Inteiro)
    // long -> Long -> Longo (Numero Inteiro)
    // double -> Double -> Dobro (Numerico Decimal)
    // float -> Float -> Flutuante (Numerico Decimal)
    // boolean -> Boolean (Lógico)
    // char -> Charactere -> Caractere (Numerico/Textual)
    // String -> Sequência ou Cadeia (Textuais)

        // System.out.println(nome);
        // System.out.println(flutuanteLongo);
        
        // // OPERADORES MATEMÁTICOS
        // int num1 = 2 + 3;
        // int num2 = 3 - 1;
        // int num3 = 3 * 2;
        // int num4 = 64 / 4;]
        // int num5 = 5 % 2;
        
        // System.out.println(num4);

        // CRIAR UM OBJETO SCANNER PARA LER A INPUT
        Scanner teclado = new Scanner(System.in);
        // Solicitar ao usuário o primeiro numero
        System.out.println("Digite o primeiro número");
        float x = teclado.nextFloat();
        // Solicitar ao usuário o segundo numero
        System.out.println("Digite o segundo número");
        float y = teclado.nextFloat();
        // Calcular a soma dos dois
        float soma = x + y;
        // Imprimir o resultado
        System.out.printf("A soma de %.2f e %.2f é %.2f%n", x, y, soma);



        // TARDE

         // Cria um objeto Scanner para ler a entrada do teclado
         Scanner scanner = new Scanner(System.in);
        
         // Solicita a idade do usuário
         System.out.print("Digite sua idade: ");
         int idade = scanner.nextInt();
         scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt
         
         // Solicita se o usuário é amigo do dono
         System.out.print("Você é amigo do dono? (sim/nao): ");
         String amigoDoDonoResposta = scanner.nextLine();
         boolean amigoDoDono = amigoDoDonoResposta.equalsIgnoreCase("sim");
         
         // Solicita se o usuário possui voucher
         System.out.print("Você possui um voucher? (sim/nao): ");
         String voucherResposta = scanner.nextLine();
         boolean voucher = voucherResposta.equalsIgnoreCase("sim");
         
         // Verifica as condições de entrada
         if (idade >= 18) {
             System.out.println("Pode entrar na festa.");
         } else if (amigoDoDono) {
             System.out.println("Pode entrar na festa.");
         } else if (voucher) {
             System.out.println("Pode entrar na festa.");
         } else {
             System.out.println("Acesso não autorizado.");
         }
         
         // Fecha o Scanner
        scanner.close();

        
    // Verifica as condições de entrada usando operador ternário
    String resultado = (idade >= 18 && (amigoDoDono || voucher)) || (amigoDoDono && voucher) ? "Pode entrar na festa." : "Acesso não autorizado.";

    // Imprime o resultado
    System.out.println(resultado);



    
     // Contador de condições satisfeitas
     int condicoesSatisfeitas = 0;
        
     // Verifica cada condição e incrementa o contador
     if (idade >= 18) {
         condicoesSatisfeitas++;
     }
     if (amigoDoDono) {
         condicoesSatisfeitas++;
     }
     if (voucher) {
         condicoesSatisfeitas++;
     }
     
     // Verifica as condições de entrada usando switch
     String resultado;
     switch (condicoesSatisfeitas) {
         case 2:
         case 3:
             resultado = "Pode entrar na festa.";
             break;
         default:
             resultado = "Acesso não autorizado.";
             break;
     }
     
 
 
 
 
 
 
     // Imprime o resultado
     System.out.println(resultado);
 
 
 
 
 
 
 
     if (idade >= 18 && (amigoDoDono || voucher)) {
             System.out.println("Pode entrar na festa.");
         } else if (amigoDoDono && voucher) {
             System.out.println("Pode entrar na festa.");
         } else {
             System.out.println("Acesso não autorizado.");
         }
 
 
         // Fecha o Scanner
        scanner.close();



    } 
}