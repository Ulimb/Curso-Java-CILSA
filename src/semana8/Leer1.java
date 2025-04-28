package semana8;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;

public class Leer1 {

	public static void main(String[] args) {
	
	    // Ruta del archivo a leer (puede ser relativa o absoluta)
	    File archivo = new File("archivo.txt");
	
	    try {
	        FileReader fileReader = new FileReader(archivo);
	        BufferedReader bufferedReader = new BufferedReader(fileReader);
	        String linea;
	        while ((linea = bufferedReader.readLine()) != null) {
	            System.out.println(linea);
	        }
	        bufferedReader.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

}
