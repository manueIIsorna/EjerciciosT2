package exercises;

import java.util.Scanner;

/***
 * 
 * Idear un programa que solicite al usuario un número comprendido entre 1 y 7,
 * correspondiente a un día de la semana. Se debe mostrar el nombre del día de
 * la semana al que corresponde. Por ejemplo, el número 1 corresponde a “Lunes”
 * y el 6 a “Sábado”.
 * 
 * @author misorna
 *
 */
public class Exercise2 {

	public static void main(String[] args) {
		// Bloque de variables
		int numSemana;
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario
		System.out.print("Introduzca un numero comprendido entre 1 y 7: ");
		// Leemos de teclado
		numSemana = sc.nextInt();

		// mostramos el resultado segun el numero de la semana introducido
		switch (numSemana) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("El número introducido no entra dentro del rango semanal");
			break;
		}

		// cerramos Scanner
		sc.close();

	}
}
