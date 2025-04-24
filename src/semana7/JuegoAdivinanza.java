package semana7;

import java.util.Scanner;

public class JuegoAdivinanza {

	public static void main(String[] args) {
		
		JuegoAdivinanza juego = new JuegoAdivinanza();
		juego.iniciarJuego();
		
	}
	
	public void iniciarJuego() {
		
		int numeroAleatorio = generarNumeroAleatorio();
		int intentos = 0;
		boolean adivinado = false;
		
		//Descomentar la siguiente linea para saber el numero y terminar.
		//System.out.println("Spoiler: el numero es " + numeroAleatorio); 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("¡Bienvenido al juego de adivinanza!");
		System.out.println("He elegido un número entre 1 y 100. ¿Puedes adivinar cuál es?");
		
		while (!adivinado) {
            System.out.print("Introduce tu suposición: ");
            int suposicion = scanner.nextInt();
            intentos++;
            
            if (suposicion < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (suposicion > numeroAleatorio) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                adivinado = true;
                System.out.println("¡Correcto! Adivinaste el número en " + intentos + " intentos.");
            }
        }
		scanner.close();
	}
	
	private int generarNumeroAleatorio() {
		return (int) (Math.random() * 100) + 1;
	}

}
