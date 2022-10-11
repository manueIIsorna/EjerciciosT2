package exercises;

import java.util.Scanner;

/***
 * 
 * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma:
 * insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y
 * sobresaliente (9 y 10).
 * 
 * @author misorna
 *
 */
public class Exercise1 {

	public static void main(String[] args) {
		// Bloque de variables
		int nota;
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario
		System.out.print("Introduzca la nota: ");
		// Leemos de teclado
		nota = sc.nextInt();

		// mostramos resultado segun la nota introducida
		switch (nota) {
		case 0, 1, 2, 3, 4:
			System.out.println("Insuficiente");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 7, 8:
			System.out.println("Notable");
			break;
		case 9, 10:
			System.out.println("Sobresaliente");
			break;
		default:
			System.out.println("Este valor no es valido");
			break;
		}

	}
}
