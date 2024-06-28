package estructurasBasicasDeProgramacion;

import java.util.Scanner;

//Programa que calcula un descuento del 9% sobre un precio ingresado:
public class CalcularDescuento {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese el precio: ");
			double precio = scanner.nextDouble();
			double descuento = precio * 0.09;
			double precioConDescuento = precio - descuento;
			System.out.println("El precio con un descuento del 9% es: "+ precioConDescuento);
		}
	}

}
