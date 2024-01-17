package correccion;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		int num2;

		System.out.println("Introduce el primer número:");
		num = sc.nextInt();

		System.out.println("Introduce el segundo número:");
		num2 = sc.nextInt();

		if (num != num2) {

			if (num > num2) {
				System.out.println("El numero " + num + " es mayor");
			} else if (num < num2) {
				System.out.println("El numero " + num2 + " es mayor");
			}

		} else
			System.out.println("Son iguales");

		sc.close();
	}
}
