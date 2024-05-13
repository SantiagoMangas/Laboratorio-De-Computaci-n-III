package ar.edu.utn.frbb.tup;

import ar.edu.utn.frbb.tup.utils.Cliente;
import ar.edu.utn.frbb.tup.utils.Cuenta;
import ar.edu.utn.frbb.tup.utils.CuentaManager;
import ar.edu.utn.frbb.tup.utils.TipoOperacion;
import ar.edu.utn.frbb.tup.utils.Operaciones;

import java.util.Scanner;

public class MenuInputProcessor extends BaseInputProcessor {
    private ClienteInputProcessor clienteInputProcessor = new ClienteInputProcessor();
    private CuentaManager cuentaManager = new CuentaManager();
    private boolean exit = false;

    public void renderMenu(Banco banco) {
        while (!exit) {
            System.out.println("Bienvenido a la aplicación de Banco!");
            System.out.println("1. Crear un nuevo Cliente");
            System.out.println("2. Crear una nueva Cuenta");
            System.out.println("3. Generar un movimiento");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    Cliente cliente = clienteInputProcessor.ingresarCliente();
                    banco.getClientes().add(cliente);
                    break;
                case 2:
                    Cuenta cuenta = cuentaManager.crearCuenta();
                    banco.getCuentas().add(cuenta);
                    break;
                case 3:
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor seleccione 1-2-4.");
            }
            clearScreen();
        }
    }
}
