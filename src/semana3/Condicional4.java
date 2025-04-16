package semana3;

public class Condicional4 {

	public static void main(String[] args) {
		
		/*
		 * Escribe un programa en Java que determine si una compra 
		 * es elegible para un descuento. 
		 * Si el total de la compra es de $5000 o más, se aplicará un 20% de descuento.

		   El programa debe:

			Mostrar un mensaje indicando que evaluará si corresponde un descuento.
			Comparar el monto total de la compra con el límite establecido.
			Si el monto es suficiente, calcular y mostrar el precio con descuento.
			Si no se alcanza el mínimo, informar que no aplica el descuento y 
			sugerir revisar los días de descuento.
		 * 
		 * */
		
		// puntos a tener en cuenta:
		// numero que represente el total de la compra
		// una variable para el porcentaje de descuento
		// que condiciones hay que evaluar?:
		// 	si la compra es mayor  o igual a 5000 --> aplicar un descuento
		//  si la compra es menor a 5000 --> no se aplica el descuento
		
		int totalCompra = 7000; // Cambia este valor para probar diferentes montos
	    double precioConDescuento;
	    double DESCUENTO = 0.2;
	    
	    System.out.println("En función de lo que gastaste vamos a evaluar si te corresponde un descuento");
		
	    if (totalCompra >= 5000) {
	        System.out.println("¡Felicitaciones! Te corresponde un descuento.");
	        precioConDescuento = totalCompra - (totalCompra * DESCUENTO);
	        System.out.println("El precio con descuento es: " + precioConDescuento);
	    } else {
	        System.out.println("El monto no permite realizar un descuento.");
	        System.out.println("Te sugerimos revisar los días de descuento en nuestra web.");
	    }
		

	}

}
