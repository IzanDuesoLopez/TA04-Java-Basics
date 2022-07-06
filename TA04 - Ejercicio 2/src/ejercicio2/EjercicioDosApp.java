package ejercicio2;

public class EjercicioDosApp {

	public static void main(String[] args) {

		int n = 20;
		double a = 5.5;
		char c = 'x';
		double resultadoDecimal = 0.0;
		int valorNumericoC = c; // También podemos utilizar el metodo Character.getNumericValue(c);

		// Mostramos por consola el valor de cada variable
		System.out.println("Variable N = " + n + "\n" + "Variable A = " + a + "\n" + "Variable C = " + c);

		resultadoDecimal = n + a;
		System.out.println(n + " + " + a + " = " + resultadoDecimal); // Mostramos por consola la suma de N + A

		resultadoDecimal = a - n;
		System.out.println(n + " - " + a + " = " + resultadoDecimal); // Mostramos por consola la resta de N - A

		System.out.println("Valor numérico del carácter " + c + " = " + valorNumericoC); // Mostramos por consola el valor entero de X

	}

}
