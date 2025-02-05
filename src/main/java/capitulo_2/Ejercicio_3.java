package capitulo_2;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        while (true){
            System.out.println("Ingrese el primer número entero:");
            if(in.hasNextInt()){
                num1 = in.nextInt();
                break;
            }else{
                System.out.println("ERROR! Ingresa un número válido!");
                in.next();
            }
        }

        while (true){
            System.out.println("Ingrese el segundo número entero:");
            if(in.hasNextInt()){
                num2 = in.nextInt();
                break;
            }else{
                System.out.println("ERROR! Ingresa un número válido!");
                in.next();
            }
        }

        if(num1 > num2){
            System.out.println("El número " + num1 + " es mayor a " + num2);
        }else {
            System.out.println("El número " + num2 + " es mayor a " + num1);
        }
    }
}
