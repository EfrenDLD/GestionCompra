package Comidas;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistrarComida{
    private ArrayList<Comida> comidas;
    private Scanner scanner;
    private PagarComidas pagarComidas;

    public RegistrarComida() {
        comidas = new ArrayList<>();
        scanner = new Scanner(System.in);
        pagarComidas = new PagarComidas();
    }
        public void elegirComida() {
            System.out.println("+ + Menu Orden de Comida + + ");
            System.out.println("Ingrese la cantidad de comida: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < cantidad; i++) {
                System.out.println("\t Ingrese el nombre de la Comida: ");
                String nombre = scanner.nextLine();
                System.out.print("Ingrese la descripción de la Comida: ");
                String descripcion = scanner.nextLine();
                System.out.print("Ingrese el precio de la Comida: ");
                int precio = scanner.nextInt();
                scanner.nextLine();

                Comida comida = new Comida(nombre, descripcion, precio);
                comidas.add(comida);
            }

            int precioTotal = calcularPrecioTotal();
            pagarComidas.realizarPago(precioTotal);
        }

    int  calcularPrecioTotal() {
        int precioTotal = 0;
        for (Comida comida : comidas) {
            precioTotal += comida.getPrecio();
        }
        return precioTotal;
    }
}

