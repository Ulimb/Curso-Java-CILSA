package semana7;

public class Main {

	public static void main(String[] args) {
		
		// instanciamos un vehículo
		Vehiculo vehiculo = new Vehiculo();
		
		// invocar metodo
		vehiculo.mover();
		
		// Coche y Moto
		Vehiculo auto = new Coche();
		Vehiculo moto = new Moto();
		
		// invocamos los metodos
		auto.mover();
		moto.mover();
		
		// upcasting y downcasting: procesos de conversion entre clases (clases y subclases)
		
	}

}
