package Bebidas;

import java.util.ArrayList;
import java.util.Scanner;

public class RegistroBebidas {
    private ArrayList<Bebida> bebidas;
    private Scanner scanner;
    private PagarBebida pagarBebida;

    public RegistroBebidas() {
        bebidas = new ArrayList<>();
        scanner = new Scanner(System.in);
        pagarBebida = new PagarBebida();
    }

    public void elegirBebida() {
        System.out.println("+ + Menu Orden Bebidas+ + ");
        System.out.println("Ingrese la cantidad de bebidas: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n\nIngrese el nombre de la bebida: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la descripción de la bebida( Copa / Botella): ");
            String descripcion = scanner.nextLine();
            System.out.print("Ingrese el precio de la bebida: ");
            int precio = scanner.nextInt();
            scanner.nextLine();

            Bebida bebida = new Bebida(descripcion, nombre, precio);
            bebidas.add(bebida);
        }

        int precioTotal = calcularPrecioTotal();
        pagarBebida.realizarPago(precioTotal);
    }

    int  calcularPrecioTotal() {
        int precioTotal = 0;
        for (Bebida bebida : bebidas) {
            precioTotal += bebida.getPrecio();
        }

        return precioTotal;
    }
}
