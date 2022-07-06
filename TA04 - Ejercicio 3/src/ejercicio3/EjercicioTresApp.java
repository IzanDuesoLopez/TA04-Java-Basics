package ejercicio3;

public class EjercicioTresApp {

	public static void main(String[] args) {

		int x = 70;
		int y = 30;
		double n = 55.5;
		double m = 44.5;
		int resultadoEntero = 0;
		double resultadoDecimal = 0.0;

		// Mostramos por consola todas las variables
		System.out.println("Variable X = " + x + "\nVariable Y = " + y + "\nVariable N = " + n + "\nVariable M = " + m);

		resultadoEntero = x + y;
		System.out.println("La suma X + Y = " + resultadoEntero); // Mostramos por consola la suma X + Y

		resultadoEntero = x - y;
		System.out.println("La resta X - Y = " + resultadoEntero); // Mostramos por consola la resta X - Y

		resultadoEntero = x * y;
		System.out.println("El producto X * Y = " + resultadoEntero); // Mostramos por consola el producto X * Y

		resultadoEntero = x / y;
		System.out.println("El cociente X / Y = " + resultadoEntero); // Mostramos por consola el cociente X / Y

		resultadoEntero = x % y;
		System.out.println("El resto X % Y = " + resultadoEntero); // Mostramos por consola el resto X % Y

		resultadoDecimal = n + m;
		System.out.println("La suma N + M = " + resultadoDecimal); // Mostramos por consola la suma N + M

		resultadoDecimal = n - m;
		System.out.println("La resta N - M = " + resultadoDecimal); // Mostramos por consola la resta N - M

		resultadoDecimal = n * m;
		System.out.println("El producto N * M = " + resultadoDecimal); // Mostramos por consola el producto N * M

		resultadoDecimal = n / m;
		System.out.println("El cociente N / M = " + resultadoDecimal); // Mostramos por consola el cociente N / M

		resultadoDecimal = n % m;
		System.out.println("El resto N % M = " + resultadoDecimal); // Mostramos por consola el resto N % M

		resultadoDecimal = x + n;
		System.out.println("La suma X + N = " + resultadoDecimal); // Mostramos por consola la suma X + N

		resultadoDecimal = y / m;
		System.out.println("El cociente Y / M = " + resultadoDecimal); // Mostramos por consola el cociente Y / M

		resultadoDecimal = y % m;
		System.out.println("El resto Y % M = " + resultadoDecimal); // Mostramos por consola el resto Y % M

		// Mostramos el doble de cada variable
		System.out.println("Variable X = " + (x * 2) + "\nVariable Y = " + (y * 2));
		System.out.println("Variable N = " + (n * 2) + "\nVariable M = " + (m * 2));

		resultadoDecimal = x + y + n + m;
		System.out.println("La suma de todas las variables = " + resultadoDecimal); // Mostramos por consola la suma de todas las variables
		
		resultadoDecimal = x * y * n * m;
		System.out.println("El producto de todas las variables = " +  resultadoDecimal); // Mostramos por consola el producto de todas las variables
																					
	}

}
