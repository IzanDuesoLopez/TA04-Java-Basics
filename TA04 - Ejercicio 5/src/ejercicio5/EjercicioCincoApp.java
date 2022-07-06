package ejercicio5;

public class EjercicioCincoApp {

	public static void main(String[] args) {

		int a = 5, b = 10, c = 15, d = 20; // Declaramos las variables A, B, C y D

		// Mostramos las variables sin realizar las instrucciones necesarias para la toma de valores
		System.out.println("Variable A = " + a + "\nVariable B = " + b);
		System.out.println("Variable C = " + c + "\nVariable D = " + d);

		b = c; // B toma el valor de C
		c = a; // C toma el valor de A
		a = d; // A toma el valor de D
		d = b; // D toma el valor de D

		// Mostramos las variables despues de los cambios
		System.out.println("\nVariable A = " + a + "\nVariable B = " + b);
		System.out.println("Variable C = " + c + "\nVariable D = " + d);
	}

}
