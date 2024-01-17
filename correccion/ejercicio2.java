package correccion;

import java.util.Scanner;

public class ejercicio2 {

	public static void parImpar(int numero) {

		if (numero % 2 == 0) {
			System.out.println("Es par");

		} else if (numero % 2 != 0) {
			System.out.println("Es impar");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero");
		int numero = sc.nextInt();

		parImpar(numero);

		sc.close();

	}

}
