package ejercicios;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// bloque de variables
		int numero=0;							// se guardara los numeros que mostremos
		double media=0; 							// se hara la media de los numeros introducidos
		int recuento=0;						// se iran sumando los numeros introducidos anteriormente
		
		// abrimos scanner
		Scanner sc=new Scanner(System.in);
		
		// creamos el bucle 
		
		for(int i=1;i<=10;i++) {
			System.out.println("Introduzca el "+i+"º numero");
			numero=sc.nextInt();
			recuento+=numero;
			media=(double)recuento/i;
		}
		System.out.println();
		System.out.println("La media de los numeros introducidos es " + media);
		
		// cerramos el Scanner 
		sc.close();
	}

}
