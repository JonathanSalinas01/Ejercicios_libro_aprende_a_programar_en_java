package capitulo_1;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int edad;
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Ingrese su edad:");
            if(in.hasNextInt()){
                edad = in.nextInt();
                break;
            }else {
                System.out.println("ERROR!!! Ingrese una edad válida!");
                in.next();
            }
        }
        in.close();
        System.out.println("El próximo año usted tendrá " + (edad + 1) + " años");
    }
}
