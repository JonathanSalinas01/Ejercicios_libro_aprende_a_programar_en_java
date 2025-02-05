package capitulo_2;

/*
* Diseñar una aplicacion que solicite al usuario un número e indique si es par o impar
* */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        int num = 0;

        while (true){
            System.out.println("Ingrese un número entero:");
            if(in.hasNextInt()){
                num = in.nextInt();
                break;
            }else {
                System.out.println("ERROR! Ingrese un número válido!");
                in.next();
            }
        }

        if(num % 2 == 0){
            System.out.println("El número " + num + " es par");
        }else {
            System.out.println("El número " + num + " es impar");
        }
    }
}
