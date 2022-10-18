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
		//Aquí declaramos las variables donde se almacenarán las dos tiradas de dados
		String tirada1; 
		String tirada2;
		int valor1 = 0;
		int valor2 = 0;
		//Creo el Scanner
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario la primera tirada
		System.out.print("Introduzca cuanto le salió en la primera tirada: ");
		// Leemos de teclado
		tirada1 = sc.next();

		// mostramos la tirada en formato cadena
		switch (tirada1) {
		case "UNO", "uno":
			System.out.println("1");
			valor1 = 1;
			break;
		case "DOS", "dos":
			System.out.println("2");
			valor1 = 2;
			break;
		case "TRES", "tres":
			System.out.println("3");
			valor1 = 3;
			break;
		case "CUATRO", "cuatro":
			System.out.println("4");
			valor1 = 4;
			break;
		case "CINCO", "cinco":
			System.out.println("5");
			valor1 = 5;
			break;
		case "SEIS", "seis":
			System.out.println("6");
			valor1 = 6;
			break;
		default:
			System.out.println("Es imposible el número introducido");
			break;
		}

		// Pedimos al usuario por la segunda tirada
		System.out.print("Introduzca cuanto le salió en su segunda tirada: ");
		// Leemos de teclado
		tirada2 = sc.next();

		// mostramos la segunda tirada en formato cadena
		switch (tirada2) {
		case "UNO", "uno":
			System.out.println("1");
			valor2 = 1;
			break;
		case "DOS", "dos":
			System.out.println("2");
			valor2 = 2;
			break;
		case "TRES", "tres":
			System.out.println("3");
			valor2 = 3;
			break;
		case "CUATRO", "cuatro":
			System.out.println("4");
			valor2 = 4;
			break;
		case "CINCO", "cinco":
			System.out.println("5");
			valor2 = 5;
			break;
		case "SEIS", "seis":
			System.out.println("6");
			valor2 = 6;
			break;
		default:
			System.out.println("Es imposible el número introducido");
			break;
		}

		// Mostramos la suma de ambas tiradas en formato numérico
		System.out.println("La suma de ambas tiradas sería de " + (valor1 + valor2));

		// cerramos Scanner
		sc.close();

	}
}
