import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una distancia en millas: ");
        double millas = leer.nextDouble();
        System.out.println("La distancia en kilometros es: " + millas * 1.60934);

    }
}
