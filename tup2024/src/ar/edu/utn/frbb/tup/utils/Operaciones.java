package ar.edu.utn.frbb.tup.utils;

public class Operaciones {
    public static void depositar(SimpleAdder saldo, double monto) {
        saldo.setSumaHistorica((int) (saldo.getSumaHistorica() + monto)); //converti el valor double a int antes de pasarlo al método setSumaHistorica
    }

    public static void retirar(SimpleAdder saldo, double monto) {
        saldo.setSumaHistorica((int) (saldo.getSumaHistorica() - monto));
    }

    public static void transferir(SimpleAdder origen, SimpleAdder destino, double monto) {
        retirar(origen, monto);
        depositar(destino, monto);
    }

    public static double consultarSaldo(SimpleAdder saldo) {
        return saldo.getSumaHistorica();
    }
}
