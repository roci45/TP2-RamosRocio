package ar.edu.unju.fi.ejercicio5.main;


import ar.edu.unju.fi.ejercicio5.model.*;
import ar.edu.unju.fi.ejercicio5.interfaces.*;
import java.util.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> productos = new ArrayList<Producto>(); // Precarga tus productos aquí
        List<Producto> carrito = new ArrayList<Producto>(); // Para almacenar los productos seleccionados para la compra
        Pago pago;
        int opcion;

        do {
            System.out.println("\n\tMENÚ DE PRODUCTO");
            System.out.println("------------------------");
            System.out.println("1. Mostrar productos");
            System.out.println("2. Realizar compra");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    // Mostrar productos
                    break;
                case 2:
                    // Realizar compra
                    System.out.println("1. Pago efectivo");
                    System.out.println("2. Pago con tarjeta");
                    System.out.print("Seleccione una opción de pago: ");
                    int opcionPago = scanner.nextInt();
                    scanner.nextLine();

                    if (opcionPago == 1) {
                        pago = new PagoEfectivo();
                    } else {
                        pago = new PagoTarjeta();
                    }

                    double monto = 0;
                    for (Producto producto : carrito) {
                        monto += producto.getPrecio(); // Asegúrate de tener un método getPrecio() en tu clase Producto
                    }

                    pago.realizarPago(monto);
                    pago.imprimirRecibo();

                    break;
                case 3:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 3);

        scanner.close();
    }
}