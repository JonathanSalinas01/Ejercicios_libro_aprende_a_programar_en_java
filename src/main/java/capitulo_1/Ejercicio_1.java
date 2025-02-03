package capitulo_1;

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;

        while (true) {
            System.out.println("Ingrese un número entero:");
            if(in.hasNextInt()){// pregunta si el numero ingresado es entero (devuelve true o false)
                num = in.nextInt(); //asigna el numero ingresado
                break;
            }else {
                System.out.println("ERROR! Debe ingresar un numero entero!!!");
                in.next();//limpia el cacche del Scanner y permite ingresar otro numero
            }
        }
        in.close(); // Se cierra el scanner para no consumir recursos
        System.out.println("El número es ingresado es: " + num);
    }
}
