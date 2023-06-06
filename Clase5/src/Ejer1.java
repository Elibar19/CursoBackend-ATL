import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] arg) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int edad;
        System.out.print("Escriba la edad de su perro");
        edad = leer.nextInt();
        System.out.println("La edad de su perro en años de perros es: " + edad * 7+" años.");
    }
}

