package semana3;

// Realizar un programa en el cual se ingresen dos numeros e informe si el primero es múltiplo del segundo.
// En caso contrario deberá generar un mensaje adecuado.

import java.util.Scanner;

public class Desafio5 {
    
    public static void main(String[] args) {

        int numero1;
        int numero2;
        int resultado;

        Scanner lector = new Scanner (System.in);
        System.out.print("Ingrese el primer numero: ");
        numero1 = lector.nextInt();
        System.out.print("Ingrese el segundo numero:");
        numero2 = lector.nextInt();
        lector.close();

        resultado = (numero1 % numero2);
        if ( resultado == 0) {
            System.out.print("El numero " + numero1 + " es multiplo de " + numero2);
        } else if ( resultado != 0) {
            System.out.print("El numero " + numero1 + " no es multiplo de " + numero2);
        }
    }
}
