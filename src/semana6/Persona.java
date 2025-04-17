package semana6;

public class Persona {

	// atributos y metodos: variables y metodos/funciones
	private String nombre;
	private int edad;
	
	// Encapsulamiento
	// modificadores de acceso: public, private, protected
	// getters y setters: metodos get y set, controlar el acceso a los atributos.
	
	// Contructor: metodo especial. su nombre debe ser el de la clase (Persona)
	
	// 1- constructor por defecto
	
	public Persona() {
		// darle valores por defecto a mis atributos
		
		// nombre --> "sin nombre"
		// edad --> 0
		
		//this --> referencia al objeto que se ejecuta en ese momento
		this.nombre = "Sin nombre";
		this.edad = 0;
		
	}
	
	// 2- constructor parametrizado
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	
	// getters y setters
	
	public String getNombre() {
		return this.nombre;
	}
	public int getEdad() {
		return this.edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void saludar() {
		System.out.println("Hola soy " + this.nombre + " y tengo " + this.edad + " años.");
	}
	
}
