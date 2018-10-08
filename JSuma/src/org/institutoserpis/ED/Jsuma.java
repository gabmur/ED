package org.institutoserpis.ED;

import java.math.BigDecimal;
import java.util.Scanner;

public class Jsuma {

	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		System.out.println("introduce un numero: ");
		BigDecimal numero1 = new BigDecimal(tcl.nextLine());
		System.out.println("introduce otro numero: ");
		BigDecimal numero2 = new BigDecimal(tcl.nextLine());
		
		
		
		BigDecimal suma = numero1.add(numero2);
		BigDecimal resta =numero1.subtract(numero2);
		BigDecimal division = numero1.divide(numero2);
		BigDecimal producto = numero1.multiply(numero2);
		System.out.println("Primer numero"+ numero1);
		System.out.println("segundo numero"+ numero2);
		System.out.println("suma"+ suma);
		System.out.println("resta"+ resta);
		System.out.println("procusto"+ producto);
		System.out.println("division"+ division);
	}

}
