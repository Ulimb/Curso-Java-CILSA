package semana5;

// Retomar el ejercicio del desafío anterior pero solo cargar en la estructura aquellas notas que estén entre  6 y 10 (inclusive)
// Finalmente, mostrar cada nota guardada.
// Nota: pueden usar Arreglos o ArrayList.
import java.util.Scanner;
import java.util.ArrayList;

public class Desafio10 {
    public static void main(String[] args) {
        ArrayList<Integer> arregloNotas = new ArrayList<Integer>();
        Scanner lector = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese la calificación (número negativo para salir): ");
            int nota = lector.nextInt();

            if ( nota < 0) {
                break;
            } else if ( nota >= 6 && nota <= 10) {
                arregloNotas.add(nota);
            }
        }
        lector.close();
        int largo = arregloNotas.size();
        for ( int i = 1; i < largo; i++ ){
            System.out.println(arregloNotas.get(i));
        }
    }
}
