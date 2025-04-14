package semana2;

import java.util.Scanner;

//A partir del desafio 2, se pide leer desde teclado dos numero enteros.
//Con esos numeros, realizar las siguientes operaciones e informar su resultado:
//a. suma
//b. resta
//c. multiplicación
//d. división
//e. un numero es divisible por otro

public class Desafio3 {

    public static void main(String[] args) {

        int numero1;
        int numero2;

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        numero1 = lector.nextInt(); 
        System.out.print("Ingrese el segundo número: ");
         numero2 = lector.nextInt(); 
        lector.close(); 

        System.out.println("Sumo el " + numero1 + " con el " + numero2 + " y el resultado es: " + (numero1 + numero2));
        System.out.println("Resto el " + numero1 + " con el " + numero2 + " y el resultado es: " + (numero1 - numero2));
        System.out.println("Multiplico el " + numero1 + " con el " + numero2 + " y el resultado es: " + (numero1 * numero2));
        System.out.println("Divido el " + numero1 + " con el " + numero2 + " y el resultado es: " + (numero1 / numero2));
        System.out.println("El resto de dividir " + numero1 + " con el " + numero2 + " y el resultado es: " + (numero1 % numero2));
    }
}