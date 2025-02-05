package capitulo_1.EjerciciosPropuestos;

/*
* Un biólogo está realizando un estudio de distintas especies de invertebrados y
* necesita una aplicacion que le ayude a contabilizar el número de patas que tienen en
* total todos los animales capturados durante una jornada de trabajo. Para ello, nos ha solicitado
* que escribamos una aplicacion a la que hay que proporcionar:
*   -el número de hormigas capturadas (6 patas)
*   -el número de arañas capturadas (8 patas)
*   -el número de cochinillas capturadas (14 patas)
* La aplicacion debe mostrar el número total de patas que poseen todos los animales.
* */

import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        final int PATAS_HORMIGAS = 6;
        final int PATAS_ARANAS = 8;
        final int PATAS_COCHINILLAS = 14;

        Scanner in = new Scanner(System.in);
        int hormigas = 0, aranas = 0, cochinillas = 0, totalPatas = 0;

        while (true){
            System.out.println("Ingrese la cantidad de hormigas capturadas:");
            if(in.hasNextInt()){
                hormigas = in.nextInt();
                break;
            }else {
                System.out.println("ERROR! Ingrese un número de hormigas válido!");
                in.next();
            }
        }

        while (true){
            System.out.println("Ingrese la cantidad de arañas capturadas:");
            if(in.hasNextInt()){
                aranas = in.nextInt();
                break;
            }else {
                System.out.println("ERROR! Ingrese un número de arañas válido!");
                in.next();
            }
        }

        while (true){
            System.out.println("Ingrese la cantidad de cochinillas capturadas:");
            if(in.hasNextInt()){
                cochinillas = in.nextInt();
                break;
            }else {
                System.out.println("ERROR! Ingrese un número de cochinillas válido!");
                in.next();
            }
        }

        totalPatas = (hormigas * PATAS_HORMIGAS) + (aranas * PATAS_ARANAS) + (cochinillas * PATAS_COCHINILLAS);
        System.out.println("El total de patas entre todos los animales es de: " + totalPatas);
    }
}
