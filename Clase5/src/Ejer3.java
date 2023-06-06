import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el precio original del producto: ");
        double precioOriginal = leer.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento que tiene el producto: ");
        double descuento = leer.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("El precio final es: $" + precioFinal);
    }
}
