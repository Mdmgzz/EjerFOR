package ejercicios;

public class Ejercicio03 {

	public static void main(String[] args) {
		// bloque de variables
		int multiplos=1;					// guarda los multiplos
	
		// iniciamos bucle 
		 
		for( int i=1;multiplos<100;i++ ) {			// empezamos el bucle en 1, se ejecuta mientras la variable sea menor que 100 y multiplica por 7
			System.out.println(multiplos);			// mostramos el resultado
			multiplos=i*7;							// multiplicamos la variale i por 7
		}
	}

}
