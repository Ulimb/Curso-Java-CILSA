package semana8;

//"Escribir una lista de compras en un archivo txt."
//Nota: Deben crear una lista con productos y guardarlos en un txt.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DesafioOpcional {
    public static void main(String[] args) {
        
        String archivoDestino = "src/Archivos/lista_compras.txt"; // se encuentra en la raíz de la carpeta del proyecto.
        
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivoDestino))) {
            
            String linea1 = "Leche";
            String linea2 = "Pan";
            String linea3 = "Huevos";
            String linea4 = "Carne";
            String linea5 = "Verduras";
            
            // Escribir el archivo
            bufferedWriter.write(linea1);
            bufferedWriter.newLine();
            bufferedWriter.write(linea2);
            bufferedWriter.newLine();
            bufferedWriter.write(linea3);
            bufferedWriter.newLine();
            bufferedWriter.write(linea4);
            bufferedWriter.newLine();
            bufferedWriter.write(linea5);
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
