import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese el total de la cuenta: ");
        double totalCuenta = leer.nextDouble();
        System.out.println("Ingrese el porcentaje de propina que desea dejar: ");
        double procentajePropina = leer.nextDouble();

        double propina = totalCuenta * (procentajePropina / 100);

        System.out.println("La propina que debe dejar es: $" + propina);
    }
}
