package Exercicio 5;

public class Questao2 {
    public enum Departamento {
        TI, RH, MARKETING;
    }

    public abstract class Funcionario {
        protected String nome;
        protected int idade;
        protected double salario;
    
        public Funcionario(String nome, int idade, double salario) {
            this.nome = nome;
            this.idade = idade;
            this.salario = salario;
        }
    
        public abstract double calcularBonusAnual();
        public abstract void imprimirDetalhes();
    }

    public interface AvaliacaoDesempenho {
        void avaliarDesempenho();
    }
    
    public interface Treinamento {
        void realizarTreinamento();
    }

    public class Gerente extends Funcionario implements AvaliacaoDesempenho, Treinamento {

        public Gerente(String nome, int idade, double salario) {
            super(nome, idade, salario);
        }
    
        @Override
        public double calcularBonusAnual() {
            return salario * 1.2; // 20% de bônus
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Gerente: " + nome + ", Idade: " + idade + ", Salário: " + salario);
        }
    
        @Override
        public void avaliarDesempenho() {
            System.out.println("Desempenho do gerente " + nome + " avaliado.");
        }
    
        @Override
        public void realizarTreinamento() {
            System.out.println("Treinamento realizado para o gerente " + nome);
        }
    }
    
    public class Desenvolvedor extends Funcionario implements AvaliacaoDesempenho, Treinamento {
    
        public Desenvolvedor(String nome, int idade, double salario) {
            super(nome, idade, salario);
        }
    
        @Override
        public double calcularBonusAnual() {
            return salario * 1.1; // 10% de bônus
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Desenvolvedor: " + nome + ", Idade: " + idade + ", Salário: " + salario);
        }
    
        @Override
        public void avaliarDesempenho() {
            System.out.println("Desempenho do desenvolvedor " + nome + " avaliado.");
        }
    
        @Override
        public void realizarTreinamento() {
            System.out.println("Treinamento realizado para o desenvolvedor " + nome);
        }
    }
    
    public class Analista extends Funcionario implements AvaliacaoDesempenho, Treinamento {
    
        public Analista(String nome, int idade, double salario) {
            super(nome, idade, salario);
        }
    
        @Override
        public double calcularBonusAnual() {
            return salario * 1.15; // 15% de bônus
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Analista: " + nome + ", Idade: " + idade + ", Salário: " + salario);
        }
    
        @Override
        public void avaliarDesempenho() {
            System.out.println("Desempenho do analista " + nome + " avaliado.");
        }
    
        @Override
        public void realizarTreinamento() {
            System.out.println("Treinamento realizado para o analista " + nome);
        }
    }
}
