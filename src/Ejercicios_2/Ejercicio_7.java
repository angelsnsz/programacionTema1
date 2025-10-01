package Ejercicios_2;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe una velocidad Km/h");

        int numero = scanner.nextInt();
        double velocidad = numero / 3.6;

        System.out.println("Tu velocidad en m/s es : " + velocidad);

    }
}
