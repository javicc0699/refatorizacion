package correccion;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double numeros[] = new double[5];

		for (int i = 0; i < numeros.length; i++) {

			System.out.print("Introduce numero:");
			numeros[i] = sc.nextDouble();

		}

		System.out.println(numeros[0]);
		System.out.println(numeros[1]);
		System.out.println(numeros[2]);
		System.out.println(numeros[3]);
		System.out.println(numeros[4]);

		sc.close();

	}

}
