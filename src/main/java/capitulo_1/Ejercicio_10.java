package capitulo_1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        final double PI = Math.PI;
        double radio = 0, longitud = 0, area = 0;

        while (true){
            System.out.println("Ingrese el radio de la circunferencia en centimetros:");
            if(in.hasNextDouble()){
                radio = in.nextDouble();
                break;
            }else{
                System.out.println("Ingrese un valor válido");
                in.next();
            }
        }

        longitud = (2 * PI) * radio;
        area = PI * (radio * radio);

        System.out.println("La longitud de la circunferencia es de: " + longitud + " centímetros");
        System.out.println("El area de la circunferencia es de: " + area + " centimetros cuadrados");
    }
}
