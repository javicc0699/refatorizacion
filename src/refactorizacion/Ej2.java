package refactorizacion;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		System.out.println("Introduce un numero");
		int numeroIntroducido = scanner.nextInt();

		if (numeroIntroducido % 2 == 0) {
			System.out.println("Es par");

		} else if (numeroIntroducido % 2 != 0) {
			System.out.println("Es impar");
		}

	}

}
