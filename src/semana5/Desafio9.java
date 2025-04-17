package semana5;

// Cargar un conjunto de notas utilizando una estructura de datos que guarde enteros.
// Luego mostrar el contenido de cada uno de los recursos.
// Nota: pueden usar Arreglos o ArrayList.
import java.util.Scanner;
import java.util.ArrayList;

public class Desafio9 {
    public static void main(String[] args) {
        ArrayList<Integer> arregloNotas = new ArrayList<Integer>();
        Scanner lector = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese la calificación (número negativo para salir): ");
            int nota = lector.nextInt();

            if ( nota < 0) {
                break;
            } else {
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
