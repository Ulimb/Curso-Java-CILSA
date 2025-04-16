package semana3;

// Realizar un programar en el cual se ingrese:
// 1) el limite inferior de un intervalo
// 2) el limite superior del mismo intervalo
// 3) Un valor entero
// Indicar si el valor entero ingresado en el punto 3 se encuentra dentro del intervalo definido por los valores del punto (1) y del punto (2).
import java.util.Scanner;

public class Desafio6 {
    
    public static void main(String[] args) {
        int limiteInferior;
        int limiteSuperior;
        int valorEntero;

        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el limite inferior del intervalo: ");
        limiteInferior = lector.nextInt();
        System.out.print("Ingrese el limite superior del intervalo: ");
        limiteSuperior = lector.nextInt();
        System.out.print("Ingrese un valor entero: ");
        valorEntero = lector.nextInt();
        lector.close();

        if (valorEntero >= limiteInferior && valorEntero <= limiteSuperior) {
            System.out.print("El valor " + valorEntero + " se encuentra dentro del intervalo [" + limiteInferior + ", " + limiteSuperior + "]");
        } else {
            System.out.print("El valor " + valorEntero + " no se encuentra dentro del intervalo [" + limiteInferior + ", " + limiteSuperior + "]");
            }
        }
}
