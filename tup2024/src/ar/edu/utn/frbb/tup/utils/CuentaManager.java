package ar.edu.utn.frbb.tup.utils;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CuentaManager {
    private Scanner scanner = new Scanner(System.in);

    public Cuenta crearCuenta() {
        Cuenta cuenta = new Cuenta();

        System.out.println("Ingrese el nombre de la cuenta:");
        String nombre = scanner.nextLine();
        cuenta.setNombre(nombre);

        System.out.println("Ingrese el balance inicial de la cuenta:");
        double balance = scanner.nextDouble();
        cuenta.setBalance(balance);

        cuenta.setFechaCreacion(LocalDateTime.now());

        return cuenta;
    }
}
