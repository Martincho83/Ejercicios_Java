package estructurasBasicasDeProgramacion;

import java.util.Scanner;

//El programa en Java que divide una cantidad de fruta entre 3 chicos:
public class DividirFruta {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese la cantidad de fruta: ");
		int cantidadFruta = scanner.nextInt();
		double cantidadPorChico = (double) cantidadFruta / 3;
		System.out.println("Cada chico recibe "+ cantidadPorChico + " de fruta.");

	}

}
