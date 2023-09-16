package semana05;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int suma = 0;
        int contador = 0;
       
        int numero;
        do {
            System.out.print("Ingresa un número : ");
           
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
               
                if (numero > 0) {
                    suma += numero;
                    contador++;
                } else if (numero < 0 && numero != -1) {
                    System.out.println("Dato ingresado no válido.");
                }
            } else {
                System.out.println("Dato ingresado no válido. Debes ingresar un número positivo ");
                sc.next(); // Limpiar el búfer de entrada
                numero = 0; // Restablecer el valor de numero para evitar un bucle infinito
            }
        } while (numero != -1);
       
        sc.close();
       
        if (contador > 0) {
            double promedio = (double) suma / contador;
            System.out.println("La suma total de los " + contador + " números ingresados es " + suma);
            System.out.printf("El promedio de los " + contador + " números ingresados es %.2f%n", promedio);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }
    }
}