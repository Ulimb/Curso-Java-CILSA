package semana6;

// 1) Desarrollar la clase Rectangulo, la cual tendrá como propiedades privadas los "lados" (largo y ancho). Dentro de la clase deberá existir:
// un constructor por defecto que pondrá los valores en 0, y
// un constructor parametrizado que inicializará los lados del rectangulo, con lo valores que les llegue.
// A su vez se deberán crear dos métodos del tipo get, que permitirán obtener el perímetro y la superficie del rectangulo. 
// Perímetro = 2×(largo+ancho)
// Superficie = largo×ancho

// 2) Realice un programa (Main.java) que genere un objeto del tipo Rectangulo y utilice las herramientas creadas en el punto anterior.
// 3) Entregar cada uno individualmente.
// Edit: Pueden diseñar su clase con mas propiedades y/o más métodos que crean necesarios, que sean útiles.

import java.util.Scanner;

public class Desafio11 {

    
    static class Rectangulo {
        private double largo;
        private double ancho;

        public Rectangulo() {
            this.largo = 0;
            this.ancho = 0;
        }

        public Rectangulo(double largo, double ancho) {
            this.largo = largo;
            this.ancho = ancho;
        }

        public double getPerimetro() {
            return 2 * (largo + ancho);
        }

        public double getSuperficie() {
            return largo * ancho;
        }
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el largo del rectángulo: ");
        double largo = scanner.nextDouble();

        System.out.print("Ingrese el ancho del rectángulo: ");
        double ancho = scanner.nextDouble();

        Rectangulo miRectangulo = new Rectangulo(largo, ancho);

        System.out.println("Perímetro del rectángulo: " + miRectangulo.getPerimetro());
        System.out.println("Superficie del rectángulo: " + miRectangulo.getSuperficie());

        scanner.close();
    }
}

