package semana4;

// Desarrolla un programa que permita a un usuario ingresar un conjunto de calificaciones y calcule su promedio utilizando un bucle FOR.
// El programa debe solicitar al usuario que ingrese la cantidad de calificaciones que desea promediar y luego ingresar cada una de ellas.
import java.util.Scanner;
public class Desafio8 {
    
    public static void main(String[] args) {
        float suma = 0;
        float promedio = 0;
        float calificacion = 0;
        int i;
        
        System.out.print("Ingrese la cantidad de calificaciones a promediar: ");
        Scanner lector = new Scanner(System.in);
        int cantidad = lector.nextInt();
        
        
        for ( i = 1; i <= cantidad; i++ ) {
            System.out.print("Ingrese la calificacion " + i + ": ");
            calificacion = lector.nextInt();
            suma = suma + calificacion;
        }
        lector.close();
        promedio = (suma / cantidad);
        System.out.println("El promedio de las calificaciones es: " + promedio);
    }
}
