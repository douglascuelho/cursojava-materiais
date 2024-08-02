package Exercicio 5;

public class Questao4 {
    public enum TipoTransporte {
        ONIBUS, TREM, METRO;
    }

    public abstract class Transporte {
        protected int numeroAssentos;
        protected int capacidade;
        protected double tarifa;
    
        public Transporte(int numeroAssentos, int capacidade, double tarifa) {
            this.numeroAssentos = numeroAssentos;
            this.capacidade = capacidade;
            this.tarifa = tarifa;
        }
    
        public abstract double calcularTarifaTotal(int passageiros);
        public abstract void imprimirDetalhes();
    }

    public interface Manutencao {
        void realizarManutencao();
    }
    
    public interface HorarioFuncionamento {
        void definirHorarioFuncionamento(String horario);
    }

    public class Onibus extends Transporte implements Manutencao, HorarioFuncionamento {

        public Onibus(int numeroAssentos, int capacidade, double tarifa) {
            super(numeroAssentos, capacidade, tarifa);
        }
    
        @Override
        public double calcularTarifaTotal(int passageiros) {
            return passageiros * tarifa;
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Ônibus: Assentos: " + numeroAssentos + ", Capacidade: " + capacidade + ", Tarifa: " + tarifa);
        }
    
        @Override
        public void realizarManutencao() {
            System.out.println("Manutenção realizada no ônibus.");
        }
    
        @Override
        public void definirHorarioFuncionamento(String horario) {
            System.out.println("Horário de funcionamento do ônibus: " + horario);
        }
    }
    
    public class Trem extends Transporte implements Manutencao, HorarioFuncionamento {
    
        public Trem(int numeroAssentos, int capacidade, double tarifa) {
            super(numeroAssentos, capacidade, tarifa);
        }
    
        @Override
        public double calcularTarifaTotal(int passageiros) {
            return passageiros * tarifa;
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Trem: Assentos: " + numeroAssentos + ", Capacidade: " + capacidade + ", Tarifa: " + tarifa);
        }
    
        @Override
        public void realizarManutencao() {
            System.out.println("Manutenção realizada no trem.");
        }
    
        @Override
        public void definirHorarioFuncionamento(String horario) {
            System.out.println("Horário de funcionamento do trem: " + horario);
        }
    }
    
    public class Metro extends Transporte implements Manutencao, HorarioFuncionamento {
    
        public Metro(int numeroAssentos, int capacidade, double tarifa) {
            super(numeroAssentos, capacidade, tarifa);
        }
    
        @Override
        public double calcularTarifaTotal(int passageiros) {
            return passageiros * tarifa;
        }
    
        @Override
        public void imprimirDetalhes() {
            System.out.println("Metrô: Assentos: " + numeroAssentos + ", Capacidade: " + capacidade + ", Tarifa: " + tarifa);
        }
    
        @Override
        public void realizarManutencao() {
            System.out.println("Manutenção realizada no metrô.");
        }
    
        @Override
        public void definirHorarioFuncionamento(String horario) {
            System.out.println("Horário de funcionamento do metrô: " + horario);
        }
    }    
}
