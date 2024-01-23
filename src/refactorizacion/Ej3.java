package refactorizacion;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);


		int primerNumero = scanner.nextInt();
		int segundoNumero = scanner.nextInt();

		if (primerNumero == segundoNumero) {

			if (primerNumero > segundoNumero) {
				System.out.println("El numero" + primerNumero + "es mayor");
			} else if (primerNumero < segundoNumero) {
				System.out.println("El numero" + segundoNumero + "es mayor");
			}
		} else if (primerNumero != segundoNumero) {
			System.out.println("No son iguales");
		}

	}
}
