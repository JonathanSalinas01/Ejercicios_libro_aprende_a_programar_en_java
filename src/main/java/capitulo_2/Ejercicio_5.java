package capitulo_2;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double num = 0;

        while (true) {
            System.out.println("Ingrese un numero para saber si es casi cero o no");
            if(in.hasNextDouble()){
                num = in.nextDouble();
                break;
            }else {
                System.out.println("ERROR! Ingrese un número válido!");
                in.next();
            }
        }
        in.close();

        if(num > -1 && num < 1){
            System.out.println("El número " + num + " es casi cero");
        }else{
            System.out.println("El nnúmero NO es casi cero");
        }
    }
}
