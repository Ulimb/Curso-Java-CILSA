package semana8;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Escribir2 {

	public static void main(String[] args) {
		
		String archivoDestino = "destino.txt"; // se encuentra en la raíz de la carpeta del proyecto.
		
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivoDestino))) {
			
			String linea = "Hola como estas?";
			
			// Escribir el archivo
			bufferedWriter.write(linea);
			bufferedWriter.newLine();
			bufferedWriter.write("Chau hasta la próxima!");
		} catch (IOException e) {
			System.err.println("Error al escribir en el archivo: " + e.getMessage());
		}
	}

}
