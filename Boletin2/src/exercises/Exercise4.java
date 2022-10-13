package exercises;

import java.util.Scanner;

/***
 * Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que
 * haría el usuario. El algoritmo pregunta al usuario cuánto ha sacado en la
 * primera tirada y el usuario le dará esa información pero en formato cadena
 * (“UNO”, “DOS” … “SEIS”). Después el algoritmo volverá a preguntar al usuario
 * cuánto ha sacado en la segunda tirada y el usuario también dará esa
 * información en formato cadena. Por último, el algoritmo mostrará por pantalla
 * la suma de las dos tiradas en formato numérico.
 * 
 * @author misorna
 *
 */
public class Exercise4 {

	public static void main(String[] args) {
		// Bloque de variables
		int tirada1;
		int tirada2;
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario la primera tirada
		System.out.print("Introduzca cuanto le salió en la primera tirada: ");
		// Leemos de teclado
		tirada1 = sc.nextInt();

		// mostramos la tirada en formato cadena
		switch (tirada1) {
		case 1:
			System.out.println("UNO");
			break;
		case 2:
			System.out.println("DOS");
			break;
		case 3:
			System.out.println("TRES");
			break;
		case 4:
			System.out.println("CUATRO");
			break;
		case 5:
			System.out.println("CINCO");
			break;
		case 6:
			System.out.println("SEIS");
			break;
		default:
			System.out.println("Es imposible el número introducido");
			break;
		}

		// Pedimos al usuario por la segunda tirada
		System.out.print("Introduzca cuanto le salió en su segunda tirada: ");
		// Leemos de teclado
		tirada2 = sc.nextInt();

		// mostramos la segunda tirada en formato cadena
		switch (tirada2) {
		case 1:
			System.out.println("UNO");
			break;
		case 2:
			System.out.println("DOS");
			break;
		case 3:
			System.out.println("TRES");
			break;
		case 4:
			System.out.println("CUATRO");
			break;
		case 5:
			System.out.println("CINCO");
			break;
		case 6:
			System.out.println("SEIS");
			break;
		default:
			System.out.println("Es imposible el número introducido");
			break;
		}

		// Mostramos la suma de ambas tiradas en formato numérico
		System.out.println("La suma de ambas tiradas sería de " + (tirada1 + tirada2));

		// cerramos Scanner
		sc.close();

	}
}
