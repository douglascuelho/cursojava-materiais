package Exercicio 5;

public class Questao3 {
    public enum GeneroLivro {
        FICCAO, NAO_FICCAO, CIENTIFICO;
    }

    public abstract class ItemBiblioteca {
        protected String titulo;
        protected String autor;
        protected int anoPublicacao;
    
        public ItemBiblioteca(String titulo, String autor, int anoPublicacao) {
            this.titulo = titulo;
            this.autor = autor;
            this.anoPublicacao = anoPublicacao;
        }
    
        public abstract double calcularMultaAtraso(int diasAtraso);
        public abstract void imprimirDetalhes();
    }

    public interface Emprestimo {
        void emprestar();
        void devolver();
    }

    public class Livro extends ItemBiblioteca implements Emprestimo {

        public Livro(String titulo, String autor, int anoPublicacao) {
            super(titulo, autor, anoPublicacao);
        }
    
        @Override
        public double calcularMultaAtraso(int diasAtraso) {
            return diasAtraso * 1.5; // Multa de 1.5 por dia de atraso
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Livro: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao);
        }
    
        @Override
        public void emprestar() {
            System.out.println("Livro " + titulo + " emprestado.");
        }
    
        @Override
        public void devolver() {
            System.out.println("Livro " + titulo + " devolvido.");
        }
    }
    
    public class Revista extends ItemBiblioteca implements Emprestimo {
    
        public Revista(String titulo, String autor, int anoPublicacao) {
            super(titulo, autor, anoPublicacao);
        }
    
        @Override
        public double calcularMultaAtraso(int diasAtraso) {
            return diasAtraso * 1.0; // Multa de 1.0 por dia de atraso
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Revista: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao);
        }
    
        @Override
        public void emprestar() {
            System.out.println("Revista " + titulo + " emprestada.");
        }
    
        @Override
        public void devolver() {
            System.out.println("Revista " + titulo + " devolvida.");
        }
    }
    
    public class DVD extends ItemBiblioteca implements Emprestimo {
    
        public DVD(String titulo, String autor, int anoPublicacao) {
            super(titulo, autor, anoPublicacao);
        }
    
        @Override
        public double calcularMultaAtraso(int diasAtraso) {
            return diasAtraso * 2.0; // Multa de 2.0 por dia de atraso
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("DVD: " + titulo + ", Diretor: " + autor + ", Ano: " + anoPublicacao);
        }
    
        @Override
        public void emprestar() {
            System.out.println("DVD " + titulo + " emprestado.");
        }
    
        @Override
        public void devolver() {
            System.out.println("DVD " + titulo + " devolvido.");
        }
    }
}
