package semana6;

public class Main {

	public static void main(String[] args) {
		//
		Persona p1 = new Persona();
		Persona p2 = new Persona("Diego", 29);
		
		p1.setNombre("Juan");
		p1.setEdad(30);

		//String nombre2 = p2.getNombre();
		System.out.println(p2.getNombre());
		
		// llamar al metodo saludar
		p1.saludar();
		p2.saludar();
	}

}
