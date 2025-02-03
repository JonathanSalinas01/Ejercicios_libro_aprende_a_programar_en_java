package capitulo_1.EjerciciosPropuestos;

/*
* Escribir un programa que tome como entrada un número entero y nos indique que cantidad hay que sumarle para
* que el resultado sea multiplo de 7
* */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int num = 0, i = 1;

        while (true){
            System.out.println("Ingrese un número entero:");
            if(in.hasNextInt()){
                num = in.nextInt();
                break;
            }else {
                System.out.println("Ingrese un número válido");
                in.next();
            }
        }

        if(num % 7 == 0){
            System.out.println("no se debe agregar ningun número");
        }else {
            while ((num + i) % 7 != 0){
                i++;
            }
            System.out.println("Se le deben sumar " +  i  + " números");
        }
    }
}
