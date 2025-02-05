package capitulo_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] numeros = new Integer[3];

        // Solicitar los números al usuario
        System.out.println("Ingrese tres números:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenar los números de mayor a menor
        Arrays.sort(numeros, Collections.reverseOrder());

        // Mostrar los números ordenados
        System.out.println("Números ordenados de mayor a menor:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
