package refactorizacion;
import java.util.Scanner;
public class Ej3 {
	public static void main(String[] args) {
		var scanner = new Scanner(System.in);
		
		//2. Pedir dos números enteros y decir si son iguales o si son distintos cuál es mayor.
		int numero = scanner.nextInt();
int n2 = scanner.nextInt();
		
		if(numero == n2) {
			
		if(numero > n2) {
	System.out.println("El numero" + numero + "es mayor");
}else if(numero < n2) {
System.out.println("El numero" + n2 + "es mayor");
}
		}else if(numero != n2) {
System.out.println("No son iguales");
		}
		
	}
}
