package capitulo_1;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double num;
        int redondeado;

        while (true){
            System.out.println("Ingrese un  número decimal");
            if(in.hasNextDouble()){
                num = in.nextDouble();
                break;
            }else {
                System.out.println("ERROR! Ingrese un numero decimal válido!");
                in.next();
            }
        }
        in.close();

        redondeado = (int) Math.round(num);
        System.out.println("El numero ingresado cuandose redondea es: " + redondeado);
    }
}
