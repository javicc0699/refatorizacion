package refactorizacion;
import java.util.Scanner;
public class Ej4 {

	public static void main(String[] args) {
		//13. Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y
		//suspensos.
		var scanner = new Scanner(System.in);
		
		System.out.println("Introduce las notas: ");
int nota1 = scanner.nextInt();
int nota2 = scanner.nextInt();
int nota3 = scanner.nextInt();
int nota4 = scanner.nextInt();
int nota5 = scanner.nextInt();
int nota6 = scanner.nextInt();
int s = 0;
int c = 0;
int a = 0;
		
		if(nota1 == 4) {
			c++;
		}else if(nota1 < 4) {
			s++;
		}else if(nota1 >= 5) {
			a++;
		}
		
		if(nota2 == 4) {
			c++;
	}else if(nota2 < 4) {
			s++;
	}else if(nota2 >= 5) {
		a++;
		}
		
		if(nota3 == 4) {
			c++;
	}else if(nota3 < 4) {
			s++;
	}else if(nota3 >= 5) {
			a++;
		}
		
		
		if(nota4 == 4) {
			c++;
		}else if(nota4 < 4) {
			s++;
		}else if(nota4 >= 5) {
			a++;
		}
		
		
		if(nota5 == 4) {
			c++;
		}else if(nota5 < 4) {
			s++;
		}else if(nota5 >= 5) {
			a++;
		}
		
		if(nota6 == 4) {
			c++;
		}else if(nota6 < 4) {
			s++;
		}else if(nota6 >= 5) {
			a++;
		}
		
		System.out.println(c);
		System.out.println(s);
		System.out.println(a);
		
		
		
		


	}

}
