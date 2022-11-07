package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// bloque de variables 
		int numerointro;					// se guarda el numero que introducimos
		int multiplos=1;					// en esta variable se realizaran las operaciones 

		// abrimos scanner
		Scanner sc= new Scanner(System.in);
		
		// preguntamos por el numero
		System.out.println("Introduzca un numero: ");
		numerointro=sc.nextInt();
		
		// creamos el bucle 
		
		for ( int i=1; multiplos<numerointro;i++) {
			System.out.println(multiplos);			// mostramos el resultado
			multiplos=i*3;							
			
		}
		// cerramos el Scanner
		sc.close();
	}

}
