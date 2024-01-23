package refactorizacion;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		var scanner = new Scanner(System.in);
		int numerosIntroducidos[] = new int[5];

		for (int i = 0; i < numerosIntroducidos.length; i++) {

			System.out.print("Introduce numero");
			numerosIntroducidos[i] = scanner.nextInt();

		}

		for (int i = 0; i < numerosIntroducidos.length; i++) {
			System.out.println(numerosIntroducidos[i]);
		}

	}

}
