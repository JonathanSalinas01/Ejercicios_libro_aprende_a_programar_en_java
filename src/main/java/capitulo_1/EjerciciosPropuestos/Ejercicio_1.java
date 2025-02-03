package capitulo_1.EjerciciosPropuestos;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double iva = 0, baseImponible = 0, total = 0;

        while (true){
            System.out.println("Ingrese el  valor del IVA:");
            if(in.hasNextDouble()){
                iva = in.nextDouble();
                break;
            }else {
                System.out.println("ERROR! Ingrese un valor válido!");
                in.next();
            }
        }

        while (true){
            System.out.println("Ingrese el valor de la base imponible:");
            if(in.hasNextDouble()){
                baseImponible = in.nextDouble();
                break;
            }else {
                System.out.println("ERROR! Ingrese un valor válido!");
                in.next();
            }
        }
        in.close();

        total = baseImponible + (baseImponible * (iva / 100));
        System.out.println("El valor del producto es de: $" + baseImponible);
        System.out.println("El valor del IVA es del: " + iva + "%");
        System.out.println("El precio final del producto con IVA es de: " + total);
    }
}
