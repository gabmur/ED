package org.institutoserpi.ed;

import java.util.Random;
import java.util.Scanner;

public class Adivina {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000) + 1;
		System.out.println("adivina un numero entre 1 y 1000");
		int numeroIntroducido = Integer.parseInt(scanner.nextLine());
		while (numeroIntroducido !=numeroAleatorio) {
			if(numeroIntroducido< numeroAleatorio)
				System.out.println("es mayor que ese");
			else
				System.out.println("es menor que ese");
			System.out.println("inentalo de nuevo");
			numeroIntroducido = Integer.parseInt(scanner.nextLine());
		}
		System.out.println("Enorabuena as acertado");
	}
}
