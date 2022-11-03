package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// bloque de variables
		int num;					// numero que introduce el usuario
		int conteo=1;				// cuenta que llevara y se mosrará
		
		// abrimos el Scanner 
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero y le enseñaré a contar: ");
		num=sc.nextInt();
		
		// comprobamos primero que el numero sea positivo 
		if (num<=0) {
			System.out.println("Introduzca un numero positivo.");
		}else {
		// abrimos el bucle 	
		for (int  i=1 ; i !=num; i ++) {
			System.out.println("Numero "+conteo);
			conteo++;
		}
		System.out.println("Numero "+conteo);
		}
		//cerramos el Scanner
		sc.close();
	}

}
