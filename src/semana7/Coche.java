package semana7;

public class Coche extends Vehiculo {
	
	@Override
    public void mover() {
		super.mover();
        System.out.println("El coche está conduciendo por la carretera.");
    }
}
