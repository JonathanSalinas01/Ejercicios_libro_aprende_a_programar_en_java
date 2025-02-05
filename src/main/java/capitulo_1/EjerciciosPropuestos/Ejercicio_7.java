package capitulo_1.EjerciciosPropuestos;

/*
* Solicitar al ususario 3 distancias:
*   -La primera en milímetros
*   -La segunda en centimetros
*   -La tercera en metros
* Diseñar un programa que muestre la suma de las tres distancias medidas en centimetros
* */

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double milimetros = 0, centimetros = 0, metros = 0, total = 0;
        double milimetrosAcentimetro = 0, metrosAcentimetro = 0;

        while(true){
            System.out.println("Ingrese la primer distancia (milímetros):");
            if(in.hasNextDouble()){
                milimetros = in.nextDouble();
                break;
            }else {
                System.out.println("ERROR! Ingrese una distancia válida!");
                in.next();
            }
        }

        while(true){
            System.out.println("Ingrese la segunda distancia (centímetros):");
            if(in.hasNextDouble()){
                centimetros = in.nextDouble();
                break;
            }else {
                System.out.println("ERROR! Ingrese una distancia válida!");
                in.next();
            }
        }

        while(true){
            System.out.println("Ingrese la tercer distancia (metros):");
            if(in.hasNextDouble()){
                metros = in.nextDouble();
                break;
            }else {
                System.out.println("ERROR! Ingrese una distancia válida!");
                in.next();
            }
        }

        milimetrosAcentimetro = milimetros / 10.0;
        metrosAcentimetro = metros * 100.0;
        total = centimetros + milimetrosAcentimetro +metrosAcentimetro;

        System.out.println(milimetros + " milimetros son: " + milimetrosAcentimetro + " centimetros");
        System.out.println(metros + " metros son: " + metrosAcentimetro + " centimetros");
        System.out.println("La distancia total en centimetros es de " + total + " centimetros");
    }
}
