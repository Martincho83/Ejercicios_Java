package estructurasBasicasDeProgramacion;

import java.util.Scanner;

//Programa que calcula la edad de una persona dentro de 23 años:
public class EdadFutura {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingresa tu edad: ");
			int edad = scanner.nextInt();
			int edadFutura = edad + 23;
			System.out.println("En 23 años tendras "+ edadFutura + " años.");
		}
	}
}
