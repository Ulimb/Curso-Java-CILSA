package semana8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir1 {

	public static void main(String[] args) {
		
		String archivo = "salida.txt";
		
		try
		{
			/* ¿No usamos la clase File?
			 * no es necesario usar explícitamente la clase File, porque FileWriter 
			 * acepta directamente una ruta en forma de String y él mismo se encarga de crear el archivo si no existe.
			 * 
			 * La clase File es útil si querés:
				  - Verificar si el archivo existe antes de escribir.
				  - Obtener propiedades como el tamaño, nombre, ruta absoluta, permisos, etc.
				  - Crear carpetas o trabajar con rutas más complejas.
				
			   Pero para este caso simple donde solo queremos escribir un texto en un archivo llamado "salida.txt", no hace falta usar File.
			 */
			
		    // crea un FileWriter para escribir en el archivo especificado (archivo debe existir o se crea)
		    FileWriter fileWriter = new FileWriter(archivo);

		    // envuelve el FileWriter en un BufferedWriter para escribir texto de forma más eficiente
		    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		    // escribe la primera línea en el archivo
		    bufferedWriter.write("Línea 1");

		    //agrega un salto de línea (como presionar Enter)
		    bufferedWriter.newLine();

		    // escribe la segunda línea en el archivo
		    bufferedWriter.write("Línea 3");

		    // cierra el BufferedWriter para guardar los cambios y liberar recursos
		    bufferedWriter.close();
		}
		catch (IOException e)
		{
		    // si ocurre un error al trabajar con archivos (por ejemplo, no se puede abrir o escribir),
		    // se imprime el detalle del error en la consola
		    e.printStackTrace();
		}

	}

}
