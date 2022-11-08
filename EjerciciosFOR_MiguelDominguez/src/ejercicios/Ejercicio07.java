package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// bloque de variables
		int numero;					// nuemero introducido por el usuario
		int multiplicacion=1;					// se guardan los numeros desde el introducido hasta el 1
		
		// Scanner 
		Scanner sc=new Scanner(System.in);
		
		// preguntamos al usuario por el numero
		System.out.println("Introduzca un numero y te daré el factorial: ");
		numero=sc.nextInt();
		
		//creamos el bucle
		for (int i=numero;i>=1;i--) {
			multiplicacion*=i;
		}
		System.out.println("El factorial de "+numero+"! es: "+multiplicacion);
		
		//cerramos scanner
		sc.close();
	}

}
