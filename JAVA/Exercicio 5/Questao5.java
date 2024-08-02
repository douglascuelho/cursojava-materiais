package Exercicio 5;

public class Questao5 {
    public enum TipoProduto {
        ELETRONICOS, ROUPAS, ALIMENTOS;
    }

    public abstract class Produto {
        protected String nome;
        protected double preco;
        protected int quantidadeEmEstoque;
    
        public Produto(String nome, double preco, int quantidadeEmEstoque) {
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }
    
        public abstract double calcularValorTotalEstoque();
        public abstract void imprimirDetalhes();
    }

    public interface Desconto {
        double aplicarDesconto(double valor);
    }
    
    public interface Frete {
        double calcularFrete(double peso, String destino);
    }
    
    public class Eletronico extends Produto implements Desconto, Frete {

        public Eletronico(String nome, double preco, int quantidadeEmEstoque) {
            super(nome, preco, quantidadeEmEstoque);
        }
    
        @Override
        public double calcularValorTotalEstoque() {
            return preco * quantidadeEmEstoque;
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Eletrônico: " + nome + ", Preço: " + preco + ", Quantidade em Estoque: " + quantidadeEmEstoque);
        }
    
        @Override
        public double aplicarDesconto(double valor) {
            return valor * 0.9; // 10% de desconto
        }
    
        @Override
        public double calcularFrete(double peso, String destino) {
            return peso * 10; // Cálculo fictício de frete
        }
    }
    
    public class Roupa extends Produto implements Desconto, Frete {
    
        public Roupa(String nome, double preco, int quantidadeEmEstoque) {
            super(nome, preco, quantidadeEmEstoque);
        }
    
        @Override
        public double calcularValorTotalEstoque() {
            return preco * quantidadeEmEstoque;
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Roupa: " + nome + ", Preço: " + preco + ", Quantidade em Estoque: " + quantidadeEmEstoque);
        }
    
        @Override
        public double aplicarDesconto(double valor) {
            return valor * 0.85; // 15% de desconto
        }
    
        @Override
        public double calcularFrete(double peso, String destino) {
            return peso * 5; // Cálculo fictício de frete
        }
    }
    
    public class Alimento extends Produto implements Desconto, Frete {
    
        public Alimento(String nome, double preco, int quantidadeEmEstoque) {
            super(nome, preco, quantidadeEmEstoque);
        }
    
        @Override
        public double calcularValorTotalEstoque() {
            return preco * quantidadeEmEstoque;
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Alimento: " + nome + ", Preço: " + preco + ", Quantidade em Estoque: " + quantidadeEmEstoque);
        }
    
        @Override
        public double aplicarDesconto(double valor) {
            return valor * 0.8; // 20% de desconto
        }
    
        @Override
        public double calcularFrete(double peso, String destino) {
            return peso * 2; // Cálculo fictício de frete
        }
    }    
}
