package semana3;

// Realizar un programa en el cual se ingrese un numero entero e informe si es par.
// En caso que no sea par también deberá informar al respecto.
import java.util.Scanner;

public class Desafio4 {
    
    public static void main(String[] args) {
        int numeroEntero;
        int resultado;

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        numeroEntero = lector.nextInt();
        lector.close();
        resultado = numeroEntero % 2;

        if ( resultado == 0 ) {
            System.out.print("El numero " + numeroEntero + " es par");
        } else if ( resultado == 1 ) {
            System.out.print("El numero " + numeroEntero + " no es par");
        }
    }
}
