package capitulo_2;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        while (true){
            System.out.println("Ingrese el primer número entero:");
            if(in.hasNextInt()){
                num1 = in.nextInt();
                break;
            }else {
                System.out.println("ERROR! Ingrese un número válido!");
                in.next();
            }
        }

        while (true){
            System.out.println("Ingrese el segundo número entero:");
            if(in.hasNextInt()){
                num2 = in.nextInt();
                break;
            }else {
                System.out.println("ERROR! Ingrese un número válido!");
                in.next();
            }
        }
        in.close();

        if (num1 == num2){
            System.out.println("Los números son iguales");
        }else {
            System.out.println("Los numeros son diferentes");
        }
    }
}
