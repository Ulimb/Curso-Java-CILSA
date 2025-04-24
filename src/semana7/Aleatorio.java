package semana7;

public class Aleatorio {

	public static void main(String[] args) {
		
		double aleatorio = Math.random(); // entre 0.0 y 1.0
		System.out.println(aleatorio);
		
		/* 
		 Math.random() * 100) --> [0.0 hasta 100.0)
		 Math.random() * 100) + 1 --> [1.0 hsta 100.9991]
		 Si lo convertimos a int, tendremos de 1 hasta 100.
		*/
		int enteroAleatorio = (int) (Math.random() * 100) + 1;
		System.out.println(enteroAleatorio);
	}

}
