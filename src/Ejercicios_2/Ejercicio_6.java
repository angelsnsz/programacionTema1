package Ejercicios_2;

import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe un numero, por favor");
        int numero1= scanner.nextInt();
        System.out.println("Escribe un segundo numero, por favor");
        int numero2= scanner.nextInt();

        System.out.println("Tu primer numero es " + numero1 + " y tu segundo numero es " +numero2);
    }
}
