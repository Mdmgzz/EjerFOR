package ejercicios;

public class Ejercicio02 {

	public static void main(String[] args) {
		//bloque de variables
		int contador=2;				// lleva la cuenta de los numeros
		
		// abrimos el bucle 
		for (int i=2;i!=200;i+=2) {
			System.out.println(contador);
			contador+=2;
		}
		System.out.println(contador);
		//cerramos el scanner
	}

}
