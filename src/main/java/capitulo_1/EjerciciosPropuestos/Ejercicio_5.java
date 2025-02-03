package capitulo_1.EjerciciosPropuestos;

/*
* Dado un polinomio de segundo grado y = ax^2 + bx + c solicitar al usuario un programa que ingrese los
* valores de a, b, c, asi como el valor de x, y calcule el valor correspondiente de y
* */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double a = 0, b = 0, c = 0, x = 0, y = 0;

        while (true){
            System.out.println("ingrese el valor de a:");
            if(in.hasNextDouble()){
                a = in.nextDouble();
                break;
            }else{
                System.out.println("ERROR! Ingrese un número válido");
                in.next();
            }
        }

        while (true){
            System.out.println("ingrese el valor de b:");
            if(in.hasNextDouble()){
                b = in.nextDouble();
                break;
            }else{
                System.out.println("ERROR! Ingrese un número válido");
                in.next();
            }
        }

        while (true){
            System.out.println("ingrese el valor de c:");
            if(in.hasNextDouble()){
                c = in.nextDouble();
                break;
            }else{
                System.out.println("ERROR! Ingrese un número válido");
                in.next();
            }
        }

        while (true){
            System.out.println("ingrese el valor de x:");
            if(in.hasNextDouble()){
                x = in.nextDouble();
                break;
            }else{
                System.out.println("ERROR! Ingrese un número válido");
                in.next();
            }
        }

        y = a * (x * x) + b * x + c;

        System.out.println("El valor de y = " + y);
    }
}
