package semana4;

// Crear un programa que permita a un profesor ingresar calificaciones hasta que se ingrese un número negativo. 
// Al finalizar, mostrar la calificación más alta ingresada.
import java.util.Scanner;

public class Desafio7 {
    
    public static void main(String[] args){
        int masalta = 0;

        while(true){
            System.out.print("Ingrese la calificación (número negativo para salir): ");
            Scanner lector = new Scanner(System.in);
            int calificacion = lector.nextInt();
            lector.close();
            if ( calificacion > masalta ) {
                masalta = calificacion;
            }
            if ( calificacion < 0 ) {
                break;
            }
        }
        System.out.println("La calificación más alta es: " + masalta);
    }
}
