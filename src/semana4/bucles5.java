package semana4;

public class bucles5 {

	public static void main(String[] args) {
		
		int vuelta = 1;
		
		while (vuelta<=4) {
		    System.out.println("Corriendo la vuelta: " + vuelta);
		    vuelta++;
		    // quiero que en la vuelta 2, entre a boxes
		    if (vuelta==2) {
		    	System.out.println("estoy entrando a boxes");
		    }
		    if (vuelta == 3) {
		    	System.out.println("Debo abandonar... =C");
		    	break;
		    }
		    // instruccion x
		    continue;
		    // instruccion y
		}
		System.out.println("Termine mi carrera");
	}

	// break y continue
}
