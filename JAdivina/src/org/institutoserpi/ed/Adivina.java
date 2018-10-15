package org.institutoserpi.ed;

import java.util.Random;

import java.util.Scanner;

public class Adivina {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Random random = new Random();
		int numeroAleatorio = random.nextInt(1000) + 1;
		System.out.println("adivina un numero entre 1 y 1000");
		int minimo =1;
		int maximo=1000;
		int cont=0;
		
		cont++;
		System.out.printf("inentalo de nuevo (entre %s y %s) [intento %s]:", minimo, maximo, cont);
		int numeroIntroducido = Integer.parseInt(scanner.nextLine());
		
		while (numeroIntroducido !=numeroAleatorio) {
			if(numeroIntroducido< numeroAleatorio) {
				System.out.println("es mayor que ese");
			minimo = numeroIntroducido+1;
			}

			else {
				System.out.println("es menor que ese");
			
				maximo= numeroIntroducido-1;
			}
			cont++;
			System.out.printf("inentalo de nuevo (entre %s y %s) [intento %s]:", minimo, maximo, cont);
			numeroIntroducido = Integer.parseInt(scanner.nextLine());
			
		}
		System.out.println("Enorabuena as acertado");
	}}
