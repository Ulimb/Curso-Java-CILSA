package semana5;

public class Arreglos1 {

	public static void main(String[] args) {
		
		// ARRAYS = Arreglos
		// Familiarizarnos con: [] e indices.
		
		// Inicializacion directa
		int [] numerosDirecta = {1,2,3,4};
		
		// Inicializacion posterior
		int [] numerosPosterior = new int[4];
		numerosPosterior[0] = 90;
		numerosPosterior[1] = 10;
		numerosPosterior[2] = 9;
		numerosPosterior[3] = 80;
		
		// Acceso a elementos
		int dato = numerosPosterior[1];
		// imprimir un elemento
		//System.out.println(dato);
		//System.out.println(numerosPosterior[1]);
		
		// Modificar: colocar el 100 como 3er elemento del arreglo (numerosPosterior)
		numerosPosterior[2] = 100;
		
		// Obtener tamaño del arreglo
		int tamanio = numerosPosterior.length;
		
		// Recorrer un arreglo (iterar)
		// mostrar en pantalla todos los elementos.
		
		// Bucle FOR
		for (int i=0; i<tamanio; i++) {
			System.out.println(numerosPosterior[i]);
		}
		// 1ra: numerosPosterior[0] , i=1
		// 2da: numerosPosterior[1] , i=2
		// 3ra: numerosPosterior[2] , i=3
		// 4ta: numerosPosterior[3] , i=4
		
		// Bucle for-each
		for (int numero : numerosPosterior) {
			System.out.println("Valor: " + numero);
		}
		
		
	}

}
