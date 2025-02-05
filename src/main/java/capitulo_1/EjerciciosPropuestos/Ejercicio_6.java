package capitulo_1.EjerciciosPropuestos;

/*
* Solicitar al usuario que ingrese la cantidad de segundos. La aplicacion debe mostrar la cantidad de horas y minutos
* */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int segundos = 0, minutos = 0;
        double hora = 0;

        while(true){
            System.out.println("Ingrese la cantidad de segundos");
            if(in.hasNextInt()){
                segundos = in.nextInt();
                break;
            }else{
                System.out.println("Error!! Ingrese un número válido!");
                in.next();
            }
        }
        minutos = segundos /60;
        hora = minutos / 60.0;

        System.out.println(segundos + " segundos son : " + hora + " horas.");
        System.out.println(segundos + " segundos son : " + minutos + " minutos.");
    }
}
