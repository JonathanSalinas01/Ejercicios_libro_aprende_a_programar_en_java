package capitulo_1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double precioManzanas = 0, precioPeras = 0;
        double manzanas[] = new double[4];
        double peras[] = new double[4];
        double totalManzanas = 0, totalPeras = 0;

        while (true){
            System.out.println("Ingrese el precio de las manzanas:");
            if (in.hasNextDouble()){
                precioManzanas = in.nextDouble();
                break;
            }else{
                System.out.println("Error! ingrese un precio válido!");
                in.next();
            }
        }

        while (true){
            System.out.println("Ingrese el precio de las peras:");
            if (in.hasNextDouble()){
                precioPeras = in.nextDouble();
                break;
            }else{
                System.out.println("Error! ingrese un precio válido!");
                in.next();
            }
        }

        for(int i = 0; i < manzanas.length; i++){
            System.out.println("Ingrese los kilos de manzanas vendidos en el " + (i + 1) + " trimestre:");
            while (true){
                if(in.hasNextDouble()){
                    manzanas[i] = in.nextDouble();
                    break;
                }else{
                    System.out.println("ERROR! Ingrese un numero de kilos válido");
                    in.next();
                }
            }
        }
        for(int i = 0; i < peras.length; i++){
            System.out.println("Ingrese los kilos de peras vendidos en el " + (i + 1) + " trimestre:");
            while (true){
                if(in.hasNextDouble()){
                    peras[i] = in.nextDouble();
                    break;
                }else{
                    System.out.println("ERROR! Ingrese un numero de kilos válido");
                    in.next();
                }
            }
        }

        for (int i = 0; i < manzanas.length; i++){
            totalManzanas = totalManzanas + (manzanas[i] * precioManzanas);
        }
        for (int i = 0; i < peras.length; i++){
            totalPeras = totalPeras + (peras[i] * precioPeras);
        }

        System.out.println("El precio total de manzanas obtenido durante el año fue de " + totalManzanas);
        System.out.println("El precio total de peras obtenido durante el año fue de " + totalPeras);
    }
}
