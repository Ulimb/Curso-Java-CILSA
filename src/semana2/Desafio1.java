package semana2;

// Desarrollar un programa que permita ingresar 2 números, cada uno en una variable.
// Mostrar el resultado de la suma de esos numeros.

import java.util.Scanner;

public class Desafio1 {

    public static void main(String[] args) {

        int numero1;

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        numero1 = lector.nextInt(); 
        System.out.print("Ingrese el segundo número: ");
        int numero2 = lector.nextInt(); 
        lector.close(); 

        System.out.println("Sumo el " + numero1 + " con el " + numero2 + " y el resultado es: " + (numero1 + numero2));
    }
}