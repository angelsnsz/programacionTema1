package Ejercicios_2;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int C=34;
        System.out.println((C > 0)? "El numero " + C + " es positivo" : "El numero " + C + " es negativo"  );
        System.out.println((C % 2== 0)? "El numero " + C + " es par " : "El numero " + C + " es impar");
        System.out.println((C % 5 == 0) ? "El numero " + C + " es multiplo de 5" : "El numero " + C + " no es multiplo de 5");
        System.out.println((C % 10 == 0) ? "El numero " + C + " es multiplo de 10 " : "El numero " + C + " no es multiplo de 10");
        System.out.println((C > 100) ? "El numero " + C + " es mayor que 100 " : "El numero " + C + " es menor que 100");
    }
}
