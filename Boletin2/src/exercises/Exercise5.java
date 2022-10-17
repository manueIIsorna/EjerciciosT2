package exercises;

import java.util.Scanner;

/***
 * Queremos saber, una vez introducido un carnet de conducir, a qué corresponde.
 * Sabiendo: a) E: remolques. b) D: autobuses. c) C1-C5: camiones. d) A:
 * motocicletas. e) B1-B2: automóviles. f) En caso de introducir uno distinto:
 * “Categoría no contemplada”.
 * 
 * 
 * @author misorna
 *
 */
public class Exercise5 {

	public static void main(String[] args) {
		// Bloque de variables
		char carnetConducir;
		byte tipoC;
		byte tipoB;
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un carnet de conducir
		System.out.print("Introduzca que carnet posee: ");
		// Leemos de teclado
		carnetConducir = sc.next().charAt(0);

		// mostramos a que unidad pertenecería
		switch (carnetConducir) {
		case 'E', 'e':
			System.out.println("Remolques");
			break;
		case 'D', 'd':
			System.out.println("Autobuses");
			break;
		case 'C', 'c':
			System.out.print("Indique qué unidad exactamente: ");
			tipoC = sc.nextByte(); // Leemos de teclado la unidad introducida

			switch (tipoC) {
			case 1, 2, 3, 4, 5: {
				System.out.println("Camiones");
				break;
			}
			default:
				System.err.println("No existe un carnet dentro de ese rango");
			}
			break;
		case 'A', 'a':
			System.out.println("Motocicletas");
			break;
		case 'B', 'b':
			System.out.print("Indique qué unidad exactamente: ");
			tipoB = sc.nextByte(); // Leemos de teclado la unidad introducida

			switch (tipoB) {
			case 1, 2: {
				System.out.println("Automóviles");
				break;
			}
			default:
				System.err.println("No existe un carnet dentro de ese rango");
			}
			break;
		default:
			System.out.println("Categoría no contemplada");
			break;
		}

		// cerramos Scanner
		sc.close();

	}
}
