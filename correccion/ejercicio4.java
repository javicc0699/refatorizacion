package correccion;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce las notas: ");
		int nota1 = sc.nextInt();
		int nota2 = sc.nextInt();
		int nota3 = sc.nextInt();
		int nota4 = sc.nextInt();
		int nota5 = sc.nextInt();
		int nota6 = sc.nextInt();
		int suspenso = 0;
		int condicionado = 0;
		int aprobado = 0;

		if (nota1 == 4) {
			condicionado++;
		} else if (nota1 < 4) {
			suspenso++;
		} else if (nota1 >= 5) {
			aprobado++;
		}

		if (nota2 == 4) {
			condicionado++;
		} else if (nota2 < 4) {
			suspenso++;
		} else if (nota2 >= 5) {
			aprobado++;
		}

		if (nota3 == 4) {
			condicionado++;
		} else if (nota3 < 4) {
			suspenso++;
		} else if (nota3 >= 5) {
			aprobado++;
		}

		if (nota4 == 4) {
			condicionado++;
		} else if (nota4 < 4) {
			suspenso++;
		} else if (nota4 >= 5) {
			aprobado++;
		}

		if (nota5 == 4) {
			condicionado++;
		} else if (nota5 < 4) {
			suspenso++;
		} else if (nota5 >= 5) {
			aprobado++;
		}

		if (nota6 == 4) {
			condicionado++;
		} else if (nota6 < 4) {
			suspenso++;
		} else if (nota6 >= 5) {
			aprobado++;
		}

		System.out.println(condicionado);
		System.out.println(suspenso);
		System.out.println(aprobado);
		
		sc.close();

	}

}
