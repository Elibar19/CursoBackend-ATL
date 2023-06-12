import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[5];
        int numMayor = 0;
        int numMenor = 0;
        int promedio = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            numeros[i] = leer.nextInt();

            if (numeros[i] > numMayor) {
                numMayor = numeros[i];
            }
            if (i == 0) {
                numMenor = numeros[i];
            }
            if (numeros[i] < numMenor) {
                numMenor = numeros[i];
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            promedio += numeros[i];
        }
        System.out.println("Los numeros ingresados son:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[" + numeros[i] + "]");
        }
        System.out.println();
        System.out.println("El numero mayor es: " + numMayor);
        System.out.println("El numero menor es: " + numMenor);
        System.out.println("El promedio de los numeros es: " + promedio / numeros.length);
    }
}