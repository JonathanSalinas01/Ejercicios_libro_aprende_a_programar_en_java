package capitulo_1;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        int nota1, nota2, nota3;
        double promedio;
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("Ingrese la primer nota (puede ser decimal):");
            if(in.hasNextInt()){
                nota1 = in.nextInt();
                break;
            }else{
                System.out.println("ERROR! Ingrese un número válido!");
                in.next();
            }
        }

        while (true){
            System.out.println("Ingrese la segunda nota (puede ser decimal):");
            if(in.hasNextInt()){
                nota2 = in.nextInt();
                break;
            }else{
                System.out.println("ERROR! Ingrese un número válido!");
                in.next();
            }
        }

        while (true){
            System.out.println("Ingrese la tercera nota (puede ser decimal):");
            if(in.hasNextInt()){
                nota3 = in.nextInt();
                break;
            }else{
                System.out.println("ERROR! Ingrese un número válido!");
                in.next();
            }
        }
        in.close();
        promedio = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("El promedio es de: " + promedio);
    }
}
