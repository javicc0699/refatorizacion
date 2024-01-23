package refactorizacion;


import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int aprobados = 0;
		int condicionados = 0;
		int suspensos = 0;

		for (int i = 1; i <= 6; i++) {
			System.out.print("Ingrese la nota del alumno " + i + ": ");
			int nota = scanner.nextInt();

			if (nota >= 5) {
				aprobados++;
			} else if (nota >= 4) {
				condicionados++;
			} else {
				suspensos++;
			}
		}

		System.out.println("Cantidad de alumnos aprobados: " + aprobados);
		System.out.println("Cantidad de alumnos condicionados: " + condicionados);
		System.out.println("Cantidad de alumnos suspensos: " + suspensos);
	}
}
