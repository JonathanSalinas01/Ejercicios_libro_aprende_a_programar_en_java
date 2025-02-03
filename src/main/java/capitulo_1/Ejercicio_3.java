package capitulo_1;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anioNacimiento, anioActual, edad;

        while (true){
            System.out.println("Ingrese su año de nacimiento:");
            if(in.hasNextInt()){
                anioNacimiento = in.nextInt();
                break;
            }else{
                System.out.println("ERROR! Ingrese un año válido!");
                in.next();
            }
        }

        while (true){
            System.out.println("Ingrese el año actual:");
            if(in.hasNextInt()){
                anioActual = in.nextInt();
                break;
            }else{
                System.out.println("ERROR! Ingrese un año válido!");
                in.next();
            }
        }
        in.close();

        edad = anioActual - anioNacimiento;
        System.out.println("Su edad es: " + edad);
    }
}
