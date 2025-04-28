package semana8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leer2 {

	public static void main(String[] args) {
		
		String archivoOrigen = "src/Archivos/contenido.txt";
		
		// Leer el archivo
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(archivoOrigen))) {
            String linea;
            // Recorro el archivo hasta encontrar su finalización
            while ((linea = bufferedReader.readLine()) != null) {
                System.out.println(linea); // Imprime cada línea del archivo
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
	}

}
