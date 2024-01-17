package refactorizacion;
import java.util.Scanner;
public class Ej1 {

	public static void main(String[] args) {
		
		//Ejercicio 1 del boletin 7.
		
		//1. Diseñar un programa que solicite al usuario que introduzca por teclado 5 números
		//decimales a continuación, debe mostrar los números en el mismo orden que se han
		//introducido.
		
var scanner = new Scanner(System.in);
int n[] = new int[5];
		
for(int i = 0 ; i < n.length ; i++) {
	
	System.out.print("Introduce numero");
			n[i] = scanner.nextInt();
			
}

System.out.println(n[0]);
System.out.println(n[1]);
System.out.println(n[2]);
System.out.println(n[3]);
System.out.println(n[4]);


	
		


	}

}
