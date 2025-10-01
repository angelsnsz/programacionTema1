package Ejercicios_2;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un numero, por favor");
        int numero = scanner.nextInt();
        int numero2 = numero * 2;
        int numero3 = numero * 3;
        System.out.println("El doble de tu numero es : " + numero2 + " Y el triple de tu numero es : " + numero3);
    }
}
