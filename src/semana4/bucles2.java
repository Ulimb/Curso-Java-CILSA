package semana4;

public class bucles2 {

	public static void main(String[] args) {
		
		// constante
		// upper snake case
		final int TOTAL_VUELTAS = 4;
		
		for(int vuelta=1; vuelta<=TOTAL_VUELTAS; vuelta++) {
			System.out.println("Corriendo la vuelta " + vuelta);
		}
		System.out.println("La carrera termino!");
	}

}
