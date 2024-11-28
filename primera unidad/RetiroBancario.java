public class RetiroBancario {
    public static void main(String[] args) {

        double saldoInicial = 1000.0;

        double retiroSemanal = 200.0;

        int semanasEnMes = 4;


        double saldoFinal = saldoInicial - (retiroSemanal * semanasEnMes);

        System.out.println("Saldo inicial: $" + saldoInicial);
        System.out.println("Retiro semanal: $" + retiroSemanal);
        System.out.println("Saldo final después de " + semanasEnMes + " semanas: $" + saldoFinal);
    }
}
