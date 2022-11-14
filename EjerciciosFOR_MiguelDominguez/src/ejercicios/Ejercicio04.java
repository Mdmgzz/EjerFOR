package ejercicios;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// bloque de variables 
		int numerointro;					// se guarda el numero que introducimos
		int contador=0;						// llevara la cuenta de los multiplos de 3

		// abrimos scanner
		Scanner sc= new Scanner(System.in);
		
		// preguntamos por el numero
		System.out.println("Introduzca un numero: ");
		numerointro=sc.nextInt();
		
		// creamos el bucle 
		for ( int i=3; i<=numerointro;i++) {		//Empezamos desde el numero 3, se ejecuta mientras la i sea menor que el numero introducido
																	
			if (i%3==0)								//comprobamos de 1 en 1 todos los numero si su modulo es 0
			contador++;								// si lo es entonces el valor de contador aumenta en 1 
			
		}
		System.out.println("Hay "+contador+" multiplos de 3");				// muestra el resultado
		// cerramos el Scanner
		sc.close();
	}

}
