package semana2;

import java.util.Scanner;

public class NumerosOperadores {

	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 9;
		//System.out.println("El resultado de la suma de 10 con 9 es " + (numero1+numero2));
		
		
		// Declaración de variables de diferentes tipos de datos
		int numeroEntero = 10;
		double numeroDecimal = 5.5;
		char letra = 'A';
		boolean esVerdad = true; // true o false
		String texto = "David";
		
		
		System.out.println("Numero entero: " + numeroEntero);
		System.out.println("Numero decimal: " + numeroDecimal);
		System.out.println("Letra: " + letra);
		System.out.println("Booleano: " + esVerdad);
		System.out.println("Texto: " + texto);
		
		
		// Lectura de datos
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese un número: ");
		int numero = lector.nextInt();
		
		System.out.print("Ingrese una letra: ");
		char caracter = lector.next().charAt(0);
		
		System.out.println("Ingrese un valor booleano (true o false): ");
        boolean bool = lector.nextBoolean();
        
                
        System.out.println("Número entero ingresado: " + numero);
        System.out.println("Carácter ingresado: " + caracter);
        System.out.println("Valor booleano ingresado: " + bool);
               
        // cerrar el Scanner
        lector.close();
        
        
        
        // OPERADORES
        
        int a = 10;
        int b = 5;
        // aritmeticos: + - */ %

        
        
        
        // asignacion
        //int x = 10;
        
        // comparacion
        // == != > < <= >=
        boolean esIgual = (a == b);
        boolean esDiferente = (a != b);
        
        // Lógicos
        // Tabla de verdad
        // && --> AND, y --> tiene su propia t.v
        // || --> OR, O, Tabla de verdad
        // !  --> NOT, Tabla de verdad
        boolean condicion1 = (a > 5);   // true
        boolean condicion2 = (b < 30);  // true
        boolean resultado = condicion1 && condicion2;// cual es el resultado?
        System.out.println("Valor booleano ingresado: " + resultado);
        
        // incremento y decremento
        a++; // incrementa su valor en 1
        b--; // decrementa su valor en 1
        
        // Ternario...(avanzado. lo explicaremos luego.)
	}

}