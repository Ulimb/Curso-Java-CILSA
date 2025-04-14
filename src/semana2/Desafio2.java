package semana2;

//Realizar un programa que solicite el ingreso de tu nombre y de tu apellido.
//La carga deberá realizarse en 2 variables diferentes.
//Luego deberá mostrar por pantalla Hola TUNOMBRE TUAPELLIDO.

import java.util.Scanner;


public class Desafio2 {

    public static void main(String[] args) {
        String nombre;
        String apellido;
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = lector.nextLine(); 
        System.out.print("Ingrese su apellido: ");
        apellido = lector.nextLine(); 
        lector.close(); 

        System.out.println("Hola " + nombre + " " + apellido);
    }
}