package ejercicios;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// bloque de variables
		double notas;				// se guardan las notas de los alumnos
		double contador=0;			// contará los suspensos
		
		//creamos el scanner
		Scanner sc=new Scanner(System.in);
		
		// creamos el bucle 
		for (int i=1;i<=5;i++) {
			System.out.println("Introduzca la nota: ");
			notas=sc.nextDouble();
			if (notas>10 || notas<0) {
				System.out.println("Introduce un numero correcto");
				i--;
			}
			if(notas<5) {
				contador++;
			}
			
		}
		if (contador !=0) {
			System.out.println("Hay "+(int)contador+" suspensos");
		}else {
			System.out.println("NO HAY SUSPENSOS");
		}
		// cerramos el scanner 
		sc.close();
		
	}
}
