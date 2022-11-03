package ejercicios;

public class Ejercicio03 {

	public static void main(String[] args) {
		// bloque de variables
		int multiplos=1;					// guarda los multiplos
	
		// iniciamos bucle 
		 
		for( int i=1;i>100;i*=7 ) {
			System.out.println(multiplos);
			multiplos = multiplos*7;
		}
		System.out.println(multiplos);
		
	}

}
