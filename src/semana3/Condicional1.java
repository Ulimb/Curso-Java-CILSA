package semana3;

public class Condicional1 {

	public static void main(String[] args) {
		
		// if: si
		// if-else: si sino
		
		
		
		int edad = 12;
		
		// estructura condicional simple
		if (edad>=18) {
			// codigo que queremos que se ejecute
			// se cumple que edad será igual o mayor a 18
			
			System.out.println("Sos mayor de edad!");
		}

		
		
		// estructura condicional doble
		// if-else
		if (edad>=18) {	
			System.out.println("Sos mayor de edad!");
		} else {
			System.out.println("Sos menor de edad.");
		}
	
		// estructura condicional multiple
		// if- else if -else
		
		if (edad<13) {
			System.out.println("Sos un niño/niña");
		} else if (edad<18) {
			System.out.println("Sos un adolescente");
		} else {
			System.out.println("Sos un adulto");
		}
		
	}

}
