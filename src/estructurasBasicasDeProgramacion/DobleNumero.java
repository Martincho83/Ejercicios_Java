package estructurasBasicasDeProgramacion;

import java.util.Scanner;

//Programa que muestra el doble de un número ingresado:
public class DobleNumero {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese un número: ");
			int numero = scanner.nextInt();
			int doble = numero * 2;
			System.out.println("El doble de " + numero + " es " + doble);
		}
	}
}
