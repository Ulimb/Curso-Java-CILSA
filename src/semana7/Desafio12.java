package semana7;

/*
Enunciado:
a. Desarrollar una clase llamada FigurasGeometricas que posea un constructor por defecto, un atributo del tipo String nombre y un método que se use para mostrar el nombre de la figura.

b. Desarrollar una clase llamada Triangulo que herede / derive de la clase anterior.

b.1- Generar un constructor parametrizado que reciba los 3 lados del triangulo

b.2- Generar un metodo bool EsTriangulo() el cual debe validar si los lados forman un triángulo válido según la desigualdad triangular.

Si cumple con las siguientes 3 condiciones, es un triangulo válido:

lado1 + lado2 > lado3
lado1 + lado3 > lado2
lado2 + lado3 > lado1
 
c. Generar un main que cree un objeto del tipo Triangulo y demuestre el funcionamiento de lo programado 
  
 */
class FigurasGeometricas {
    protected String nombre;

    public FigurasGeometricas() {
        this.nombre = "Figura Geométrica";
    }

    public void mostrarNombre() {
        System.out.println("Nombre de la figura: " + nombre);
    }
}

class Triangulo extends FigurasGeometricas {
    private double lado1;
    private double lado2;
    private double lado3;
    

    public Triangulo(double lado1, double lado2, double lado3) {
        super(); // Llama al constructor de FigurasGeometricas
        this.nombre = "Triángulo";
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public boolean esTriangulo() {
        return (lado1 + lado2 > lado3) &&
               (lado1 + lado3 > lado2) &&
               (lado2 + lado3 > lado1);
    }
}

public class Desafio12 {
    public static void main(String[] args) {
        
        Triangulo miTriangulo = new Triangulo(1, 3, 5);

        miTriangulo.mostrarNombre();

        if (miTriangulo.esTriangulo()) {
            System.out.println("Los lados forman un triángulo válido.");
        } else {
            System.out.println("Los lados NO forman un triángulo válido.");
        }
    }
}
