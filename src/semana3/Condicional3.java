package semana3;

public class Condicional3 {

	public static void main(String[] args) {
		
		// switch-case
		
		int dia = 16;
		
		/*
		 * Tambien se puede con string
		 * String diaTexto = "Lunes";
		
		switch(diaTexto) {
			case "Lunes":
		 * */
		switch(dia) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
	            System.out.println("Martes");
	            break;
	        case 3:
	            System.out.println("Miércoles");
	            break;
	        case 4:
	            System.out.println("Jueves");
	            break;
	        case 5:
	            System.out.println("Viernes");
	            break;
	        case 6:
	            System.out.println("Sabado");
	            break;
	        case 7:
	            System.out.println("Domingo");
	            break;
	        default:
	        	System.out.println("El dia ingresado no corresponde con un dia de la semana.");
	        	break;
		}

		// int, char, byte, ...
		// string
		// enumeraciones (enum)
	}

}
