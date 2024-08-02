package Exercicio 5;

public class Questao1 {
    public enum TipoRefeicao {
        ENTRADA, PRATO_PRINCIPAL, SOBREMESA;
    }

    public abstract class Refeicao {
        protected String nome;
        protected double preco;
    
        public Refeicao(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }
    
        public abstract double calcularValorTotal();
        public abstract void imprimirDetalhes();
    }
    
    public interface Desconto {
        double aplicarDesconto(double valor);
    }
    
    public interface OfertaEspecial {
        void aplicarOfertaEspecial();
    }

    public class Entrada extends Refeicao implements Desconto, OfertaEspecial {

        public Entrada(String nome, double preco) {
            super(nome, preco);
        }
    
        @Override
        public double calcularValorTotal() {
            return preco;
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Entrada: " + nome + ", Preço: " + preco);
        }
    
        @Override
        public double aplicarDesconto(double valor) {
            return valor * 0.9; // 10% de desconto
        }
    
        @Override
        public void aplicarOfertaEspecial() {
            System.out.println("Oferta especial aplicada para a entrada " + nome);
        }
    }
    
    public class PratoPrincipal extends Refeicao implements Desconto, OfertaEspecial {
    
        public PratoPrincipal(String nome, double preco) {
            super(nome, preco);
        }
    
        @Override
        public double calcularValorTotal() {
            return preco;
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Prato Principal: " + nome + ", Preço: " + preco);
        }
    
        @Override
        public double aplicarDesconto(double valor) {
            return valor * 0.85; // 15% de desconto
        }
    
        @Override
        public void aplicarOfertaEspecial() {
            System.out.println("Oferta especial aplicada para o prato principal " + nome);
        }
    }
    
    public class Sobremesa extends Refeicao implements Desconto, OfertaEspecial {
    
        public Sobremesa(String nome, double preco) {
            super(nome, preco);
        }
    
        @Override
        public double calcularValorTotal() {
            return preco;
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Sobremesa: " + nome + ", Preço: " + preco);
        }
    
        @Override
        public double aplicarDesconto(double valor) {
            return valor * 0.8; // 20% de desconto
        }
    
        @Override
        public void aplicarOfertaEspecial() {
            System.out.println("Oferta especial aplicada para a sobremesa " + nome);
        }
    }        
}
