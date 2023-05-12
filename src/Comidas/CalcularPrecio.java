package Comidas;
public class CalcularPrecio {
    private RegistrarComida registrarComida;
    public void imprimirPrecioTotal() {
        int precioTotal = registrarComida.calcularPrecioTotal();
        System.out.println("Precio total de las bebidas: " + precioTotal );
    }
}
