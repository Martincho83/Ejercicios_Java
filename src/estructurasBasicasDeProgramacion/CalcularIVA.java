package estructurasBasicasDeProgramacion;

import java.util.Scanner;

//Programa que calcula el IVA (21%) de un precio ingresado:
public class CalcularIVA {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese un precio: ");
			double precio = scanner.nextDouble();
			double iva = precio * 0.21;
			System.out.println("El IVA (21%) de "+ precio + " es " +iva);
		}

	}

}
