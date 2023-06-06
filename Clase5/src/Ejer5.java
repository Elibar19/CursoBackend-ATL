import java.util.Random;
import java.util.Scanner;

public class Ejer5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Random rd = new Random();
        /*int numAleatorio = (int)(Math.random()*100+1);*/
        int numAleatorio = rd.nextInt(1, 100);
        int numero = 0;
        System.out.println(numAleatorio);
        System.out.println("A continuacion deberá adivinar un numero aleatorio entero");

        do {
            System.out.println("Adivine el numero: ");
            numero = leer.nextInt();
            if (numero != numAleatorio) {
                System.out.println("No has adivinado. Intente de nuevo");
            } else {
                System.out.println("Has adivinado!");
            }
        } while (numero != numAleatorio);
    }
}
