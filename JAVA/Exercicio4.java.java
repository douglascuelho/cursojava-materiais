// Caso de Uso 1: Leitura de Arquivo e Processamento de Dados

// Você precisa ler um arquivo de texto que contém uma lista de números, um em cada linha, e calcular a soma desses números. Se o arquivo não existir, deve ser criada uma exceção personalizada FileNotFoundException. Se uma linha não puder ser convertida para um número, deve ser lançada uma exceção personalizada InvalidNumberFormatException.
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
class InvalidNumberFormatException extends Exception {
    public InvalidNumberFormatException(String message) {
        super(message);
    }
}

public class LeituraArquivo {
    public static void main(String[] args) {
        String filePath = "numeros.txt";
        try {
            System.out.println("Soma dos números: " + lerECalcularSoma(filePath));
        } catch (FileNotFoundException e) {
            System.err.println("Erro: Arquivo não encontrado.");
        } catch (InvalidNumberFormatException e) {
            System.err.println("Erro: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Erro: Problema na leitura do arquivo.");
        }
    }

    public static int lerECalcularSoma(String filePath) throws FileNotFoundException, InvalidNumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        int sum = 0;
        while ((line = reader.readLine()) != null) {
            try {
                sum += Integer.parseInt(line);
            } catch (NumberFormatException e) {
                throw new InvalidNumberFormatException("Linha inválida: " + line);
            }
        }
        reader.close();
        return sum;
    }
}
// Caso de Uso 2: Conexão com Banco de Dados

// Você está desenvolvendo uma aplicação que se conecta a um banco de dados PostgreSQL para buscar dados de uma tabela. Se a conexão com o banco de dados falhar, deve ser lançada uma exceção personalizada DatabaseConnectionException. Se a consulta SQL falhar, deve ser lançada uma exceção personalizada SQLQueryException.
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class DatabaseConnectionException extends Exception {
    public DatabaseConnectionException(String message) {
        super(message);
    }
}

class SQLQueryException extends Exception {
    public SQLQueryException(String message) {
        super(message);
    }
}

public class ConexaoBancoDados {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/seuBanco";
        String user = "seuUsuario";
        String password = "suaSenha";

        try {
            Connection connection = conectarBancoDados(url, user, password);
            buscarDados(connection);
        } catch (DatabaseConnectionException e) {
            System.err.println("Erro: " + e.getMessage());
        } catch (SQLQueryException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public static Connection conectarBancoDados(String url, String user, String password) throws DatabaseConnectionException {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new DatabaseConnectionException("Falha na conexão com o banco de dados.");
        }
    }

    public static void buscarDados(Connection connection) throws SQLQueryException {
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM suaTabela")) {

            while (rs.next()) {
                System.out.println("Dados: " + rs.getString("suaColuna"));
            }
        } catch (SQLException e) {
            throw new SQLQueryException("Falha na execução da consulta SQL.");
        }
    }
}

// Caso de Uso 3: Conversão de Tipos

// Desenvolva um método que recebe uma lista de strings e tenta convertê-las para inteiros. Se a conversão de uma string para inteiro falhar, deve ser lançada uma exceção personalizada InvalidTypeConversionException e o programa deve continuar tentando converter as outras strings da lista.
import java.util.ArrayList;
import java.util.List;

class InvalidTypeConversionException extends Exception {
    public InvalidTypeConversionException(String message) {
        super(message);
    }
}

public class ConversaoTipos {
    public static void main(String[] args) {
        List<String> strings = List.of("123", "456", "abc", "789");
        try {
            List<Integer> integers = converterStringsParaInteiros(strings);
            System.out.println("Inteiros convertidos: " + integers);
        } catch (InvalidTypeConversionException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }

    public static List<Integer> converterStringsParaInteiros(List<String> strings) throws InvalidTypeConversionException {
        List<Integer> integers = new ArrayList<>();
        for (String str : strings) {
            try {
                integers.add(Integer.parseInt(str));
            } catch (NumberFormatException e) {
                throw new InvalidTypeConversionException("Falha ao converter: " + str);
            }
        }
        return integers;
    }
}

// Caso de Uso 4: Manipulação de Coleções

// Implemente um método que remove um elemento de uma lista de strings com base em um índice fornecido pelo usuário. Se o índice estiver fora dos limites da lista, deve ser lançada uma exceção personalizada IndexOutOfBoundsException. O programa deve pedir ao usuário para tentar novamente com um índice válido.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManipulacaoColecoes {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("um", "dois", "três", "quatro"));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite o índice do elemento a ser removido: ");
                int index = scanner.nextInt();
                removerElementoPorIndice(lista, index);
                break;
            } catch (IndexOutOfBoundsException e) {
                System.err.println("Erro: " + e.getMessage());
                System.out.println("Por favor, tente novamente.");
            }
        }

        System.out.println("Lista atualizada: " + lista);
    }

    public static void removerElementoPorIndice(List<String> lista, int index) {
        if (index < 0 || index >= lista.size()) {
            throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
        }
        lista.remove(index);
    }
}

// Caso de Uso 5: Operações Matemáticas

// Desenvolva um método que realiza operações matemáticas básicas (adição, subtração, multiplicação e divisão) com base em dois números fornecidos pelo usuário e uma operação especificada. Se a operação não for reconhecida, deve ser lançada uma exceção personalizada InvalidOperationException. Se uma divisão por zero for tentada, deve ser lançada uma exceção ArithmeticException.
class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}

public class OperacoesMatematicas {
    public static void main(String[] args) {
        try {
            double resultado = realizarOperacao(10, 5, "divisao");
            System.out.println("Resultado: " + resultado);
        } catch (InvalidOperationException e) {
            System.err.println("Erro: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.err.println("Erro: Divisão por zero.");
        }
    }

    public static double realizarOperacao(double a, double b, String operacao) throws InvalidOperationException {
        switch (operacao.toLowerCase()) {
            case "adição":
                return a + b;
            case "subtração":
                return a - b;
            case "multiplicação":
                return a * b;
            case "divisão":
                if (b == 0) {
                    throw new ArithmeticException();
                }
                return a / b;
            default:
                throw new InvalidOperationException("Operação não reconhecida: " + operacao);
        }
    }
}
