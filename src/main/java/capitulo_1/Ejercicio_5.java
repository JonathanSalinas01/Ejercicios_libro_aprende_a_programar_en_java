package capitulo_1;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nota1, nota2;
        double promedio;

        while(true){
            System.out.println("Ingrese la primer nota (número entero):");
            if(in.hasNextInt()){
                nota1 = in.nextInt();
                break;
            }else {
                System.out.println("ERROR! Ingrese una nota válida!");
                in.next();
            }
        }
        while(true) {
            System.out.println("Ingrese la segunda nota (número entero):");
            if (in.hasNextInt()) {
                nota2 = in.nextInt();
                break;
            } else {
                System.out.println("ERROR! Ingrese una nota válida!");
                in.next();
            }
        }
        in.close();

        promedio =  (nota1 + nota2) / 2.0;
        System.out.println("El promedio es: " + promedio);
    }
}
