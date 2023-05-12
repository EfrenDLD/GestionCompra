package Bebidas;

public class CalculadoraPrecios {
    private RegistroBebidas registroBebidas;
    public void imprimirPrecioTotal() {
        int precioTotal = registroBebidas.calcularPrecioTotal();
        System.out.println("Precio total de las bebidas: " + precioTotal );
    }
}



