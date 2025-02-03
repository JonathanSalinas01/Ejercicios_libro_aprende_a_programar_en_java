package capitulo_1.EjerciciosPropuestos;

/*
* Modificar el ejercicio anterior para que, inicando dos numeros enteros n y m, nos diga que cantidad hay que sumarle a
* n para que sea múltiplo de m
* */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int n = 0, m = 0, i = 1;

        while (true){
            System.out.println("Ingrese el primer número entero:");
            if(in.hasNextInt()){
                n = in.nextInt();
                break;
            }else {
                System.out.println("Ingrese un número válido");
                in.next();
            }
        }

        while (true){
            System.out.println("Ingrese el segundo número entero:");
            if(in.hasNextInt()){
                m = in.nextInt();
                break;
            }else {
                System.out.println("Ingrese un número válido");
                in.next();
            }
        }

        if(n % m == 0){
            System.out.println("no se debe agregar ningun número");
        }else {
            while ((n + i) % m != 0){
                i++;
            }
            System.out.println("Se le deben sumar " +  i  + " números");
        }
    }
}
