package refactorizacion;
import java.util.Scanner;
public class Ej2 {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		//BOLETÍN 3. Condicionales
		//1. Diseñar una aplicación que solicite al usuario un número e indique si es par o impar.
System.out.println("Introduce un numero");
int f = scanner.nextInt();

if(f % 2 == 0) {
	System.out.println("Es par");
	
}else if(f % 2 != 0) {
		System.out.println("Es impar");
}

		
		

	}

}
