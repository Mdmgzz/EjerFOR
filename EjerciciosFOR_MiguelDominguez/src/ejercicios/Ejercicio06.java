package ejercicios;

public class Ejercicio06 {

	public static void main(String[] args) {
		// bloque de variables
		int recuento=0;				//se van sumando los numero impares
		
		// creamos el bucle 
		for(int i=1;i<10;i+=2) {	// comienza en 1 y se finaliza cuando la variable supere 10 y aumenta de 2 en 2
			recuento+=i;			// va sumando los numeros generados por el loop 
		}
		System.out.println("la suma de los numeros impares del 1 al 10 es: "+recuento);	// muestra el resultado

	}

}
