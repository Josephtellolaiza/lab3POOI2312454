package semana05;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        try {
            System.out.println("Ingrese un numero [1 - 10]: ");
             int N = scanner.nextInt();
             if(N >=2 && N <=20){
            for (int i = 1; i <= 10; i++) {          
                int resultado = N * i;
                System.out.println(N + " * " + i + " = " + resultado);
            }
             } else {
                 System.out.println("El numero ingresado esta fuera del rango permitido");
             }
        } catch (Exception ex) {
            System.out.println("Numero invalido. Debes ingresar numero entero.");
        }
    }
}