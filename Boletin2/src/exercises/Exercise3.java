package exercises;

import java.util.Scanner;

/***
 * Escribe un algoritmo que le pida al usuario dos números. A continuación debe
 * mostrar el siguiente menú por pantalla: 
 * SUMAR LOS NÚMEROS 
 * RESTAR LOS NÚMEROS
 * MULTIPLICAR LOS NÚMEROS 
 * DIVIDIR LOS NÚMEROS 
 * 
 * Después, el algoritmo debe
 * pedirle al usuario que selecciona una opción y que haga la operación que
 * marca esa opción, mostrando por último el resultado de la operación elegida
 * por el usuario. Si el usuario elige una opción incorrecta, el algoritmo se lo
 * hace saber al usuario y no haría nada.
 * 
 * 
 * @author misorna
 *
 */
public class Exercise3 {

	public static void main(String[] args) {
		// Bloque de variables
		int num1;
		int num2;
		int opcionMenu;
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario
		System.out.print("Introduzca dos números separados por un espacio: ");
		// Leemos de teclado
		num1 = sc.nextInt();
		num2 = sc.nextInt();

		// preguntamos por cuál operación realizar
		System.out.println("Escriba 1 si quiere SUMAR LOS NÚMEROS ");
		System.out.println("Escriba 2 si quiere RESTAR LOS NÚMEROS");
		System.out.println("Escriba 3 si quiere MULTIPLICAR LOS NÚMEROS");
		System.out.println("Escriba 4 si quiere DIVIDIR LOS NÚMEROS");
		
		opcionMenu = sc.nextInt();
		switch (opcionMenu) {
		case 1:
			System.out.println("El resultado sería "+ (num1 + num2));
			break;
		case 2:
			System.out.println("El resultado sería "+ (num1 - num2));
			break;
		case 3:
			System.out.println("El resultado sería "+ (num1 * num2));
			break;
		case 4:
			System.out.println("El resultado sería "+ (num1 / num2));
			break;
		default:
			System.out.println("La opción introducida es incorrecta");
			break;
		}

		// cerramos Scanner
		sc.close();

	}
}
