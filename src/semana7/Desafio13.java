package semana7;

// Enunciado 2: Sistema de Gestión de Empleados. Crear un sistema simple que simule la gestion de empleados de una empresa. 
// Este sistema podría permitir por ejemplo: crear, agregar, listar y/o calcular salarios de diferentes tipos de empleados.

class Empleado {
    protected String id;
    protected String nombre;

    public Empleado(String id, String nombre) {
        this.id     = id;
        this.nombre = nombre;
    }

    // Por defecto devuelve 0; las subclases lo sobreescriben
    public double calcularSalario() {
        return 0;
    }

    public void mostrarSalario() {
        System.out.printf("ID: %s, Nombre: %s, Salario: %.2f%n",
                          id, nombre, calcularSalario());
    }
}

class EmpleadoAsalariado extends Empleado {
    private double salarioMensual;

    public EmpleadoAsalariado(String id, String nombre, double salarioMensual) {
        super(id, nombre);
        this.salarioMensual = salarioMensual;
    }

    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}

class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String id, String nombre,
                            double horasTrabajadas, double tarifaPorHora) {
        super(id, nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora   = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}

public class Desafio13 {
    public static void main(String[] args) {
        Empleado e1 = new EmpleadoAsalariado("A001", "Ana", 3050);
        Empleado e2 = new EmpleadoPorHoras  ("H001", "Luis", 120, 15);

        e1.mostrarSalario();
        e2.mostrarSalario();
    }
}


/*
Enunciado 1: Simulación simple de una carrera de Fórmula 1. Modelar autos y pilotos, realizar la simulación de una carrera, y determinar quién es el ganador. Cada piloto podría tener un valor que represente su habilidad y a partir de un calculo aleatorio (por ejemplo: usando Math.random) poder simular el movimiento (avance) de cada uno en cada vuelta.

Enunciado 3: Gestión de Eventos. Desarrollar un sistema para gestionar eventos, donde podrán crear y administrar eventos, así como registrar participantes y sus detalles. Un evento podría ser "Evento con catering", "EventoVirtual" o algun otro tipo de evento con sus caracteristicas propias diferenciales.

 */