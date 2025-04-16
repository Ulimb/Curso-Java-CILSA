package semana3;

// Si el monto es 10,000 o más, aplica un descuento del 30%.
// Si el monto está entre 5000 y 9999, aplica un descuento del 20%.
// Si el monto es menor a 5000, no se aplica descuento, y se sugiere al cliente revisar los días de descuento en la web.
// El programa debe mostrar el precio con descuento (si aplica) o el mensaje de sugerencia.
import java.util.Scanner;

public class DesafioOpcional {
    
    public static void main(String[] args) {
        double montoCompra;
        double precioConDescuento;
        
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el monto de la compra: ");
        montoCompra = lector.nextDouble();
        lector.close();
        
        if (montoCompra >= 10000) {
            precioConDescuento = montoCompra * 0.7; // Aplica un descuento del 30%
            System.out.println("El precio con descuento es: " + precioConDescuento);
        } else if (montoCompra >= 5000 && montoCompra < 10000) {
            precioConDescuento = montoCompra * 0.8; // Aplica un descuento del 20%
            System.out.println("El precio con descuento es: " + precioConDescuento);
        } else {
            System.out.println("No se aplica descuento. Revise los días de descuento en la web.");
        }
    }
}