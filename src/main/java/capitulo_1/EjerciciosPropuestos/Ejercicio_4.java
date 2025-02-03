package capitulo_1.EjerciciosPropuestos;

/*
* Realizar un programa que solicite la base y la altura de un triangulo y mustre su area
* */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double base = 0, altura = 0, area = 0;

        while (true){
            System.out.println("Ingrese la base del triangulo:");
            if(in.hasNextDouble()){
                base = in.nextDouble();
                break;
            }else {
                System.out.println("ERROR! Ingrese un valor válido");
                in.next();
            }
        }
        while (true){
            System.out.println("Ingrese la altura del triangulo:");
            if(in.hasNextDouble()){
                altura = in.nextDouble();
                break;
            }else {
                System.out.println("ERROR! Ingrese un valor válido");
                in.next();
            }
        }

        area = (base * altura) / 2;
        System.out.println("El area del triangulo es de : " + area);
    }
}
