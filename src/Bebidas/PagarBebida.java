package Bebidas;

import java.util.Scanner;

public class PagarBebida {
    private Scanner scanner;

    public PagarBebida() {
        scanner = new Scanner(System.in);
    }

    public void realizarPago(int precioTotal) {
        System.out.println("Precio total de las bebidas: " + precioTotal);
        System.out.print("Ingrese el monto del pago: ");
        int pago = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea después de leer el entero

        int cambio = pago - precioTotal;
        if (cambio >= 0) {
            System.out.println("¡¡ Pago realizado !!");
            System.out.println("Su cambio: " + cambio + " pesos");
        } else {
            System.out.println("¡¡ El pago no es suficiente !!");
            System.out.println("Faltan : " + Math.abs(cambio) +"Pesos");
        }
    }
}
