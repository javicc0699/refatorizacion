package refactorizacion;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		// Ejercicio 1 del boletin 7.
		// 1. Diseñar un programa que solicite al usuario que introduzca por teclado 5
		// números decimales a continuación, debe mostrar los números en el mismo orden
		// que se han introducido.

		Scanner sc = new Scanner(System.in);
		int numeros[] = new int[5];

		for (int i = 0; i < numeros.length; i++) {

			System.out.print("Introduce numero");
			numeros[i] = sc.nextInt();

		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		sc.close();
	}
}